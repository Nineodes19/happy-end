package Client;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 14:38
 **/
public class UdpClient {
    public static final int DEST_PORT = 30000;
    public static final String DEST_IP = "127.0.0.1";
    private static final int DATA_LEN = 4096;

    byte[] inBuff = new byte[DATA_LEN];

    //创建接受回复数据的DatagramPacket对象
    private DatagramPacket packet_in = new DatagramPacket(inBuff,inBuff.length);
    private DatagramPacket packet_out = null;//定义一个用于发送的DatagramPacket对象

    public void start() throws IOException {
        try(DatagramSocket socket = new DatagramSocket()){
            InetAddress ip = InetAddress.getByName(DEST_IP);
            packet_out = new DatagramPacket(new byte[0],0,ip,DEST_PORT);

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数据");
            String key = null;
            byte[] keyBuff = null;
            while(sc.hasNextLine()){
                key = sc.nextLine();
                if("exit".equals(key)){
                    break;
                }
                keyBuff = key.getBytes();//将输入的字符串转化为字节数组
                packet_out.setData(keyBuff);//设置发送用的DatagramPacket里的字节数据
                socket.send(packet_out);
                socket.receive(packet_in);
                System.out.println(new String(inBuff,0,packet_in.getLength()));
                System.out.println("请输入数据:");

            }
            System.out.println("===客户端退出===");
        }
    }

    public static void main(String[] args) throws IOException {
        new UdpClient().start();
    }
}
