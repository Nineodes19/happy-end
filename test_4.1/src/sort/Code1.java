package sort;

import java.util.Arrays;

/**
 * @program:test_4.1
 * @author:Nine_odes
 * @description:
 * @create:2020-04-01 14:44
 **/
public class Code1 {

    public static void shellSort(int[] array){
        int gap = array.length;
        while(gap > 1){
            insertSortGap(array,gap);
            gap = (gap / 3) + 1;
        }
        insertSortGap(array,1);
    }

    private static void insertSortGap(int[] array,int gap){
        for(int i = 1; i < array.length; i++){
            int v = array[i];
            int j = i - gap;
            for(; j >= 0 && array[j] > v; j -= gap){
                array[j + gap] = array[j];
            }
            array[j + gap] = v;
        }
    }

    /**
     * 折半插入排序
     * @param array
     */
    public static void bsInsertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int left = 0;
            int right = i;
            while(left < right){
                int mid = (left + right) / 2;
                if(v >= array[mid]){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }

            for(int j = i; j > left; j --){
                array[j] = array[j - 1];
            }
            array[left] = v;
        }
    }

    //直接插入排序
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i - 1;
            for(;j >= 0 && array[j] > v;j--){
                array[j+1] = array[j];
            }
            array[j+1] = v;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,44,65,5,7,32,43,1};
        insertSortGap(arr,1);
        System.out.println(Arrays.toString(arr));
    }
}
