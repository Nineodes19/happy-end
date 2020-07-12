package review;

/**
 * @program:test_7.12
 * @author:Nine_odes
 * @description:
 * @create:2020-07-12 20:18
 **/
public class TestDemo2 {


    public static void main(String[] args) {
        short sh = 12;
        System.out.println(sh);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        int i = 2147483647+1;
        int i2 = Integer.MAX_VALUE +1;
        System.out.println(i);
        System.out.println(i2);

        byte b = 10;
        byte c = 20;
        short s = 10;
        short s1 = 20;

    }
    public static void main5(String[] args) {
        byte b = 12;
        byte c = 21;
        System.out.println(b + " " + c);
        System.out.println(Byte.MAX_VALUE + 1);


    }

    public static void main4(String[] args) {
        char ch = 'a';
        System.out.println(ch);
        char ch2 = '邹';
        System.out.println(ch2);

        char ch3  = 97;
        System.out.println(ch3);
    }
    public static void main3(String[] args) {
        //小数默认是double类型
        float f = 12.3f;
        System.out.println(f);
    }

    public static void main2(String[] args) {
//        double d = 12.5;
//        System.out.println(d);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//        int a = 1;
//        double b = 2;
//        System.out.println(a/b);

        double num = 1.1;
        System.out.println(num * num);
        System.out.printf("%.2f",num * num);
    }
    public static void main1(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("kaixin");
    }
}
