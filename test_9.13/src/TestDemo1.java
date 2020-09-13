/**
 * @program:test_9.13
 * @author:Nine_odes
 * @description:
 * @create:2020-09-13 19:25
 **/
/*
从左到右分割成若干长度相等的子串
每个子串进行字符逆序
输入：
    单组输入
    输入两行，第一行是正整数n，分割时的字符串长度
    第二行为字符串，
输出：
 */

import java.util.*;
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //分割的字符串长度
        int n = sc.nextInt();//分割的字符串长度


        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(stack.size() == n){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
