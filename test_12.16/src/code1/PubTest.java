package code1;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:类PubTest
 * @create:2019-12-16 19:53
 */
public class PubTest {
    public static void main(String[] args) {
        Pub obj = new Pub();
        obj.set_x(3);
        obj.x = 10;
        obj.show_x();

        System.out.println(" x = " + obj.x);
    }
}
