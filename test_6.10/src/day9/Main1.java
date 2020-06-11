package day9;

import java.util.Scanner;

/**
 * @program:test_6.10
 * @author:Nine_odes
 * @description:数字颠倒
 * @create:2020-06-10 10:06
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String s = String.valueOf(n);
            char[] ch = s.toCharArray();
            for (int i = ch.length-1; i >=0 ; i--) {
                System.out.print(ch[i]);
            }
        }
    }
}
