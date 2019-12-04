package code2;

import java.util.Date;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 15:55
 */
//public class Test {
//    public static void main(String[] args) {
//        java.util.Date date = new java.util.Date();
//        //得到一个毫秒级别的时间戳
//        System.out.println(date.getTime());
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.getTime());
//    }
//}

//import static java.lang.System.*;
//public class Test{
//    public static void main(String[] args) {
//        out.println("hello");
//    }
//}

//使用import static 可以导入包中的静态的方法和字段
//import static java.lang.Math.*;
//public class Test{
//    public static void main(String[] args) {
//        double x = 30;
//        double y = 40;
//
//        double result  = sqrt(pow(x,2) + pow(y,2));
//        System.out.println(result);
//    }
//}
//import  code2.Demo1;
//public class Test{
//    public static void main(String[] args) {
//        Demo1 demo = new Demo1();
//        System.out.println(demo.value);
//    }
//}

public class Test{
    public static void main(String[] args) {
        Cat cat = new Cat("小黑");
        cat.eat("猫粮");
        Bird bird = new Bird("圆圆");
        bird.fly();
    }
}