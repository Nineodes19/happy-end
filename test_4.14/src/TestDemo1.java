/**
 * @program:test_4.14
 * @author:Nine_odes
 * @description:
 * @create:2020-04-14 18:38
 **/



class Student {
    private String name;
    public int age;
    public Student(){

    }
    private Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("I am eating");
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
public class TestDemo1 {


    public static void main(String[] args) {
        System.out.println(Student.class.getClassLoader());
        //如果是由根加载器加载，那么打印的结果就是null
        System.out.println(String.class.getClassLoader());
        System.out.println(Student.class.getName());
        System.out.println(Student.class.getFields());


    }

    public static void main2(String[] args) {
        try {
           Class<?> c1 =  Class.forName("Student");


           Class<?> c2 = Student.class;

           Student student = new Student();
           Class<?> c3 = student.getClass();

            System.out.println(c1.equals(c2));
            System.out.println(c1.equals(c3));
            System.out.println(c2.equals(c3));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main1(String[] args) {
        //运行时person的类型是Student
//        Person person = new Student();
//        System.out.println(person);
    }

}
