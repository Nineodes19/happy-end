package com_Nineodes;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-08-08 09:35
 **/


import com_Nineodes.storage.Storage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Listener {
    private static Thread worker;
    private static final Map<String, List<Socket>> subscribers = new ConcurrentHashMap<>();

    // 谁（socket）订阅了哪份报纸（hostname）的信息
    public static void subscribe(Socket socket, String hostname) {
        List<Socket> socketList = subscribers.computeIfAbsent(hostname, k -> new ArrayList<>());

        synchronized (socketList) {
            socketList.add(socket);
        }
    }

    private static byte[] reportDataToBytes(ReportData reportData) throws UnsupportedEncodingException {
        String message = String.format("%s$%d$%f\r\n", reportData.hostname, reportData.timestamp, reportData.percent);
        return message.getBytes("ASCII");
    }

    // 参数中的 socketList 已经被复制过的了，所以不需要考虑线程安全
    private static void pushMessage(String hostname, ReportData reportData, List<Socket> socketList) {
        for (Socket socket : socketList) {
            try {
                socket.getOutputStream().write(reportDataToBytes(reportData));
                socket.getOutputStream().flush();
            } catch (IOException e) {
                unsubscribe(hostname, socket);
            }
        }
    }

    private static void unsubscribe(String hostname, Socket socket) {
        List<Socket> socketList = subscribers.get(hostname);
        if (socketList == null) {
            return;
        }

        synchronized (socketList) {
            socketList.remove(socket);
            if (socketList.size() == 0) {
                subscribers.remove(hostname);
            }
        }

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void work() throws InterruptedException {
        for (String hostname : subscribers.keySet()) {
            ReportData reportData = Storage.getNewestReportData(hostname);
            if (reportData == null) {
                continue;
            }
            List<Socket> socketList = subscribers.get(hostname);
            if (socketList == null) {
                continue;
            }
            List<Socket> socketListCopy;
            synchronized (socketList) {
                socketListCopy = new ArrayList<>(socketList);
            }

            pushMessage(hostname, reportData, socketListCopy);
        }

        TimeUnit.SECONDS.sleep(1);
    }

    public static void startWork() {
        worker = new Thread() {
            @Override
            public void run() {
                setName("发报员线程");

                while (true) {
                    try {
                        work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        worker.start();
    }
}

