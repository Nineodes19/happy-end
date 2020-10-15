package com.jiuge.tcp_server;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:55
 **/
public class CommandBuilder {
    //根据从socket中读取的内容，判断接下来怎么办
    public void bulidAndRun(Socket socket) {
        try {
            //按行读取client发送的命令
            //支持两种命令：list/get
            Scanner sc = new Scanner(socket.getInputStream());
            if (!sc.hasNextLine()) {
                return;
            }
            String line = sc.nextLine();
            String[] group = line.split(" ");
            String commandName = group[0];
            String[] args = Arrays.copyOfRange(group,1,group.length);
            Command command;
            if (commandName.equals("list")) {
                command = new ListCommand();
            } else if (commandName.equals("get")) {
                command = new GetCommand();
            } else {
                command = new NotFoundCommand();
            }
            command.run(socket,args);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
