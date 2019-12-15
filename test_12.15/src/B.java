/**
 * @program:test_12.15
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 11:00
 */

class A{
    public A(){
        System.out.print("1.");
    }
    {
        System.out.print("2.");
    }
    static{
        System.out.print("3.");
    }
}
public class B extends A{
    public B(){
        System.out.print("4.");
    }
    {
        System.out.print("5.");
    }
    static {
        System.out.print("6.");
    }

    public static void main(String[] args) {

        // 3 6 7 ----->父类的静态代码块在子类的静态代码块之前运行，且在主类之前
        // 2 1 5 4
        // 2 1 5 4
        // 8
        System.out.print("7.");

        new B();
        new B();

        System.out.print("8.");
    }
}
