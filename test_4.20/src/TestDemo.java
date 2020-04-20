/**
 * @program:test_4.20
 * @author:Nine_odes
 * @description:
 * @create:2020-04-20 22:21
 **/

class Student{
    private String name = "jiuge";
    public int age = 19;
    public Student(){
        System.out.println("Student()");
    }

    private Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }

    private void eat(){
        System.out.println("I am eating");
    }

    public void sleep(){
        System.out.println("I am sleepping");
    }

    private void function(String str){
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args){
        Student s1 = new Student();
        Class c1 = s1.getClass();

        Class c2 = Student.class;
        Class c3 = null;
        try {
            c3 = Class.forName("Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
    }
}
