import java.util.Arrays;

/**
 * @program:test_3.28
 * @author:Nine_odes
 * @description:
 * @create:2020-03-28 15:04
 **/

public class TestHeap {

    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public void adjustUp(int child) {

        int parent = (child-1)/2;
        while(child > 0){
            if(this.elem[child] >= this.elem[parent]){
                int temp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = temp;
                child = parent;
                parent = (child - 1) / 2;
            }else {
                break;
            }
        }

    }
    public void adjustDown(int child, int usedSize) {

        int parent = (child-1)/2;
        while(child > 0){
            if(this.elem[child] >= this.elem[parent]){
                int temp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = temp;
                child = parent;
                parent = (child - 1) / 2;
            }else {
                break;
            }
        }

    }

    public void push(int val) {
        if(isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }

        this.elem[this.usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
    }

    private boolean isFull(){
        return this.usedSize == 0;
    }

    private boolean isEmpty(){
        return this.usedSize == this.elem.length;
    }

    public void pop(){
//        if(this.usedSize == 0){
//            return;
//        }
        if(isEmpty()){
            throw new RuntimeException("堆为空");
        }
        this.elem[0] = this.elem[this.usedSize - 1];
        this.usedSize--;
        adjustDown(0,this.usedSize);
    }

    public int getTop(){
        if(isEmpty()){
            throw new RuntimeException("堆为空");
        }
        return this.elem[0];
    }

    public void createHeap(int[] array){

    }

    /**
     * 时间复杂度;O（nlogn）
     * 空间复杂度：O（1）
     * 稳定性：不稳定
     * @param array
     */
    public void heapSort(int[] array){
        //1.创建大根堆
        createHeap(array);
        //2.堆顶元素和最后一个元素叫唤
        int end = array.length - 1;
        while(end > 0){
            int temp = array[0];
            array[0] = array[end];
            array[end] = temp;
            //adjustDown(array,0,end);
            end --;
        }
    }

    public static void insertSort(int[] array){
        //直接插入排序
        for (int i = 1 ,j;i < array.length; i++) {
            int tmp = array[i];
            for (j = i-1; j  >= 0; j--) {
                if(array[j] >= tmp){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    //直接插入排序
    public static void shell(int[] array,int gap) {
        for (int i = gap,k; i < array.length; i++) {
            int temp = array[i];
            for (k = i - gap; k >= 0; k -= gap) {
                if(array[k] > temp){
                    array[k+gap] = array[k];
                }else{
                    break;
                }
            }
            array[k + gap] = temp;
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    /**
     *每次从待排序数字的后面选取一个比当前数字小的数据进行交换
     * 直到当前的序列遍历完成
     * 时间复杂度：O（n^2) 不分好坏
     * 空间复杂度：O（1）
     * 稳定性：不稳定的排序
     * @param array
     */
    public static void selectSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] <= array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
//        int[] array = new int[10_1000];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        long startTime = System.currentTimeMillis();
//        insertSort(array);
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);
        int[] arr = {12,4,6,9,2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main1(String[] args) {
        int[] array = {12,4,6,9,2};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

}
