/**
 * @program:test_12.25
 * @author: Nine_odes
 * @description:
 * @create:2019-12-26 18:45
 */
//public class Person {
//    int age;
//    public Person(int age){
//        this.age = age;
//    }
//}
//
//class Student extends Person{
//    public Student(int age){
//        super(age);
//    }
//}

//class Person{
//    int age;
//    public Person(){}
//}
//class Student extends Person{
//    public Student(int age){
//        super();
//    }
//}


class Person{

    public Person(){
        fun();
    }
    public void fun(){
        System.out.println("I am your father");
    }

    public static void main(String[] args) {
        new Student().fun();
    }
}
class Student extends Person{
    private int age = 10;
    public void fun(){
        System.out.println("I am child" + age);
    }
}