import java.util.Stack;

/**
 * @program:test_8.19
 * @author:Nine_odes
 * @description:两个栈来实现队列
 * @create:2020-08-19 23:23
 **/
public class Test {
    //stack1用来存储入队的元素
    Stack<Integer> stack1 = new Stack<>();
    //stack2中的元素是将stack1中的元素依次出栈得到的
    //其中的元素就是入队列的元素
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node){
        //实现入队操作
        stack1.push(node);
    }

    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        //stack2不为空
        int ret = stack2.pop();
        return ret;
    }

}
