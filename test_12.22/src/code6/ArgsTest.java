package code6;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 20:36
 */
class Demo{
    public int sum(int a, int b){
        return a+ b;
    }
}

class Student{
    int a;
    public void show(){
        System.out.println("我爱学习");
    }
}

class StudentDemo{
    public void method(Student s){
        s.a = 100;
        s.show();
    }
}
public class ArgsTest {
    public static void main(String[] args){
//        Demo d = new Demo();
//        int result = d.sum(10,20);
//        System.out.println("result:"+result);
//        System.out.println("////////////////////");
//
//        StudentDemo sd  = new StudentDemo();
//        Student s = new Student();
//        System.out.println(s.a);
//        sd.method(s);
//        System.out.println(s.a);

        Student s = new Student();
        s.show();
        s.show();
        System.out.println("////////////");

        new Student().show();
        new Student().show();
        new StudentDemo().method(new Student());
    }
}
