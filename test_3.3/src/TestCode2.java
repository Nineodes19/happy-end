/**
 * @program:test_3.3
 * @author:Nine_odes
 * @description:高精度加法
 * @create:2020-03-03 13:03
 **/

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入两个整数a和b，输出这两个整数的和，a和b都不超过100位
 * 输入包括两行，第一行为一个非负整数a，第二行为一个非负整数b
 * 两个整数都不超过一百位，两数的最高位都不是0
 * 输出格式输出一行，表示a+b的值
 */
public class TestCode2 {

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            System.out.println(n1.add(n2));
        }
    }
}
