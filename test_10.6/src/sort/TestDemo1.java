package sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * @program:test_10.6
 * @author:Nine_odes
 * @description:
 * @create:2020-10-06 19:49
 **/
public class TestDemo1 {

    public static void main(String[] args) {
        int[] array = new int[]{6,1,2,7,9,3,4,5,10,8};
        quickSort1(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort1(int[] array){
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length - 1);
        stack.push(0);

        while(!stack.isEmpty()){
            int left = stack.pop();
            int right = stack.pop();
            if(left >= right){
                continue;
            }

            int pivotIndex = partition(array,left,right);
            stack.push(right);
            stack.push(pivotIndex + 1);
            stack.push(pivotIndex-1);
            stack.push(left);
        }
    }
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(int[] array,int left,int right){
        if(left >= right){
            return;
        }
        int pivotIndex = partition(array,left,right);
        quickSortInternal(array,left,pivotIndex-1);//基准值的左半边，都小于基准值
        quickSortInternal(array,pivotIndex +1,right);//基准值的右边，都大于基准值
    }
    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    private static int partition1(int[] array,int left,int right){
        int i = left;
        int j = right;
        int pivot = array[left];
        while(i < j){
            while(i < j &&array[j] >= pivot){
                //从最右侧开始遍历，当遇到的值小于基准值时，跳出while循环，
                //否则继续从右向左遍历
                j--;
            }
            while(i < j && array[i] <= pivot){
                //从最左侧开始遍历，当遇到的值大于基准值时跳出while循环
                //否则继续向右遍历
                i++;
            }
            //此时i位置的值是大于基准值，j位置的值小于基准值
            //将i，j交换，就是将小于基准的值放到基准值的左侧，大于基准值的放到右侧
            swap(array,i,j);
        }
        //一趟循环结束,此时ij相遇，相遇点就是基准值应该在的位置
        swap(array,i,left);
        return i;
    }

    private static int partition2(int[] array,int left,int right){
        int i = left;
        int j = right;
        int pivot = array[left];
        while(i < j){
            while(i<j && array[j] >= pivot){
                j--;
            }
            array[i] = array[j];
            while(i<j && array[i] <= pivot){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        return i;
    }

    private static int partition(int[] array,int left,int right){
        int d = left +1;
        int pivot = array[left];
        for (int i = left +1; i <= right ; i++) {
            if(array[i] < pivot){
                swap(array,i,d);
                d++;
            }
        }
        swap(array,d-1,left);

        return d-1;
    }
}
