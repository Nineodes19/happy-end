package com.jiuge.tcp_server;

import java.net.Socket;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:48
 **/
public interface Command {
    void run(Socket socket,String[] args);
}
