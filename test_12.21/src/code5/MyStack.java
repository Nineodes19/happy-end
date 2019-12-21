package code5;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:25
 */
public class MyStack extends Access {
    private LinkedList bottom = new LinkedList();
    private LinkedList top = bottom;

    public void put(char c){
        top.forward = new LinkedList();
        top.forward.data = c;
        top.forward.back = top;
        top = top.forward;
    }
    public char get(){
        if(top != bottom){
            char ch = top.data;
            top.back.forward = null;
            top = top.back;
            return ch;
        }else{
            System.out.println("The stack is empty!");
            return '\0';
        }
    }
}
