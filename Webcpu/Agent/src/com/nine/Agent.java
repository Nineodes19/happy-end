package com.nine;

import com.sun.management.OperatingSystemMXBean;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

public class Agent {
    public static void main(String[] args) {
        // 1. 动态从参数中获取信息
        if (args.length < 4) {
            System.out.println("请按顺序输入 hostname、汇报间隔、服务器 host、服务器 port");
            return;
        }

        String hostname = args[0];
        int interval = Integer.parseInt(args[1]);
        String serverHost = args[2];
        int serverPort = Integer.parseInt(args[3]);

        System.out.println("hostname = " + hostname);
        System.out.println("汇报间隔 = " + interval);
        System.out.println("服务器 host = " + serverHost);
        System.out.println("服务器 port = " + serverPort);

        OperatingSystemMXBean platformMXBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        try (DatagramSocket socket = new DatagramSocket()) {
            // 2. Agent 永久运行，所以是一个死循环
            while (true) {
                // 记录采集时间 + 采集到的CPU使用率
                long timestamp = System.currentTimeMillis() / 1000; // 时间戳以秒为单位
                double percent = platformMXBean.getSystemCpuLoad();

                // 按照事先约定好的协议格式，封装消息
                String message = String.format("%s$%d$%.4f", hostname, timestamp, percent);
                System.out.println(message);

                // 调用 JDK 提供的 UDP socket 编程 API，发送我们的消息
                byte[] bytes = message.getBytes("UTF-8");
                DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName(serverHost), serverPort);
                socket.send(packet);

                // 然后休眠“间隔”秒
                TimeUnit.SECONDS.sleep(interval);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
