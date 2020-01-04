package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:各位相加
 * 给定一个非负整数num，反复将各个位上的数字相加，直到结果为一位数
 * @create:2020-01-04 22:19
 */
public class Solution258 {
    public int addDigits(int num) {
        int n = sum(num);
        while(n /10 != 0){
            n=sum(n);
        }
        return n;
    }
    public int sum(int n) {
        int a;
        int num = 0;
        while(n > 0) {
            a = n % 10;//8  3
            n = n / 10;//3  0
            num += a;//11
        }
        return num;
    }

    public static void main(String[] args) {
        Solution258 s = new Solution258();

        System.out.println(s.addDigits(38));
    }
}
