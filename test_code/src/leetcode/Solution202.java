package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:快乐数
 * 对于一个正整数，每一次将概述替换为它每个位置上的数字的平方和，4
 * 然后重复这个过程直到这个数变成一，可以变成一就是快乐数
 * @create:2020-01-03 22:07
 */
public class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            n = sum(n);
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
        return true;
//        ListNode listNode = new ListNode(n);
//        if(sum(n) != 1){
//            int a = sum(n);
//            listNode.next = new ListNode(sum(a));
//        }
//
//    }
    public int sum(int n) {
        int a;
        int num = 0;
        while(n > 0) {
            a = n % 10;//9 1  2
            n = n / 10;//1    8
            num += a * a;//81 82  4
        }
        return num;
    }


    public static void main(String[] args) {
        Solution202 s = new Solution202();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        System.out.println(s.isHappy(n));
    }
}
