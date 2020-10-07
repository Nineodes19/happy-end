/**
 * @program:test_10.7
 * @author:Nine_odes
 * @description:
 * @create:2020-10-07 20:08
 **/
public class MyArrayList<E> {
    private E[] array;
    private int size;
    public MyArrayList(){
        array = (E[])new Object[16];
        size = 0;
    }
    public void add(E e){
        array[size++] = e;
    }

    public E remove(){
        E element = array[size -1];
        array[size-1] = null;//将容器置空，保证对象被正确释放
        size --;
        return element;
    }
}
