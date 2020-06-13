package review3_13;

import java.util.Stack;

/**
 * @program:test_6.6
 * @author:Nine_odes
 * @description:
 * @create:2020-06-07 08:36
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        System.out.println(stack);
        stack.pop();//删除一个元素【出栈】
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
