/**
 * @program:test_3.15
 * @author:Nine_odes
 * @description:
 * @create:2020-03-15 08:39
 **/
public class MyStack<T> {
    private T[] elem;
    private int size;

    public MyStack(){
        this.elem = (T[]) new Object[10];
        this.size = 0;
    }

    /**
     * 入栈
     * @param data
     */
    public void push(T data){
        if(isFull()){
            return;
        }
        this.elem[this.size] = data;
        this.size++;
    }

    /**
     * 出栈
     * @return
     */
    public T pop(){
        if(empty()){
            throw new RuntimeException("栈为空！！");
        }
        T data = this.elem[this.size-1];
        this.size--;
        return data;

    }

    /**
     * 得到栈顶元素但是不出栈
     * @return
     */
    public T peek(){
        if(empty()){
            throw new RuntimeException("栈为空！！");
        }
        T data = this.elem[this.size - 1];
        return data;
    }

    public boolean empty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.size == this.elem.length){
            return true;
        }
        return false;
    }
}
