package com.jiuge.tcp_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:42
 **/
public class TCPServer {
    private static Thread worker;
    public static void startWork(){
        worker = new Thread(){
            public void run(){
                setName("接待Client的线程");

                TCPServer server = new TCPServer();
                server.start();
            }
        };
    }
    public void start(){
        CommandBuilder commandBuilder = new CommandBuilder();
        try(ServerSocket serverSocket = new ServerSocket(8001)){
            while(true){
                Socket socket = serverSocket.accept();
                //1.得到了三次握手后的链接
                commandBuilder.bulidAndRun(socket);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
