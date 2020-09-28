package Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 14:02
 **/
public class UdpServer {
    public static void main(String[] args) {
        new UdpServer().start();
    }

    public static final int PORT = 30000;//UDP 端口号
    private static final int DATA_LEN = 4096;//每个数据包最大4K
    byte[] buff_in = new byte[DATA_LEN];//接受网络数据的字节数组
    private DatagramPacket packet_in = new DatagramPacket(buff_in,buff_in.length);

    private DatagramPacket packet_out;
    public void start(){
        try(DatagramSocket socket = new DatagramSocket(PORT)){
            String word = null;//客户端输入的数据
            SocketAddress address = null;//获取客户端对象，通过该对象数据写给对方，否则没有目的地
            byte[] reviceData = null;//返回给客户端的数据
            System.out.println("服务端启动了");
            while(true){
                socket.receive(packet_in);//读取socket中的数据，然后将数据封装到packet_in中
                buff_in = packet_in.getData();//获取客户端输入的数据
                word = new String(buff_in,0,buff_in.length).trim();//将byte数组转化为字符串，去空格
                System.out.println("客户端输入的是：" + word);
                address = packet_in.getSocketAddress();
                if("down".equals(word)){
                    reviceData = "服务器关闭了，请重试".getBytes();
                    packet_out = new DatagramPacket(reviceData,reviceData.length,address);
                    break;
                }else{
                    reviceData = ("你输入的英文单词是：" + word).getBytes();
                    packet_out = new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("=====服务器关闭=====");
        }
    }
}
