package class_lesson;

/**
 * @program:Test_11.28
 * @author: Nine_odes
 * @description:类和对象
 * @create:2019-11-28 19:44
 */

//class Person{
//    int age;
//    String name;
//    //修改之后全局可见
//    static String country = "中国";
//    public void eat(){
//        System.out.println("恰饭");
//    }
//    public void show(){
//        System.out.println("My name is "+name+",my age is "+age);
//    }
//}
//public class Test {
//    public static void main(String[] args){
//        //Person per = new Person();
////        System.out.println(Person.country);
//        Person per1 = new Person();
//        per1.age = 20;
//        per1.name = "九歌";
//        per1.country = "China";
//        per1.eat();
//        per1.show();
//        System.out.println(per1.country);
//        Person per2 = new Person();
//        per2.show();
//        System.out.println(per2.country);
//        System.out.println(per2.age);
//        System.out.println(per2.name);
//    }
//}

//class Person{
//    public int age;
//    public String name;
//    public String sex;
//
//    public void eat(){//成员方法
//        System.out.println("吃饭！");
//    }
//
//    public void sleep(){
//        System.out.println("睡觉！");
//    }
//
//    public void showPerson(){
//        System.out.println("My name is "+name+",my age is "+age);
//
//    }
//
//    public static void testStaticMethod(){
//        //对象实例化之后才占用物理空间，age和name此时还未创建
////        System.out.println(age);
////        System.out.println(name);
//
//        System.out.println("static mrthod!");
//        test();
//    }
//
//    public static void test(){
//        System.out.println("static test!");
//    }
//}
//public class Test{
//    public static void main(String[] args){
//        Person person = new Person();//通过new实例化对象
//        person.eat();//成员方法的调用需要通过对象的引用调用
//        //System.out.println(person.name.length());
//        person.sleep();
//        Person.testStaticMethod();
//    }
//}

class Person{
    int age;
    String name;

    public Person(){
        System.out.println("构造方法");
    }
    public Person(int age){
        this();
        this.age = age;

    }

//    public  Person(int age,String name){
//      age 是距离自己最近的变量
//        age = age;
//        name = name;
//    }
    public Person(int age,String name){
        this(age);//调用一个参数的有参构造
        this.name = name;

    }

//    //命名不规范的普通方法
//    public void Person(){
//        System.out.println("Test！");
//    }
    public void test1(){//成员方法
        System.out.println("Test1");
    }


}
public class Test{
    public static void main(String[] args) {
        Person per = new Person();
        Person per1 = new Person(18);
        System.out.println(per1.age);
        Person per2 = new Person(10,"jigue");
        System.out.println(per2.age);
        System.out.println(per2.name);
    }
}