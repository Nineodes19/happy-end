package code4;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:10
 */
class A{
    void callme(){
        System.out.println("inside A");
    }
}
class B extends A{
    void callme(){
        System.out.println("inside B");
    }
}
public class Poly {
    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        A c = new B();
//        A d = new A();
//        a.callme();
//        b.callme();
//        c.callme();
//        B b = new B();
//        A a = b;
        A a = new B();
        a.callme();
    }
}
