package code3;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 18:49
 */
class Triangle{
    public static void Print(){
        System.out.println("     *");
        System.out.println("    ***");
        System.out.println("   *****");
        System.out.println("  *******");
        System.out.println(" *********");
    }
}
public class PrintData {
    public static void main(String[] args){
        Date date = new Date();
        String str = date.toLocaleString();
        Triangle.Print();
        System.out.println("当前日期：" + str);
    }
}
