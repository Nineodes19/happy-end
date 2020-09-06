package laboratory;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendUDPDatagram {
    public static void main(String[] args) throws IOException {
        String serverHost = "127.0.0.1";
        int port = 8888;

        String message = "您吃了么？没吃回家吃去吧！";

        // 1. 创建 UDP Socket： socket 是 OS 提供的，使用传输层以下网络服务的窗口
        try (DatagramSocket socket = new DatagramSocket()) {
            // 2. 网络传输，是传输的字节数据，所以，我们先将字符数据转化为字节数据
            byte[] bytes = message.getBytes("UTF-8");
            // 3. 按照 JDK 提供的方法，封装处一个 DatagramPacket，表示要发送的数据报文
            DatagramPacket sendPacket = new DatagramPacket(
                    bytes, 0, bytes.length,         // 把要发送的字节数据和发送的报文关联起来
                    InetAddress.getByName(serverHost), port // 发给谁（对方的 ip 和 port)
            );

            // 通过 socket，使用 UDP 协议发送数据报文（发送关联着的数据，message 的字节形态））
            socket.send(sendPacket);
        }
    }
}
