import java.util.ArrayList;
import java.util.List;

/**
 * @program:test_5.12
 * @author:Nine_odes
 * @description:
 * @create:2020-05-12 14:40
 **/
public class TestDemo2 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>result = new ArrayList<>();
        int left = 0;
        int length = arr.length;
        int right = length -1;
        while(left < right){
            int mid = (left +right) >> 1;
            if(mid + k >= length || Math.abs(arr[mid] - x) <= Math.abs(arr[mid+k] -x)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        for(int i = left; i < left +k; i++){
            result.add(arr[i]);
        }
        return result;
    }
}
