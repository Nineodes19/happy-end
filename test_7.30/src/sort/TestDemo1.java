package sort;

import java.util.Arrays;

/**
 * @program:test_7.30
 * @author:Nine_odes
 * @description:
 * @create:2020-07-30 08:47
 **/
public class TestDemo1 {
    //①直接插入排序
    public static void insertSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int v = array[i];//无序空间的第一个数
            int j = i-1;//有序空间的最后一个数
            for(;j >=0&& array[j] > v; j--){
                array[j+1] = array[j];
            }
            array[j+1] = v;
        }
    }

    //②折半插入排序
    private static void bsInsertSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int v = array[i];
            int left = 0;
            int right = i;
            while(left < right){
                int m = (left + right) >> 1;
                if(v >= array[m]){
                    left = m+1;
                }else{
                    right = m;
                }
            }
            for(int j = i; j > left; j--){
                array[j] = array[j-1];
            }
            array[left] = v;
        }
    }

    //③希尔排序
    private static void shellSort(int[] array){
        //希尔排序是对直接插入排序的优化
        int gap = array.length;
        while(gap > 1){
            insertSortGap(array,gap);
            gap /=2;
        }
        insertSortGap(array,1);
    }
    private static void insertSortGap(int[] array,int gap){
        for(int i = 1; i < array.length; i++){
            int v = array[i];
            int j = i-gap;
            for(; j >=0 && array[j] > v; j-=gap){
                array[j+gap] = array[j];
            }
            array[j + gap] = v;
        }
    }

    //④直接选择排序
    private static void selectSort(int[] array){
        for(int i = 0 ; i < array.length; i++){
            int max = 0;
             for(int j = 1; j < array.length - i; j++){
                 if(array[max] < array[j]){
                     max = j;
                 }
             }
             int t = array[max];
             array[max] = array[array.length-i-1];
             array[array.length - i-1] = t;
        }
    }
    //⑤双向选择排序
    private static void selectSortOP(int[] array){
        int low = 0;
        int high = array.length - 1;
        // [low, high] 表示整个无序区间
        // 无序区间内只有一个数也可以停止排序了
        while (low <= high) {
            int min = low;
            int max = low;
            for (int i = low + 1; i <= max; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            swap(array, min, low);
            // 见下面例子讲解
            if (max == low) {
                max = min;
            }
            swap(array, max, high);
        }
    }


    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static void heapSort(int[] array){
        createHeap(array);
        for (int i = 0; i <array.length -1 ; i++) {
            swap(array,0,array.length-1);
            shiftDown(array,array.length-1-i,0);
        }
    }
    private static void createHeap(int[] array){
        for(int i = (array.length - 1) / 2; i >= 0; i--){
            shiftDown(array,array.length,i);
        }
    }
    private static void shiftDown(int[] array,int size,int index){
        int left = 2 *index +1;
        while(left < size){
            int max = left;
            int right = 2 *index + 2;
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
            left = 2 * index +1;
        }
    }

    private static void bubbleSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            boolean isSorted = true;
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }

    //快速排序
    private static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }
    private static void quickSortInternal(int[] array,int left,int right){
        if(left == right) return;
        if(left > right) return;
        int pivotIndex = partition(array,left,right);
        quickSortInternal(array,left,pivotIndex-1);
        quickSortInternal(array,pivotIndex+1,right);
    }

    private static int partition(int[] array,int left,int right){
//        int i = left;
//        int j = right;
//        int pivot = array[left];
//        while(i < j){
//            while(i <j && array[j] >= pivot){
//                j--;
//            }
//            while(i < j && array[i] <= pivot){
//                i++;
//            }
//            swap(array,i,j);
//        }
//        swap(array,i,left);
//        return i;

        int d = left +1;
        int pivot = array[left];
        for(int i= left + 1; i <= right; i++){
            if(array[i] < pivot){
                swap(array,i,d);
                d++;

            }
        }
        swap(array,d-1,left);
        return d-1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9,1,2,5,7,4,8,6,3,5};
//        insertSort(arr);
//        bsInsertSort(arr);
//        shellSort(arr);
//        selectSort(arr);
//        selectSortOP(arr);


//            heapSort(arr);

//        bubbleSort(arr);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
