import java.util.Stack;

/**
 * @program:test_3.15
 * @author:Nine_odes
 * @description:
 * @create:2020-03-15 09:56
 **/
public class TestDemo {

    public static void main(String[] args) {
        QueueImlStack queueImlStack = new QueueImlStack();
        queueImlStack.push(1);
        queueImlStack.push(2);

        System.out.println(queueImlStack.pop());
        System.out.println(queueImlStack.top());
        System.out.println(queueImlStack.empty());
    }
    public static void main1(String[] args) {
        TestDemo testDemo = new TestDemo();
        //String s = "（）";
        String s = "()";
        System.out.println(isValid(s));
    }
    public  static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //如果是左括号入栈
            if(s.charAt(i) == '(' || s.charAt(i) == '['|| s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }else {
                //右括号
                if(stack.empty()) {
                    System.out.println("右括号多！");
                    return false;
                }else {
                    //拿到栈顶元素进行比较 看是否匹配  匹配出栈
                    char ch = s.charAt(i);
                    char x = stack.peek();
                    if ((ch == ')' && x == '(')||
                            (ch == ']' && x == '[')||
                            (ch == '}' && x == '{')) {
                        stack.pop();
                    }else{
                        System.out.println("匹配错误！");
                        return false;
                    }
                }
            }
        }
        //判断栈是空的还是非空的
        if(stack.empty()){
            System.out.println("匹配成功！");
            return true;
        }
        return false;
//        if(!stack.empty()){
//            System.out.println("左括号多！");
//            return false;
//        }
//        System.out.println("匹配成功！");
//        return true;
    }
}
