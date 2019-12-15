import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:15
 */
public class GetIp {
    public static void main(String[] args) {
        try {
            System.out.println("本机IP为："+InetAddress.getByName(args[0]));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
