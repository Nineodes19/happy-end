package code2;

/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:36
 */

class Student{
    private String name;
    private int age;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
public class StudentTest {
    public static void main(String[] args){
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);
        System.out.println(s.getName() + "-----" + s.getAge());
    }
}
