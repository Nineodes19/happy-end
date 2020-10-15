package laboratory;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-09-29 09:07
 **/
public class CycleQueue<T> {
    private T[] array;
    private int size;
    private int frontIndex;
    private int rearIndex;
    CycleQueue(int capacity){
        //泛型不能直接定义数组
        array = (T[])new Object[capacity];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }
    //放入一个新的数据，如果慢了，则替换最老的一份数据
    public void push(T item){
        boolean isFull = size == array.length;
        array[rearIndex] = item;
        rearIndex = rearIndex +1;
        if(rearIndex >= array.length){
            rearIndex = 0;
        }
        if(isFull){
            frontIndex = rearIndex;
        }else{
            size++;
        }
    }
    //取出并删除掉最老的一份数据
    public T pop(){
        if(size == 0){
            throw new RuntimeException("队列为空！");
        }
        T item = array[frontIndex];
        frontIndex = (frontIndex ++ ) % array.length;//f向后移动，越界后返回
        size--;
        return item;
    }
}
