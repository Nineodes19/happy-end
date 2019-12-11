package method;

import sun.dc.path.PathError;

/**
 * @program:test_12.10
 * @author: Nine_odes
 * @description:
 * @create:2019-12-11 13:23
 */

class Person{
    //age和name只有在有对象之后，通过对象.name 和 对象.age  调用
    int age;
    String name;

    //静态变量
    static String country = "中华民国";

//    public Person(){
//        System.out.println("hhh");
//    }

    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        test1();
        System.out.println("test2");
    }
    public Person(int age){
        this.age = age;
        System.out.println("一个参数的构造方法！");
    }

    public Person(int age,String name){
        this(age);
        this.name = name;
    }
//    //构造方法
//    public Person(){
//        //产生一个Person类对象的时候系统默认调用
//        System.out.println("Person 类的构造方法");
//    }
//
//    //命名不规范的普通方法
//    public void Person(){
//        System.out.println("test");
//    }

//    public void showPerson(){
//        testStaticMethod();
//        System.out.println("My name is "+name+",My age is " + age);
//    }

//    //静态方法
//    public static void testStaticMethod(){
//        System.out.println(country);
//        System.out.println("static method!");
//        test();
//    }
//
//    public static void test(){
//        System.out.println("static test");
//    }

}
public class Test {
//    public static void main(String[] args) {
//        System.out.println(Person.country);
//        Person person = new Person();
//        Person person1 = new Person();
//        System.out.println("person.country="+person.country);
//        person.country = "中国";
//        System.out.println("person.country="+person.country);
//        System.out.println("person1.country="+person1.country);
//        person.showPerson();
//    }

//    public static void main(String[] args) {
//        Person.testStaticMethod();
//    }

//    public static void main(String[] args) {
//        Person per = new Person();
//        Person per1 = new Person();
//        System.out.println(per.name);
//        System.out.println(per.age);
//        //per.Person();
//    }

//    public static void main(String[] args) {
//        Person person = new Person();
//        Person person1 = new Person(18);
//        Person person2 = new Person(19,"xiaojiu");
//        System.out.println(person1.age);
//        System.out.println(person2.age);
//        System.out.println(person2.name);
//    }

    public static void main(String[] args) {
        Person per1= new Person(18);
        System.out.println(per1.age);
        per1.test2();
    }

}