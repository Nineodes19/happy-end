package com.nine;

import com.nine.tcp_server.TCPServer;

public class Server {
    public static void main(String[] args) {
        UDPServer.startWork();
        TCPServer.startWork();
        Listener.startWork();
    }
}
