package day15;

/**
 * @program:test_6.19
 * @author:Nine_odes
 * @description:
 * @create:2020-06-19 18:13
 **/

class A{
    public A(String str){

    }
}
public class TestDemo1 {
    private float f = 1.0f;
    int m = 12;
    static int n = 1;

    public static void main(String[] args) {
        TestDemo1 t = new TestDemo1();

        A classa = new A("hehe");
        A classb = new A("hehe");
        System.out.println(classa == classb);
    }
}
