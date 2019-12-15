import java.net.InetSocketAddress;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:20
 */
public class PortTest {
    public static void main(String[] args) {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress socketAddress2 = new InetSocketAddress("localhost",9000);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getAddress());
        System.out.println(socketAddress2.getAddress());
        System.out.println(socketAddress2.getPort());
    }
}
