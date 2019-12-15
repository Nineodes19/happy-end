package test;
import java.util.*;
//只导入Math类的静态属性以及方法
import static java.lang.Math.*;
import static java.lang.System.*;
/**
 * @program:test_12.15
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 09:29
 */
public class Test {
    public static void main(String[] args) {
        //获取当前系统时间
        Date data = new Date();
        System.out.println(data);
        ArrayList list = new ArrayList();
        int a = 10;
        int b = 20;
        int result = min(a,b);
        out.println(result);
    }



}
