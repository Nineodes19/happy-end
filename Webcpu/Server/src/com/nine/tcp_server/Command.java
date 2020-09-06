package com.nine.tcp_server;

import java.net.Socket;

public interface Command {
    // get hostname
    void run(Socket socket, String[] args);
}
