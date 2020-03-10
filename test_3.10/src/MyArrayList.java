/**
 * @program:test_3.10
 * @author:Nine_odes
 * @description:
 * @create:2020-03-10 18:49
 **/


public class MyArrayList<T> {
    public T[] elem;//null
    public int usedSize;//0

    public MyArrayList(){
        //this.elem = new T[10];
        this.elem = (T[]) new Object[10];
        this.usedSize = 0;
    }

    /**
     * 插入：每次放到最后
     */
    public void insert(T val){
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    /**
     * 得到顺序表pos位置的值
     */
    public T getPos(int pos){
        return this.elem[pos];
    }


}
