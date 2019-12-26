package abstractpackage;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-26 19:12
 */
//public abstract class Person {
//    public Person(){
//        func();
//    }
//    public abstract void func();
//    //抽象方法
////    public abstract void eat();
////    public abstract void work();
//
//    public static void main(String[] args) {
//        new Student();
//    }
//}
//class Student extends Person{
//    private int age = 10;
//
//
//    @Override
//    public void func() {
//        System.out.println("I am child.age is" + age);
//    }
//}

abstract class Person{
    public abstract void work();
}

class Student extends Person{

    @Override
    public void work() {
        System.out.println("学生学习");
    }
}
class Teacher extends Person{

    @Override
    public void work() {
        System.out.println("老师教书");
    }
}