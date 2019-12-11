package method;

/**
 * @program:test_12.10
 * @author: Nine_odes
 * @description:
 * @create:2019-12-11 14:23
 */

class Lesson{
    int age;
    String name;
    static String country;
//    //final修饰的常量，在堆上存储
//    final int test = 0;

    final static int TEST = 0;//存储在方法区
    public void show(){
//        //num出现在方法中，是局部变量，在栈上存储
//        final int num = 0;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
        System.out.println(TEST);
    }

    public Lesson(){
        age = 10;
        name = "zs";
        country = "中国";
        System.out.println("TEST的值为："+TEST);
    }

    public static void fun(){
        System.out.println(country);
        System.out.println(TEST);
    }
}
public class Test1 {
//    public static void main(String[] args) {
//        Lesson lesson = new Lesson();
//        lesson.show();
//    }

    public Test1(){
        System.out.println(this);
    }

    public void test(){
        System.out.println("test中："+ this);
    }
    public static void main(String[] args) {
        Test1 th1 = new Test1();
        System.out.println("主方法中的"+th1);
        th1.test();
        Test1 th2 = new Test1();
        System.out.println("主方法中的"+th2);
        th2.test();
    }

}
