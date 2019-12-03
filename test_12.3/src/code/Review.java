package code;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:review(11.30)
 * @create:2019-12-03 13:17
 */

class Lesson{
    //Lesson的成员变量age，name，存储在堆上
    int age;
    String name;
    //Lesson 的静态变量。存储在方法区
    static String country;
//    //被final修饰的常量，是类的成员变量，
//    // 声明是0以后无法修改，在堆上存储
//    final int test = 0;
    final static int TEST = 0;//在方法区存储


    public void show(){
        //num这个变量出现在方法中，方法中的变量在栈上存储，是一个局部变量
//        final int num = 0;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
        System.out.println(TEST);
    }
    public Lesson(){
        //调用Lesson之后有对象
        //构造方法中可以访问age和name，
        age = 10;
        name =  "zhangsan";
        country = "中国";
        System.out.println(TEST);
    }
    public static void fun(){
        //静态方法，不能访问age和name
        System.out.println(country);
        System.out.println(TEST);
    }
}
public class Review {
    public static void main(String[] args) {
        //产生三个Lesson对象之后，age和name产生三个，country一个，test三个（值不能改）
//        Lesson lesson1  = new Lesson();
//        Lesson lesson2 = new Lesson();
//        Lesson lesson3 = new Lesson();
        Lesson lesson1  = new Lesson();//进行初始化，输出TEST的值：0
        System.out.println();
        lesson1.show();
    }
}
