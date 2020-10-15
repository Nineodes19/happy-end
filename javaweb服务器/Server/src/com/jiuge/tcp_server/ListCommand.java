package com.jiuge.tcp_server;

import com.jiuge.storage.Storage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:48
 **/
//实现了对list命令的支持
    //按照：
    //hostname1\r\n
    //hostname2\r\n把响应告诉对方
public class ListCommand implements Command {
    @Override
    public void run(Socket socket, String[] args){
       try {
           List<String> hostnameList = Storage.listHostname();
           PrintWriter writer = new PrintWriter(socket.getOutputStream());
           for(String hostname:hostnameList){
               writer.printf("%s\r\n",hostname);
           }
           writer.flush();
           socket.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
