package code5;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 19:51
 */
public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getCapacity(){
        return data.length;
    }

    public int getSize(){
        return size;
    }

    //判断数组是否为空
    public boolean isEmpty(){
        //return size == 0;
        if(size != 0){
            return true;
        }
        return false;
    }

    //将数组空间的容量变成newCapacity大小
    public void resize(int newCapacity){
        E[] newData =(E[]) new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }
    //在index索引的位置插入一个新元素e
    public void add(int index,E e){

        if(index < 0|| index < size){
            System.out.println("索引非法");
        }
        if(size == data.length){
            resize(2*data.length);
        }
        for(int i = size-1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;


//        if(size == data.length){
//            System.out.println("shuzuyuejie");
//        }
//        if(index < 0 || index > size){
//            System.out.println("索引错误！");
//        }
//        for(int i = size - 1; i >= index; i --){
//            data[i + 1] = data[i];
//        }
//        data[index] = e;
//        size ++;
    }

    //尾插
    public void addLast(E e){
        add(size,e);
    }

    //头插
    public void addFirst(E e){
        add(0,e);
    }

    //获取index索引位置的元素
    public E get(int index){
        if(index < 0 || index > size){
            System.out.println("索引非法");
        }
        return data[index];
    }

    //修改index索引号位置的元素为e
    public void set(int index,E e){
        if(index < 0 || index > size){
            System.out.println("索引非法");
        }
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e){
        for(int i = 0; i < size; i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    //查找数组中元素e所在的索引，如果不存在元素e，则返回-1；
    public int find(E e){
        for(int i = 0; i < size; i++){
            if(data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //从数组中删除index位置的元素，返回删除的元素
    public E remove(int index){
        if(index < 0 || index > size){
            System.out.println("索引非法");
        }
        E ret = data[index];
        for(int i = index + 1; i < size; i++){
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;
        return  ret;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }

    //从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d,capacity = %d\n",
                        size,data.length));
        res.append('[');
        for(int i = 0; i < size; i++){
            res.append(data[i]);
            if(i != size - 1){
                res.append(",");
            }
        }
        res.append(']');
        return res.toString();
    }
}