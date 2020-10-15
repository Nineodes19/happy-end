package com.jiuge;

import com.jiuge.tcp_server.TCPServer;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:28
 **/
public class Server {
    public static void main(String[] args) {
        UDPServer.startWork();
        TCPServer.startWork();
    }
}
