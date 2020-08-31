import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

/**
 * @program:test_8.31
 * @author:Nine_odes
 * @description:
 * @create:2020-08-31 23:28
 **/
public class UdpServer {
    /**
     * UDP协议;
     * 传输层协议、无连接、不可靠传输、面向数据报
     */
    public static void main(String[] args){
        new UdpServer().start();
    }
    //定义UDP端口号
    public static final int PORT = 30000;
    private static final int DATA_LEN = 4096;
    byte[] buff_in = new byte[DATA_LEN];
    //以指定字节数组创建准备接受数据的DatagramPacket对象，需要数组以及数组长度
    private DatagramPacket packet_in = new DatagramPacket(buff_in,buff_in.length);
    //一个用于发送的DatagramPacket对象
    private DatagramPacket packet_out;
    public void start() {
        try(DatagramSocket socket = new DatagramSocket(PORT)){
            String word = null;//客户端输入
            SocketAddress address = null;//获取客户端对象，通过对象将数据写给对方，否则没有目的地
            byte[] reviceData = null;//返回给客户端的数据
            System.out.println("服务器启动了.....");
            while(true){
                //读取socket中的数据，然后将数据封装到packet_in 中
                socket.receive(packet_in);
                //获取客户端输入的数据
                buff_in = packet_in.getData();
                //将byte数组转换为字符串，需要去掉后面的空格
                word = new String(buff_in,buff_in.length).trim();
                System.out.println("客户端输入的是：" + word);
                address = packet_in.getSocketAddress();
                //检查退出条件
                if("down".equals(word)){
                    //reviceData是需要返回给客户端的数据，getBytes() 可以将数据转化为字节
                    reviceData = "服务器关闭了，请重试".getBytes();
                    packet_out = new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                    break;
                }else{
                    //构建服务器发送给客户端的数据
                    reviceData = ("你输入的英文单词是：" + word).getBytes();
                    //构建packet_out发送数据
                    packet_out = new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                }

            }
        }  catch (Exception e) {
            e.printStackTrace();
            System.out.println("=======服务器关闭======");
        }
    }
}
