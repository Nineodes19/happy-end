import java.util.Arrays;

/**
 * @program:test_7.31
 * @author:Nine_odes
 * @description:
 * @create:2020-07-31 08:53
 **/
public class TestDemo1 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,7,8,1,9,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] array,int left,int right){
        if(left == right || left > right){
            return;
        }
        //找到基准值停留的下标
        int pivotIndex = partition(array,left,right);
        quickSort(array,left,pivotIndex-1);
        quickSort(array,pivotIndex+1,right);
    }
    private static int partition(int[] arr,int left,int right){
        int i = left;
        int j = right;
        int pivot = arr[left];//选取区间得到第一个数作为基准
        while(i < j){//代表区间还有值
            //基准在左侧，从右侧开始判断
            while(i < j && arr[j] >= pivot){
                //当右侧的数较大时，右边的游标左移
                j--;
            }
            //arr[j] < pivot，跳出第一个while循环，从左侧开始与基准比较
            while(i < j && arr[i] <= pivot){
                //当左侧数小于等于基准值，左侧游标右移
                i++;
            }
            //arr[i] > pivot ,此时在左侧找到大于基准 ，右侧找到小于基准
            //下标分别为i，j，将两个值进行交换
            swap(arr,i,j);
            //交换结束后判断循环条件i<j是否需满足，继续执行while循环
        }
        //此时ij相遇， 交换arr[i] 和arr、[left]
        swap(arr,i,left);
        return i;

    }
    private static void swap(int [] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
