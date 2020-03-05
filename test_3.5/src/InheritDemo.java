/**
 * @program:test_3.5
 * @author:Nine_odes
 * @description:
 * @create:2020-03-05 11:29
 **/
public class InheritDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.name = "王老师";
        teacher.age = 40;
        teacher.setHeight(170);
        teacher.school = "西安财经大学";
        teacher.subject = "软件构造";
        teacher.jiaoling = 10;

        student.name = "张三";
        student.age = 20;
        student.setHeight(180);
        student.className = "软件1703";
        student.stuID = "123456";

//        People p = student;
//        p.say();

        People[] p = new People[2];
        p[0] = teacher;
        p[1] = student;
        for (int i = 0; i < 2; i++) {
            p[i].say();
            if(p[i] instanceof Teacher){
                ((Teacher)p[i]).lecturing();//下转型
            }
            if(p[i] instanceof Student){
                ((Student)p[i]).study();
            }
        }

//        teacher.say();
//        student.say();
//
//        teacher.lecturing();
//        student.study();
    }
}

class People{
    public String name;
    public int age;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void say(){
        System.out.println("父类说话：我的名字是" +name + "，年龄是" + age + "身高是" + height);
    }
}

class Teacher extends People{

    String school;//学校
    String subject;//教授的科目
    int jiaoling;

    void say(){
        System.out.println("子类说话：我是老师" + name + ",在" + school + "教学" + subject
                            + "我的教龄是" + jiaoling + "年");
    }

    void lecturing(){
        System.out.println("我正在上课！");
    }
}

class Student extends People{

    String className;//班号
    String stuID;//学号

    void say(){
        System.out.println("子类说话：我是学生" +name + "我在" + className +"学习，我的学号是" + stuID);
    }

    void study(){
        System.out.println("我正在学习软件构造");
    }
}