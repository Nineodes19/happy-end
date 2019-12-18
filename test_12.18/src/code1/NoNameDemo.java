package code1;

/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:32
 */
public class NoNameDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.show();
        System.out.println("--------------");

        new Student().show();
        System.out.println("--------------");

        StudentDemo sd = new StudentDemo();
        sd.method(new Student());
        new StudentDemo().method(new Student());
    }
}
