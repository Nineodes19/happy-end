package com.jiuge;

import com.jiuge.storage.Storage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 17:04
 **/
public class UDPServer {

    private static Thread worker;
    public static void startWork(){
        //1.按照预演阶段的成功，完成对数据的采集
        //2.创建一个线程完成该工作

        worker = new Thread(){
            public  void run(){
                setName("收集上报的线程");

                UDPServer server = new UDPServer();
                server.start();
            }
        };
        worker.start();
    }

    public void start(){
        try(DatagramSocket socket = new DatagramSocket(8000)){
            byte[] buffer = new byte[1024];
            while(true){
                Arrays.fill(buffer,(byte)0);
                DatagramPacket receivePacket = new DatagramPacket(buffer,0,buffer.length);

                socket.receive(receivePacket);

                String message = new String(buffer,0,receivePacket.getLength(),"ASCII");
                String[] group = message.split("\\$");
                String hostname = group[0];
                System.out.println("收到来自" + hostname + "上报的数据");
                long timestamp = Long.parseLong(group[1]);
                double percent = Double.parseDouble(group[2]);

                Storage.put(hostname,timestamp,percent);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
