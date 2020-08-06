package com_Nineodes;

import com.sun.management.OperatingSystemMXBean;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;

/**
 * @program:Agent
 * @author:Nine_odes
 * @description:
 * @create:2020-07-30 20:36
 **/
public class Agent {
    public static void main(String[] args) throws IOException {
        if(args.length < 4){
            System.out.println("请按顺序输入");
            return;
        }
        String hostname = args[0];
        int interval = Integer.parseInt(args[1]);
        String  serverHost = args[2];
        int serverPort = Integer.parseInt(args[3]);
        System.out.println("hostname = " + hostname);
        System.out.println("汇报间隔 = "+ interval);
        System.out.println("服务器host = " + serverHost);
        System.out.println("serverPort =" + serverPort);

        OperatingSystemMXBean platformMxBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        try(DatagramSocket socket = new DatagramSocket()) {
            //2.Agent永久运行，所以是一个死循环
            while (true) {
                //记录采集时间+采集到的CPU使用率
                long timestamp = System.currentTimeMillis()/1000;
                double percent = platformMxBean.getSystemCpuLoad();
                //按照事先约定好的协议格式封装消息
                String message = String.format("%s$%d$%.4f",hostname,timestamp,percent);
                System.out.println(message);
                byte[] bytes = message.getBytes("UTF-8");
                //3.按照JDK提供的方法，封装出一个DatagramPacket，表示要发送的数据报文。
                DatagramPacket sendpacket = new DatagramPacket(
                        bytes,0,bytes.length
                );
                //把要发送的字节数和发送的报文关联起来发送给谁（对方的IP和port
                //通过Socket，使用UDP协议
                socket.send(sendpacket);
                //然后休眠“间隔”秒
                TimeUnit.SECONDS.sleep(interval);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
