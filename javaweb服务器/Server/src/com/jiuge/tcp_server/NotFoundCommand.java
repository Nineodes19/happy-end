package com.jiuge.tcp_server;

import com.jiuge.tcp_server.Command;

import java.net.Socket;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 21:08
 **/
public class NotFoundCommand implements Command {
    @Override
    public void run(Socket socket, String[] args) {

    }
}
