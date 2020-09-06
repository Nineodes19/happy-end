package com.nine.tcp_server;

import com.nine.storage.Storage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

// 实现了对 list 命令的支持
// 按照:
// hostname1\r\n
// hostname2\r\n
// ...
// 把响应告诉对方
// by 接待Client的线程
public class ListCommand implements Command {
    @Override
    public void run(Socket socket, String[] args) {
        try {
            List<String> hostnameList = Storage.listHostname();
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            for (String hostname : hostnameList) {
                writer.printf("%s\r\n", hostname);
            }
            writer.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
