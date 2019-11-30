package class_1130;

/**
 * @program:Test_11.30
 * @author: Nine_odes
 * @description:类与对象
 * @create:2019-11-30 22:41
 */

class Person{
    public int age;
    public String name;
    public String sex;
    public static int count;
    public final int SIZE = 10;
    public static  final  int COUNT = 99;

    public void eat(){
        int a = 10;
        System.out.println("eat()!");
    }

    public void sleep(){
        System.out.println("Sleep()!");
    }

    public static void staticTest(){
//        不能访问非静态成员
//        sex = "man";//error
        System.out.println("StaticTest()");
    }
}

public class Test {
    public static void main(String[] args) {
        //产生对象，实例化对象
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(person.name);//输出为null
        System.out.println(Person.count);
        System.out.println(Person.COUNT);//99
        Person.staticTest();
        person.eat();
        person.sleep();
    }
}
