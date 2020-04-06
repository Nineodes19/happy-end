/**
 * @program:test_4.6
 * @author:Nine_odes
 * @description:
 * @create:2020-04-06 23:01
 **/
public class MyArrayList<E> {
    private E[] array;
    private int size;
    public MyArrayList(){
        array = (E[])new Object[16];
        size = 0;
    }

    //尾插
    public void add(E e){
        array[size] = e;
        size ++;
    }

    //尾删
    public E remove(){
        E e = array[size-1];
        array[size-1] = null;
        size--;
        return e;
    }
}
