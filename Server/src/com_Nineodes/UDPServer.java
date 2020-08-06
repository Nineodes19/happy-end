package com_Nineodes;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-08-05 18:38
 **/
public class UDPServer {
    private static Thread worker;
    public static void startworker(){
        worker = new Thread(){
            @Override
            public void run() {
                setName("收集上报的线程");
                UDPServer server = new UDPServer();
                server.start();
            }
        };
        worker.start();
    }
    public static void start(){
        try(DatagramSocket socket = new DatagramSocket(8000)){
            byte[] buffer = new byte[1024];
            while(true){
                Arrays.fill(buffer,(byte)0);
                DatagramPacket receivePacket = new DatagramPacket(buffer,0,buffer.length);
                socket.receive(receivePacket);

                String message = new String(buffer,0,receivePacket.getLength(),"ASCII");
                String[] group = message.split("\\$");
                String hostname = group[0];
                System.out.println("收到来自 " + hostname + "上报的数据");
                long timestamp = Long.parseLong(group[1]);
                double percent = Double.parseDouble(group[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
