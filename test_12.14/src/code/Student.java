package code;

/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:
 * @create:2019-12-14 23:07
 */
public class Student {
    int no;
    String name;

    Student(int l_no,String l_name){
        this.no = l_no;
        this.name = l_name;
    }

    public static void main(String[] args) {
        Student student = new Student(1,"zhangsan");
        Student student1 = new Student(2,"XiaoMing");
        System.out.println("name = " + student1.name +", no = " + student1.no);
        System.out.println("name = " + student.name + ", no = " + student.no);
    }
}
