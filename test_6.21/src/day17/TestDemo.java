package day17;

/**
 * @program:test_6.21
 * @author:Nine_odes
 * @description:
 * @create:2020-06-21 15:39
 **/
public class TestDemo {
    private int count;
    TestDemo(int a){
        count = a;
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo(88);
        System.out.println(testDemo.count);
    }
}
