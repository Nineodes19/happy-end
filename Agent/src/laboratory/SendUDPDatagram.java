package laboratory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @program:Agent
 * @author:Nine_odes
 * @description:
 * @create:2020-07-30 19:59
 **/
public class SendUDPDatagram {
    public static void main(String[] args) throws IOException {
        String serverHost = "127.0.0.1";
        int port = 8888;

        String message = "您吃了么？";
        //1.创建UDP Socket，socket是OS提供的，使用传输层以下网络服务的窗口
        try(DatagramSocket socket = new DatagramSocket()){
            //2.网络传输，是传输的字节数，所以我们先将字符数据转化为字节数据
            byte[] bytes = message.getBytes("UTF-8");
            //3.按照JDK提供的方法，封装出一个DatagramPacket，表示要发送的数据报文。
            DatagramPacket sendpacket = new DatagramPacket(
                    bytes,0,bytes.length
            );
            //把要发送的字节数和发送的报文关联起来发送给谁（对方的IP和port
            //通过Socket，使用UDP协议
            socket.send(sendpacket);
        }
    }
}
