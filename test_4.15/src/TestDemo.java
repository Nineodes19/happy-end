/**
 * @program:test_4.15
 * @author:Nine_odes
 * @description:
 * @create:2020-04-16 22:52
 **/

class Student{
    private String name;
    public int age;

    public Student(){

    }

    private Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("I Am eating");
    }

    private void func(){
        System.out.println("private func()");

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

    public static void main(String[] args) {
        System.out.println(Student.class.getClassLoader());
        //如果是由跟加载器加载，那么打印的结果就是null
        System.out.println(String.class.getClassLoader());
        System.out.println(Student.class.getName());

        System.out.println(Student.class.getFields());


    }

    public static void main1(String[] args) {
        Class<?> cl = null;
        try {
            cl = Class.forName("Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class<?> cl1 = Student.class;

        Student student = new Student();
        Class<?> cl3 = student.getClass();
        //一个类只会有一个Class对象
        System.out.println(cl.equals(cl1));
        System.out.println(cl.equals(cl3));
        System.out.println(cl1.equals(cl3));
    }
}

