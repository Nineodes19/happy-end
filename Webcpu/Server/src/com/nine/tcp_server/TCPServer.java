package com.nine.tcp_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private static Thread worker;

    public static void startWork() {
        worker = new Thread() {
            @Override
            public void run() {
                setName("接待Client的线程");

                TCPServer server = new TCPServer();
                server.start();
            }
        };
        worker.start();
    }

    public void start() {
        CommandBuilder commandBuilder = new CommandBuilder();

        try (ServerSocket serverSocket = new ServerSocket(8001)) {
            while (true) {
                Socket socket = serverSocket.accept();
                // 1. 得到了三次握手后的连接

                commandBuilder.buildAndRun(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
