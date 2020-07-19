import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;

/**
 * @program:test_7.19
 * @author:Nine_odes
 * @description:
 * @create:2020-07-19 09:40
 **/
public class UdpServer {

    public static final int PORT = 30000;
    private static final int DATA_LEAN = 4096;
    byte[] buff_in = new byte[DATA_LEAN];

    //以指定字节数组创建准备接受数据报的DatagramPacket对象
    private DatagramPacket packet_in = new DatagramPacket(buff_in,DATA_LEAN);

    private DatagramPacket packet_out;

    public void start(){
        try(DatagramSocket socket = new DatagramSocket(PORT)){
            String word = null;
            //获取客户端对象，通过该对象将数据写给对方
            SocketAddress address = null;
            byte[] reviceData = null;
            System.out.println("服务端启动了");
            while(true){
                socket.receive(packet_in);
                buff_in = packet_in.getData();
                word = new String(buff_in,0,buff_in.length).trim();
                System.out.println("客户端输入的是： " +word);
                address = packet_in.getSocketAddress();

                if("down".equals(word)){
                    reviceData = "服务器关闭了，请重试".getBytes();
                    packet_out = new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                    break;
                }else{
                    reviceData = ("你输入的英文单词是： " + word).getBytes();
                    packet_out = new DatagramPacket(reviceData,reviceData.length,address);
                    socket.send(packet_out);
                }
            }
        }catch(Exception e){
            e.printStackTrace();;
            System.out.println("======服务端关闭=====");
        }
    }
    public static void main(String[] args) {
        new UdpServer().start();
    }
}
