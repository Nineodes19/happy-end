/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:实例变量和静态变量的区别
 * @create:2019-12-14 23:22
 */
public class StaticTest {
    static int statInt = 4;
    static double statDouble = 16.0;
    int instInt;
    double instDouble;
    public static void staticMethod(){
        System.out.println("statInt = " + statInt +"; statDouble = " + statDouble);
    }

    public void instMethod(){
        System.out.println("instInt = " + instInt + "; instDouble = " + statDouble);
    }

    public StaticTest(int intArg,double doubleArg){
        instInt = intArg;
        instDouble = doubleArg;
    }

    public static void changestatic(int newInt,double newDoule){
        statInt = newInt;
        statDouble = newDoule;
    }

    public static void main(String[] args) {
        StaticTest instance1 = new StaticTest(1,2.0);
        StaticTest instance2 = new StaticTest(3,4.0);
        instance1.instMethod();
        instance2.instMethod();
        StaticTest.staticMethod();
        instance1.staticMethod();
        instance2.staticMethod();
        instance1.changestatic(8,8.0);
        instance2.staticMethod();
        StaticTest.staticMethod();
    }
}
