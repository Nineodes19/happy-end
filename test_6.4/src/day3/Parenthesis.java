package day3;

import java.util.Stack;

/**
 * @program:test_6.4
 * @author:Nine_odes
 * @description:
 * @create:2020-06-04 19:06
 **/
public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(A.charAt(i) == '('){
                stack.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "(())(())";
        System.out.println(chkParenthesis(s,s.length()));
    }
}
