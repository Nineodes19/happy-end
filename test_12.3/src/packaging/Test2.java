package packaging;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:homework包含多个构造函数的类
 * @create:2019-12-03 15:25
 */

class Student{
    public int id;
    public String name;
    public String sex;
    public int age;

    public Student(){
        id = 0;
        name = null;
        sex = null;
        age = 0;
    }

    public Student(int id){
        this.id = id;
    }
    public Student(int id,String name){
        this(id);
        this.name = name;
    }
    public Student(int id,String name,String sex){
        this(id,name);
        this.sex = sex;
    }
    public Student(int id,String name,String sex,int age){
        this(id,name,sex);
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public void show(){
        System.out.println("id:"+id+
                            ",  name:"+name+
                            ",  sex:"+ sex+
                            ",  age:"+age);
    }
}
public class Test2 {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.show();
//        Student student1 = new Student(123456);
//        student1.show();
//        Student student2 = new Student(13,"九歌","女",19);
//        student2.show();
//        Student student3 = new Student(12545,"jjiqjo","男",45);
//        student3.show();
        System.out.println(new Student(13,"九歌","女",19));
    }
}
