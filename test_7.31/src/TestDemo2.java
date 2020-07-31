import java.util.Arrays;
import java.util.Stack;

/**
 * @program:test_7.31
 * @author:Nine_odes
 * @description:
 * @create:2020-07-31 10:27
 **/
public class TestDemo2 {

    private static void quickSort1(int[] array){
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length - 1);
        stack.push(0);
        while(!stack.isEmpty()){
            int left = stack.pop();
            int right = stack.pop();
            if(left >= right){
                continue;
            }
            int pivotIndex = paration(array,left,right);
            stack.push(right);
            stack.push(pivotIndex + 1);
            stack.push(pivotIndex-1);
            stack.push(left);
        }
    }
    private static void quickSort(int[] arr,int left,int right){
        if(left >= right){
            return;
        }
        int pivotIndex = paration(arr,left,right);
        quickSort(arr,left ,pivotIndex-1);
        quickSort(arr,pivotIndex + 1,right);
    }
    private static int paration(int[] array,int left,int right){
        int d = left+1;
        int pivot = array[left];
        for(int i = left+1; i <= right; i++){
            if(array[i] < pivot){
                swap(array,i,d);
                d++;
            }

        }
        swap(array,d-1,left);
        return d-1;
    }
    private static int paration1(int[] array,int left,int right){
        int i = left;
        int j = right;
        int pivot = array[left];
        while(i < j){
            //当ij没有相遇时，选中array[left]为基准，从右侧开始比较
            while(i < j && array[j] >= pivot){
                j--;
            }
            //当array[j] < pivot时，换方向，从左侧开始寻找大于基准的值
            while(i < j && array[i] <= pivot){
                i++;
            }
            //当在左侧找到大于基准的值之后，将此时j位置的小于基准的值
            //和i位置大于基准的值进行交换
            swap(array,i,j);
        }
        //此时ij相遇，将该位置的值与left进行交换
        swap(array,i,left);
        return i;
    }
    private static void swap(int[] array,int i, int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,5,4,9,3,8,7,2,1};
        quickSort1(arr);
        System.out.println(Arrays.toString(arr));

    }
}
