package method;

/**
 * @program:test_12.10
 * @author: Nine_odes
 * @description:
 * @create:2019-12-11 15:18
 */

class TestSquare{
    static int count = 0;
    public TestSquare(){
        System.out.println("1.TestSquare的构造方法。。");
    }

    {
        System.out.println("2.TestSquare的构造块。。。");
    }

    static{
        System.out.println("3.TestSquare的静态块。。");
    }
}
public class StaticSquare {
//    public static void main(String[] args) {
//        System.out.println(TestSquare.count);
//        TestSquare testSquare = new TestSquare();
//        TestSquare testSquare1 = new TestSquare();
//    }

    public StaticSquare(){
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    //主类中的静态代码块优先于主方法执行
    static{
        System.out.println("3");
    }
    public static void main(String[] args) {
        System.out.println("4");
        StaticSquare staticSquare = new StaticSquare();
    }

}
