package code5;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:28
 */
public class DataTest {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.put('x');
        s.put('y');
        s.put('z');
        System.out.println("In Stack:");
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
