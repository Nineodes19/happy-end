/**
 * @program:test_7.21
 * @author:Nine_odes
 * @description:
 * @create:2020-07-22 11:51
 **/
public class MyStack {
    private int[] array = new int[100];
    private int size = 0;
    public void push(int value){
        array[size] = value;
        size++;
    }
    public int pop(){
        int s = array[size-1];
        size--;
        return s;
    }
    public int peek(){
        int s = array[size-1];
        return s;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
}
