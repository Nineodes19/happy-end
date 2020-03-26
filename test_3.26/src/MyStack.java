/**
 * @program:test_3.26
 * @author:Nine_odes
 * @description:
 * @create:2020-03-26 22:57
 **/
public class MyStack {
    private int[] array = new int[100];
    private int size = 0;
    public void push(int v){
        array[size++] = v;
    }
    public int pop(){
        return array[--size];
    }

    public int peek(){
        return array[size-1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}
