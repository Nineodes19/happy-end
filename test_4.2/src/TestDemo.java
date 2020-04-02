import java.util.Arrays;

/**
 * @program:test_4.2
 * @author:Nine_odes
 * @description:
 * @create:2020-04-02 22:26
 **/
public class TestDemo {

    //希尔排序
    public static void shellSort(int[] array){
        int gap = array.length;
        while(gap > 1){
            insertSortGap(array,gap);
            gap = gap / 2;
        }
        insertSortGap(array,1);
    }

    public static void insertSortGap(int[] array,int gap){
        for(int i = 1; i < array.length; i ++){
            int v = array[i];
            int j = i - gap;
            for(; j >= 0 && array[j] > v; j -= gap){
                array[j+gap] = array[j];
            }
            array[j+gap] = v;
        }
    }


    //直接选择排序
    public static void selectSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int max = 0;
            for(int j = 0; j < array.length - i; j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            int t = array[max];
            array[max] = array[array.length-i-1];
            array[array.length-i-1] = t;
        }
    }

    //建堆
    private static void creatHeap(int[] array){
        for (int i = (array.length-1)/2; i >= 0 ; i--) {
            shiftDown(array,array.length,i);
        }
    }

    public static void shiftDown(int[] array,int size,int index){
        int left = 2*index+1;
        while(left < size){
            int max = left;
            int right = 2*index+2;
            if(right < size){
                if(array[right] > array[left]){
                    max = right;
                }
            }

            if(array[index] >= array[max]){
                break;
            }

            int t = array[index];
            array[index] = array[max];
            array[max] = t;

            index = max;
            left = 2*index+1;
        }
    }

    //堆排序
    public static void heapSort(int[] array){
        creatHeap(array);
        for(int i = 0; i < array.length-1; i++){
            swap(array,0,array.length-1);
            shiftDown(array,array.length-i-1,0);
        }
    }

    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15,23,10,2,32,12,69,99,88,45,32,41};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
