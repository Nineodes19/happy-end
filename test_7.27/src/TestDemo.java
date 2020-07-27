/**
 * @program:test_7.27
 * @author:Nine_odes
 * @description:
 * @create:2020-07-27 19:00
 **/
import sun.net.spi.nameservice.dns.DNSNameService;
public class TestDemo {
    public static void main(String[] args) {
        ClassLoader classLoader = TestDemo.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
        ClassLoader classLoader2 = DNSNameService.class.getClassLoader();
        System.out.println(classLoader2);
    }
}
