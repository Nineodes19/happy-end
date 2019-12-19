package code2;

/**
 * @program:test_12.19
 * @author: Nine_odes
 * @description:
 * @create:2019-12-19 19:36
 */

class A{
    public A(){
        func();
    }

    public void func(){
        System.out.println("This is A");
    }
}
public class B extends A {
    private int num = 10;
    public B(){

    }

    public void func(){
        System.out.println("This is B" + num);
    }

    public static void main(String[] args) {
        new B().func();//new B()
    }

    //This is B0;
}
