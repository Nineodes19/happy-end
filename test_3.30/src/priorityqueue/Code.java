package priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program:test_3.30
 * @author:Nine_odes
 * @description:
 * @create:2020-03-30 20:58
 **/
public class Code {
    public static int[] samllestK(int[] arr,int k){
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
        int[] array = new int[]{2,5,1,7,4,8,3};

        System.out.println(Arrays.toString(samllestK(array,4)));
    }
}
