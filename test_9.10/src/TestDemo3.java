import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;

/**
 * @program:test_9.10
 * @author:Nine_odes
 * @description: 调整数组顺序使奇数位于偶数前面
 * @create:2020-09-10 23:39
 **/
public class TestDemo3 {
    /*
    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
    使得所有的奇数位于数组的前半部分，并保证奇数和奇数，
    偶数和偶数之间的对应位置不变
     */
    public void reOrderArray(int[] array){
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for(int i:array){
//            if(i % 2 != 0){
//                list1.add(i);
//            }else{
//                list2.add(i);
//            }
//        }


        int m = array.length;
        int k = 0;
        for(int i = 0; i < m; i++){
            if(array[i] % 2 == 1){
                int j = i;
                while(j > k){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                k++;
            }
        }
    }
}
