package com.nine.tcp_server;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class CommandBuilder {
    // 根据从 socket 中读取的内容，判断接下来怎么办
    public void buildAndRun(Socket socket) {
        try {
            // 按行读取 client 发送的命令
            // 目前支持两种命令: list / get
            Scanner scanner = new Scanner(socket.getInputStream());
            if (!scanner.hasNextLine()) {
                return;
            }

            String line = scanner.nextLine();
            String[] group = line.split(" ");





            String commandName = group[0];
            String[] args = Arrays.copyOfRange(group, 1, group.length);
            Command command;
            if (commandName.equals("list")) {
                command = new ListCommand();
            } else if (commandName.equals("get")) {
                command = new GetCommand();
            } else {
                command = new NotFoundCommand();
            }
            command.run(socket, args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
