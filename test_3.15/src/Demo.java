import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program:test_3.15
 * @author:Nine_odes
 * @description:
 * @create:2020-03-15 08:48
 **/
public class Demo {

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue.poll());//出队
        System.out.println(queue.peek());//队头元素输出，不出队
        System.out.println(queue.size());
    }
    public static void main1(String[] args) {
        MyStack<String> stack =new MyStack<>();
        stack.push("hello");
        stack.push("jiuge");
        stack.push("Are");
        stack.push("you");
        stack.push("happy");
        System.out.println(stack.pop());

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println(stack1);
        int a = stack1.pop();
        System.out.println(a);
        System.out.println("pop之后：" + stack1);
        int ret = stack1.peek();
        System.out.println(ret);
        System.out.println(stack1.size());
        System.out.println(stack1.empty());
        System.out.println(stack1.search(10));
    }
}
