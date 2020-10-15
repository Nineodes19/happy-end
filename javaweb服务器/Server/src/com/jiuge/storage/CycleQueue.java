package com.jiuge.storage;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:23
 **/

/**
 * 需要保证这个抽屉是线程安全的
 */
public class CycleQueue<T> {
    private T[] array;
    private int size;
    private int frontIndex;
    private int rearIndex;
    CycleQueue(int capacity){
        array = (T[]) new  Object[capacity];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }

    public synchronized void push(T item){
        array[rearIndex] = item;
        rearIndex = (rearIndex + 1) % array.length;
        if(size == array.length){
            frontIndex = rearIndex;
        }else{
            size++;
        }
    }

    public synchronized T pop(){
        if(size == 0){
            return null;
        }
        T item = array[frontIndex];
        frontIndex = (frontIndex + 1) % array.length;
        size --;
        return item;
    }
}
