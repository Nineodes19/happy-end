package code;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:静态代码块
 * @create:2019-12-03 14:10
 */
class TestSquare{
    static int count;
    public TestSquare(){
        System.out.println("1.TestSquare的构造方法。。");
    }

    {
        System.out.println("2.TestSquare的构造块。。");
    }

    static {
        System.out.println("3.TestSquare的静态块。。。");
    }
}
public class StaticSquare {
    public StaticSquare(){
        System.out.println("1");
    }
    {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }
    public static void main(String[] args) {
//        TestSquare testSquare = new TestSquare();
//        TestSquare testSquare1 = new TestSquare();


//        System.out.println(TestSquare.count);//3 0
//        TestSquare testSquare = new TestSquare();//2 1
//        TestSquare testSquare1 = new TestSquare();//2 1

        System.out.println("4");
        StaticSquare staticSquare = new StaticSquare();
    }
}
