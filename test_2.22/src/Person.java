/**
 * @program:test_2.22
 * @author:Nine_odes
 * @description:
 * @create:2020-02-22 20:06
 **/
//public class Person {
//    int age;
//    public Person(int age){
//        this.age = age;
//    }
//}
//
//class Student extends Person{
//    //父类中不存在无参构造时，子类中一定不存在无参构造
//    //public Student(){}
//    public Student(int age){
//        super(age);
//    }
//}
//public class Person{
//    public Person(){
//        func();
//    }
//    public void func(){
//        System.out.println("I am your father!");
//    }
//
//    public static void main(String[] args) {
//        new Student();
//        new Student().func();
//    }
//}
//
//class Student extends Person{
//    private int age = 10;
//    public void func(){
//        System.out.println("I am child" + age);
//    }
//}

//public abstract class Person{
//    //抽象方法：使用abstract定义，没有方法体
//    public abstract void eat();
//    public abstract void work();
//}

public abstract class Person{
    public Person(){
        func();
    }
    public abstract void func();
    public static void main(String[] args){
        new Student();
    }
}

class Student extends Person{
    private int age = 10;

    @Override
    public void func() {
        System.out.println("I am child,age is"  + age);
    }
}