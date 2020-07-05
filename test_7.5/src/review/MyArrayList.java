package review;

/**
 * @program:test_7.5
 * @author:Nine_odes
 * @description:顺序表
 * @create:2020-07-05 15:12
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    public void insert(int val){
        this.elem[usedSize] = val;
        usedSize++;
    }

    public int getPos(int pos){
        return this.elem[pos];
    }

}
