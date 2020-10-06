package sort;

import javax.naming.ldap.PagedResultsControl;

/**
 * @program:test_10.6
 * @author:Nine_odes
 * @description:
 * @create:2020-10-06 22:09
 **/


public class TestDemo2 {

    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length);
    }

    private static void mergeSortInternal(int[] array,int low,int high){
        if(low >= high-1){
            return;
        }
        int mid = (low+high) / 2;//mid是low和high的中间值
        mergeSortInternal(array,low,mid);//对mid左边的数组元素进行归并排序
        mergeSortInternal(array,mid,high);//对mid右边的数组元素进行归并排序

        merge(array,low,mid,high);
    }
    private static void merge(int[] array,int low,int mid,int high){
        int i = low;
        int j = mid;
        int length = high-low;
        int[] extra = new int[length];
        int k = 0;
        while(i < mid && j < high){
            if(array[i] <= array[j]){
                //i是第一个有序数组的最开始元素
                //j是第二个有序数组的最开始元素
                extra[k++] = array[i++];//将较小元素存储进extra
            }else{
                extra[k++] = array[j++];
            }
        }
        while(i < mid){
            //此时代表着跳出第一个循环的条件是j<high，这时第一个有序数组还有剩余元素
            extra[k++] = array[i++];
        }
        while(j < high){
            extra[k++] = array[j++];
        }

        //此时数组extra中存储的元素就是已经合并好的有序数组
        //这时候我们需要将其中的元素再存储到array中
        for (int t = 0; t < length; t++) {
            array[low + t] = extra[t];//从low开始是因为array的合并起点是low
        }
    }

    private static void merge1(int[] array,int low,int mid,int high){
        int i = low;
        int j = mid;
        int length = high-low;
        int[] extra = new int[length];
        int k = 0;
        while(i < mid && j < high){
            if(array[i] <= array[j]){
                extra[k++] = array[i++];
            }else{
                extra[k++] = array[j++];
            }
        }
        while(i < mid){
            extra[k++] = array[i++];
        }
        while(j < high){
            extra[k++] = array[j++];
        }
        for (int l = 0; l < length; l++) {
            array[low +l] = extra[l];
        }
    }
}
