package code2;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:23
 */
public class Student extends Person{
    String schoolName;
    public void GotoSchool(){
        System.out.println("I am going to school");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "MingM";
        student.age = 10;
        student.schoolName = "CQ";
        student.Say();
        student.GotoSchool();
        System.out.println("My name is " + student.name);
        System.out.println("My schoolName is " + student.schoolName);
    }
}
