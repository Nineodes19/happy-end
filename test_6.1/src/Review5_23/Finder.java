package Review5_23;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_6.1
 * @author:Nine_odes
 * @description:
 * @create:2020-06-01 22:01
 **/
public class Finder {
    /**
     * 找到第K大的数组元素
     * @param a 需要排序的无序数组a
     * @param n 数组a的长度
     * @param K 第K大的元素
     * @return
     */
    public static int findKth(int[] a, int n, int K) {
        // write code here
        quick(a,0,a.length-1);
        return a[a.length - K];
    }

    public static void quick(int[] array,int left,int right){
        if(left >= right){
            return;
        }
        int pivot = part(array,left,right);
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }
    public static int part(int[] array, int left, int right){
        int tmp = array[left];
        while(left < right){
            while(left < right && array[right] >= tmp){
                right--;
            }
            if(left >= right){
                break;
            }else {
                array[left] = array[right];
            }
            while(left < right && array[left] <=tmp){
                left++;
            }
            if(left >= right){
                break;
            }else {
                array[right] = array[left];
            }
        }
        array[left] = tmp;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,2,2};
        int ret = findKth(arr,5,3);
        System.out.println(ret);
    }
}
