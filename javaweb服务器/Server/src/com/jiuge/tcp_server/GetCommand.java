package com.jiuge.tcp_server;

import com.jiuge.Listener;

import java.io.IOException;
import java.net.Socket;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:55
 **/
public class GetCommand implements Command {
    @Override
    public void run(Socket socket, String[] args) {
        try{
            if(args.length == 0){
                socket.close();
            }
            String hostname = args[0];
            Listener.register(socket,hostname);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
