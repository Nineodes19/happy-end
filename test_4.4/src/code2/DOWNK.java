package code2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program:test_4.4
 * @author:Nine_odes
 * @description:
 * @create:2020-04-04 16:16
 **/

class TopkComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}

public class DOWNK {

    public static Integer[] findKNum(Integer[] array,int K){

        TopkComparator topkComparator = new TopkComparator();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(K,topkComparator);
        for (int i = 0; i < array.length; i++) {
            if(minHeap.size() < K){
                minHeap.offer(array[i]);
            }else{
                Integer val = minHeap.peek();
                if(val!= null && val < array[i]){
                    minHeap.poll();
                    minHeap.offer(array[i]);
                }
            }
        }

        Integer[] ret = new Integer[K];
        for (int i = 0; i < K; i++) {
            ret[i] = minHeap.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        Integer[] array = {12,23,56,14,2,9,57,1};
        Integer[] ret = findKNum(array,3);
        System.out.println(Arrays.toString(ret));
    }
}
