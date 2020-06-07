package day5;

import java.util.Stack;

/**
 * @program:test_6.6
 * @author:Nine_odes
 * @description:两个栈实现队列
 * @create:2020-06-06 10:34
 **/
public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2  = new Stack<>();
    public void push(int node){
        //入到stack1
        stack1.push(node);

    }
    public int pop(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }


        }
        int ret = stack2.peek();
        stack2.pop();
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(10);
        solution.push(20);
        solution.push(30);
        solution.push(40);
        //System.out.println(solution);
        solution.pop();
        System.out.println(solution.pop());
    }
}
