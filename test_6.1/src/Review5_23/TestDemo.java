package Review5_23;

import java.util.Arrays;

/**
 * @program:test_6.1
 * @author:Nine_odes
 * @description:
 * @create:2020-06-01 21:49
 **/

//class Student{
//    public int i;
//    static String s;
//    void methond1(){
//
//    }
//    static void method2(){}
//    private String name = "jiuge";
//}
//public class TestDemo extends Student{
//    static int i;
//    public static void main(String[] args) {
//        Student student = new Student();
//        Student.method2();
//
//    }
//}

public class TestDemo{
    public static int partion(int[] array,int left,int right){
        int tmp = array[left];
        while(left < right){
            while(left < right && array[right] >= tmp){
                right --;
            }
            if(left >= right){
                break;
            }else{
                array[left] = array[right];
            }

            //在前面找到比tmp大的数据
            while(left < right && array[left] <= tmp){
                left ++;
            }
            if(left >= right){
                break;
            }else{
                array[right] = array[left];
            }


        }
        array[left] = tmp;
        return left;
    }

    public static void quickSort(int[] array,int left,int right){
        quick(array,0,array.length - 1);

    }

    private static void quick(int[] array, int left, int right) {
        if(left >= right){
            return;
        }
        int pivot = partion(array,left,right);
        quick(array,left,pivot - 1);
        quick(array,pivot+1,right);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,10,4,12,6,14,50,21,20};
        quickSort(arr,0,arr.length- 1);
        System.out.println(Arrays.toString(arr));
    }
}