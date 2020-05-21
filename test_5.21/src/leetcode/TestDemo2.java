package leetcode;

import java.util.Scanner;

/**
 * @program:test_5.21
 * @author:Nine_odes
 * @description:判断一个数是否为回文数
 * @create:2020-05-21 21:37
 **/
public class TestDemo2 {
    public static boolean isHw(String s){
        int len = s.length();
        for(int i = 0,j = len-1; i < j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = String.valueOf(Math.abs(num));
        if(isHw(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
