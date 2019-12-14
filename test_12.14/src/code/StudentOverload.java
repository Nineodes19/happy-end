package code;

/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:
 * @create:2019-12-14 23:11
 */
public class StudentOverload {
    int no;
    String name;

    public StudentOverload(int no) {
        this.no = no;
    }

    public StudentOverload(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public static void main(String[] args) {
        StudentOverload studentOverload = new StudentOverload(00001);
        StudentOverload studentOverload1 = new StudentOverload(00002,"zhangsan");
        System.out.println("no = " + studentOverload.no + ", name = " + studentOverload.name);
        System.out.println("no = " + studentOverload1.no + ", name = " + studentOverload1.name);
    }
}
