package code;

/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:使用静态变量和方法
 * @create:2019-12-14 23:19
 */
class StudentStatic{
    static int no;
    static String name = "test";
    static void alert(){
        System.out.println(name);
    }
}
public class SimpleTest {
    public static void main(String[] args) {
        System.out.println(StudentStatic.no);
        StudentStatic.alert();
    }
}
