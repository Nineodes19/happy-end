import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:29
 */
public class QuoteClient {
    public static void main(String[] args) throws IOException {
        if(args.length != 1){
            System.out.println("Usage:java QuoteClient<hostname>");
            return;
        }

        DatagramSocket socket  = new DatagramSocket();
        byte[] buf = new byte[256];
        InetAddress address = InetAddress.getByName(args[0]);
        DatagramPacket packet = new DatagramPacket(buf,buf.length,address,4445);
        socket.send(packet);
        packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);
        String received = new String(packet.getData());
        System.out.println("Quote of the Moment:" +received);
        socket.close();
    }
}
