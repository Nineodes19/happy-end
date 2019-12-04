package array;

import java.util.Arrays;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:动态数组
 * @create:2019-12-03 20:51
 */
//public class Myarray {
//    //具体存储元素的数组
//    private int[] num;
//    //当前动态数组中存储的元素个数
//    private int size;
//
//    public Myarray(int length){
//        num = new int[length];
//    }
//
//    /**
//     * 向动态数组中添加元素，默认向末尾添加
//     * @param data
//     */
//    public void add(int data){
//        //num[size++] = data;//先赋值后++
//        if(size == num.length){
//            //此时动态数组保存的元素个数已经达到内部num的最大值，需要扩容
//            num = Arrays.copyOf(num,num.length*2);
//        }
//        num[size] = data;
//        size++;
//    }
//
//    /**
//     * 向动态数组的任意位置插入元素
//     * @param index 插入的目标索引
//     * @param data
//     */
//
//    public void add(int index,int  data){
//        if(index < 0 || index > num.length){
//            System.out.println("索引非法！");
//            return;
//        }
//
//         // 若恰好在有效位数的尾部插入
//        if(index == size){
//            add(data);
//        }
//        //在有效位数之外在数组长度之内
//        if(index > size && index < num.length){
//            num[index] = data;
//            size++;
//        }
//        else{
//            /**
//             * 若在中间位置插入
//             * 首先判断内部数组还有没有空闲位置
//             *
//             */
//            if(size == num.length-1){
//                num = Arrays.copyOf(num,num.length << 1);
//            }
//            //将index位置以及之后的元素向后移动一位
//            System.arraycopy(num,index,num,index+1,size-index);
//        }
//    }
//
//
//    /**
//     * 在数组中查找是否有指定元素data，若有返回索引
//     */
//
//    public int find(int data){
//        return -1;
//    }
//
//    public boolean contains(int data){
//        return false;
//    }
//
//    /**
//     * 在数组中删除第一个出现的指定内容
//     */
//    public boolean remove(int data){
//        return false;
//    }
//
//    /**
//     * 修改指定索引的内容
//     * @param index 指定元素下标
//     * @param data 修改后的内容
//     * @return
//     */
//    public boolean set(int index,int data){
//        return false;
//    }
//
//    /**
//     * 返回动态数组长度
//     * @return
//     */
//    public int size(){
//        return size;
//    }
//
//    /**
//     * 打印数组内容
//     */
//    public void print(){
//        for (int i = 0; i <= size; i++) {
//            System.out.print(num[i]+"、 ");
//        }
//        System.out.println();
//    }
//
//
//}

public class Myarray {
    //存储动态数组的数据
    private int[] num;
    //存储动态数组中当前存放的元素个数
    private int size;

    /**
     * 向动态数组中添加元素，默认向数组末尾添加
     * @param data
     */
    public void add(int data) {
        if(size == num.length){
            num = Arrays.copyOf(num,num.length<<1);
        }
        num[size] = data;
        size ++;
    }

    /**
     * 向动态数组的任意位置插入元素
     * @param index 插入的目标索引
     * @param data
     */
    public void add(int index,int data) {
        if(index < 0 || index > size){
            System.out.println("索引错误！");
        }
        //正好在有效位数的尾部插入
        if(index == size){
            add(data);
        }
        //在有效位数之外数组长度之内
        if(index > size && index < num.length){
            num[size] = data;
            size++;
        }
        else{
            //若在中间位置插入
            //先判断有没有空闲
            if(size == num.length-1){
                num = Arrays.copyOf(num,num.length<<1);
            }
            //然后将index以及之后的位置向后移动
            System.arraycopy();

        }
    }

    /**
     * 在数组中查找是否有指定data的元素，若有返回索引
     * @param data
     * @return 找到返回元素下标，否则返回-1
     */
    public int find(int data) {
        return -1;
    }

    /**
     * 在数组中查找是否有指定元素
     * @param data
     * @return
     */
    public boolean contains(int data) {
        return false;
    }

    /**
     * 在数组中删除第一个出现的指定内容
     * @param data
     * @return
     */
    public boolean remove(int data) {
        return false;
    }

    /**
     * 取得指定位置的元素
     * @param index
     * @return
     */
    public int get(int index) {
        return -1;
    }
    /**
     * 修改指定索引的内容
     * @param index 指定的元素下标
     * @param data 修改后的内容
     * @return
     */
    public boolean set(int index,int data) {
        return false;
    }
    // 返回动态数组长度
    public int size() {
        return size;
    }
    // 打印动态数组内容
    public void print() {

    }
    // 清空所有数组元素
    public void clear() {

    }
}