package leetcode;

import nowcoder.Solution;

import java.util.Arrays;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:数字转换为十六进制数
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。
 * 对于负整数，我们通常使用补码运算方法
 * @create:2020-01-07 20:19
 */
public class Solution405 {


    public String toHex(int num) {
        char[] arr = "0123456789abcdef".toCharArray();
        String s = new String();
        while(num != 0){
            int a = num & 15;
            s = arr[a] + s;
            num >>>= 4;
        }

        if(s.length() == 0){
            s = "0";
        }
        return s;
    }

    public static void main(String[] args) {
        Solution405 s = new Solution405();
        System.out.println(s.toHex(26));
    }
}
