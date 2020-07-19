import com.sun.org.apache.xpath.internal.operations.String;

import java.net.*;
import java.util.Scanner;

/**
 * @program:test_7.19
 * @author:Nine_odes
 * @description:
 * @create:2020-07-19 09:55
 **/
public class UdpClient {
    public static final int DEST_PORT = 30000;

    private static final int DATA_LEN = 4096;
    private static final java.lang.String DEST_TP = "127.0.0.1";
    byte[] inBuff = new byte[DATA_LEN];

    private DatagramPacket packet_in = new DatagramPacket(inBuff,inBuff.length);

    private DatagramPacket packet_out = null;

    public void start(){
        try(DatagramSocket socket = new DatagramSocket()){
            InetAddress ip = InetAddress.getByName(DEST_TP);
            packet_out = new DatagramPacket(new byte[0],0,ip,DEST_PORT);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数据");
            java.lang.String key = null;
            byte[] keyBuff = null;
            while(sc.hasNextLine()){
                key = sc.nextLine();
                if("exit".equals(key)){
                    break;
                }
                keyBuff = key.getBytes();
                packet_out.setData(keyBuff);
                socket.send(packet_out);
                socket.receive(packet_in);
                //System.out.println(new String(inBuff,0,packet_in.getLength()));
                System.out.println("请输入数据：");
            }
            System.out.println("=======客户端退出======");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new UdpClient().start();
    }
}
