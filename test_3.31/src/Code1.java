import java.util.Arrays;
import java.util.Random;

/**
 * @program:test_3.31
 * @author:Nine_odes
 * @description:
 * @create:2020-03-31 19:02
 **/
public class Code1 {

    public static int partion(int[] array,int left,int right){
        int temp = array[left];
        while(left < right){
            while(array[right] >= temp && left < right){
                right--;
            }
            if(left >= right){
                break;
            }else{
                array[left] = array[right];
            }
            while(array[left] <= temp && left < right){
                left++;
            }
            if(left >= right){
                break;
            }else{
                array[right] = array[left];
            }
        }
        array[left] = temp;
        return left;
    }

    /**
     * 时间复杂度：k*n*logn
     * 空间复杂度：logn
     * 稳定性：不稳定排序
     * @param array
     * @param start
     * @param end
     */
    public static void quick(int[] array,int start,int end){
        if(start >= end){
            return;
        }

        int pivot = partion(array,start,end);
        quick(array,start,pivot - 1);
        quick(array,pivot + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[10_10000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        long startTime = System.currentTimeMillis();
        quick(arr,0,arr.length - 1);
        long endTime = System.currentTimeMillis();
        //System.out.println(Arrays.toString(arr));
        System.out.println(endTime - startTime);
    }
}
