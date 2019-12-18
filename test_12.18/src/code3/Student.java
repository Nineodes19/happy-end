package code3;

/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:44
 */
public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("这是无参构造方法！");
    }

    public Student(String name){
        this.name = name;
        System.out.println("这是带一个String类型的构造方法");
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("这是一个带多个参数的构造方法");
    }

    public void show(){
        System.out.println(name + "----" + age);
    }
}
