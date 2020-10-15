package laboratory;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program:Agent
 * @author:Nine_odes
 * @description:
 * @create:2020-09-29 00:05
 **/
public class SendUDPDatagram {
    public static void main(String[] args) throws IOException {
        String serverHost = "127.0.0.1";
        int port = 8888;

        String message = "您吃了么？没吃回家吃去吧！";
        //1.创建UDP Socket ： socket是OS提供的，使用传输层以下网络服务的窗口
        try(DatagramSocket socket = new DatagramSocket()){
            //网络传输，是传输的字节数据
            byte[] bytes = message.getBytes("UTF-8");
            DatagramPacket sendPacket = new DatagramPacket(
                    bytes,0,bytes.length,
                    InetAddress.getByName(serverHost),port//发给谁
            );
            socket.send(sendPacket);
        }
    }
}
//