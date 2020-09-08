import java.util.Arrays;

/**
 * @program:test_9.8
 * @author:Nine_odes
 * @description:
 * @create:2020-09-08 23:29
 **/
public class TestDemo1 {
    public int minNumberInRotateArray(int [] array) {
        /*
        把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
        输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素
        例如：数组【3,4,5,1,2】是【1,2,3,4,5】的一个旋转，该数组的最小值为1
        给出的所有元素都大于0，若数组大小为0，返回0
         */
        if(array.length == 0){
            return 0;
        }
        Arrays.sort(array);
        return array[0];
    }

    public int minNumberInRotateArray1(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int low = 0;
        int high = array.length-1;
        while(low < high){
            int mid = low + (high-low)>>1;
            if(array[mid] > array[high]){
                low = mid +1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else {
                high = mid;
            }
        }
        return array[low];
    }
}
