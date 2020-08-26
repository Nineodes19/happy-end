import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program:test_8.26
 * @author:Nine_odes
 * @description:
 * @create:2020-08-26 23:45
 **/
public class Solution {
    public static int[] smallestK(int[] arr,int k){
        if(null == arr || k <= 0){
            return new int[0];
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(arr.length);
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
        int[] arr = new int[]{2,1,4,8,5,6,4};
        System.out.println(Arrays.toString(smallestK(arr,4)));
    }
}
