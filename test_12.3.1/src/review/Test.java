package review;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:review
 * @create:2019-12-03 18:44
 */
public class Test {
    public Test(){
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    static{
        System.out.println("3");
    }

    public static void main(String[] args) {
        System.out.println("4");
        new Test();
        new Test();
        System.out.println("5");
    }
}
