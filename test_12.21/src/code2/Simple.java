package code2;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:28
 */
class A{
    int i;
    void showi(){
        System.out.println("i : " + i);
    }
}

class B extends A{
    int k;
    void show(){
        System.out.println("k : " + k);
    }
    void sum(){
        System.out.println("i + k : " + (i + k));
    }
}
public class Simple {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.i = 10;
        System.out.println("Contents in 父类：");
        a.showi();
        b.i = 7;
        b.k = 9;
        System.out.println("Contents in 子类：");
        b.show();
        System.out.println("Sum of i and k in 子类：");
        b.sum();
    }
}
