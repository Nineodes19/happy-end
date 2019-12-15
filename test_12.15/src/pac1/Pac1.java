package pac1;

/**
 * @program:test_12.15
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 09:48
 */
public class Pac1 {
    private int age;
    //包访问权限
    String name;

    public void test(){
        System.out.println("Pac1的test方法");
    }

    void test1(){
        System.out.println(name);
    }
}
