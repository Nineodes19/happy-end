package laboratory;

import com.sun.corba.se.spi.ior.ObjectKey;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-08-01 09:32
 **/
public class CycleQueue<T> {
    public T[] array;
    public int size;
    public int frontIndex;
    public int rearIndex;

    public CycleQueue(int capacity){
        array = (T[])new Object[capacity];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }

    /**
     * 放入一个新的数据，如果满了，则替换最老的一份数据
     * @param item
     */
    public void push(T item) {
        boolean isFull = size==array.length;//插入之前是否为满
        array[rearIndex] = item;
        rearIndex++;
        if(rearIndex >= array.length){
            //下标越界
            rearIndex = 0;
        }
        if(isFull){
            //插入之前为满
            frontIndex = rearIndex;//则front跟着rear走
        }else{
            size++;
        }
//        //如果没满则size++，否则size不动了
//        if(size < array.length){
//            size++;
//        }

        //为什么数据只保留最新的n份
        // 因为我们关注CPU是有时效性的，
        // 看整体情况，太早的数据对我们没什么用
    }

    /**
     * 取出并删除掉最老的一份数据
     * @return
     */
    public T pop() {
        /*
            1.如果array为空，输出异常
            2.不为空时，删除最早的数据，数据置空
            3.size--
         */
        if(size == 0){
            throw new RuntimeException();
        }
        T item = array[frontIndex];
        frontIndex = (frontIndex++)% array.length;

        size--;
        return item;
    }
}
