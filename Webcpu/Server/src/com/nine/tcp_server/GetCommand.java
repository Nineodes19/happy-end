package com.nine.tcp_server;

import com.nine.Listener;

import java.io.IOException;
import java.net.Socket;

public class GetCommand implements Command {
    @Override
    public void run(Socket socket, String[] args) {
        try {
            if (args.length == 0) {
                socket.close();
            }

            String hostname = args[0];
            Listener.subscribe(socket, hostname);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
