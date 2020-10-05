import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

/**
 * @program:test_10.5
 * @author:Nine_odes
 * @description:
 * @create:2020-10-05 19:39
 **/
public class TestDemo1 {
    public static int[] smallestK(int[] arr,int k){
        if(null == arr || k <= 0){
            return new int[0];
        }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = q.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,7,5,1,2,6};
        System.out.println(Arrays.toString(smallestK(arr,3)));
    }
}
