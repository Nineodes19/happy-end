package list;

/**
 * @program:test_3.14
 * @author:Nine_odes
 * @description:
 * @create:2020-03-14 14:51
 **/
public class MyArrayList<T> {
    public T[] elem;
    public int size;

    public MyArrayList(){
        this.elem = (T[])new Object[10];
        this.size = 0;
    }
    public void add(T data){
        //尾插
        this.elem[this.size] = data;
        this.size ++;
    }

    public T get(int index){
        //获取index位置的元素
        return this.elem[index];
    }
}
