import java.util.PriorityQueue;

/**
 * @program:test_10.4
 * @author:Nine_odes
 * @description:
 * @create:2020-10-04 23:49
 **/
public class Solution {
    public int[] smallestK(int[] arr,int k){
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
}
