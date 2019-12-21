package code1;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:19
 */
public class OverloadDemo {
    void testOverload(int i){
        System.out.println("int");
    }

    void testOverload(String s){
        System.out.println("String");
    }

    public static void main(String[] args) {
        OverloadDemo a = new OverloadDemo();
        char ch = 'x';
        a.testOverload(ch);
        String s = "jiuge";
        a.testOverload(s);
    }
}
