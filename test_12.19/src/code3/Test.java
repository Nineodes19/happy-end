package code3;

/**
 * @program:test_12.19
 * @author: Nine_odes
 * @description:
 * @create:2019-12-19 20:53
 */

class Person{
    public void work(){
        System.out.println("人类工作");
    }
}

class Student extends Person{
    public void work(){
        System.out.println("学生学习");
    }

    public void study(){
        System.out.println("学生学JAVA");
    }
}

class Coder extends Person{
    public void work(){
        System.out.println("码农敲代码");
    }
}

class Worker extends Person{
    public void work(){
        System.out.println("民工搬砖");
    }
}
//public class Test {
//    public static void main(String[] args) {
//        Person person = new Person();
//        Student student = new Student();
//        Coder coder = new Coder();
//        Worker worker = new Worker();
//        print(person);
//        print(coder);
//        print(student);
//        print(worker);
//    }
//    public static void print(Person per){
//        per.work();
//    }
//
////    public static void print(Worker wor){
////        wor.work();
////    }
////
////    public static void print(Student stu){
////        stu.work();
////    }
////
////    public static void print(Coder cod){
////        cod.work();
////    }
//}

class Dog{
    public void wangwang(){
        System.out.println("wangwang");
    }
}
public class Test{

//    public static void main(String[] args) {
//        Person per = new Student();
//        //向下转型
//        Student stu = (Student) per;
//        stu.work();

//        //没有继承关系无法强转
//        Dog dog = new Dog();
//        Student stu = (Student) dog;


//        Person per = new Person();
//        Student stu = null;
//        if(per instanceof Student) {
//            //表示此时per可以指向子类实例
//            System.out.println("if语句");
//        }else{
//            System.out.println("else语句");
//            per = new Student();
//        }
//        stu = (Student)per;
//        stu.work();
//    }


    public static void main(String[] args) {
        Person person = new Person();
        Student stu = new Student();
        Worker worker = new Worker();
        print(person);
        print(stu);
        print(worker);
    }
    public static void print(Person per){
        if(per instanceof Student){
            Student stu = (Student) per;
            stu.study();
        }
        per.work();
    }
}