package review;

/**
 * @program:test_7.12
 * @author:Nine_odes
 * @description:
 * @create:2020-07-12 16:01
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > b && b>a );
        System.out.println(a > b || b > a);
        System.out.println(10 > 20 && 10/0 == 0);
        /**
         *  1010
         * 10100
         * 11110 = 16+8+4+2 = 30
         */
        System.out.println(10 & 20);
        System.out.println(10|20);
        System.out.println(10^20^20);
        //按位异或：相同为0 不同为1
    }
}
