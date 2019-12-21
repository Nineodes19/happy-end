package code7;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:55
 */
interface Exam{
    void printl();
}
public class Outer4 {
    public Exam test(){
        return new Exam(){
            public void printl(){
                System.out.println("Hello world!");
            }
        };
    }

    public static void main(String[] args) {
        Outer4 c = new Outer4();
        Exam e = c.test();
        e.printl();
    }
}
