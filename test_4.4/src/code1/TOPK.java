package code1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program:test_4.4
 * @author:Nine_odes
 * @description:
 * @create:2020-04-04 15:58
 **/

class TopKComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
public class TOPK {

    public static Integer[] findKNum(Integer[] array,int k){

        TopKComparator topKComparator = new TopKComparator();
        //建立一个堆，堆的大小是K，且传入了一个比较器，从小到大比较的
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,topKComparator);
        for (int i = 0; i < array.length; i++) {
            if(maxHeap.size() < k){
                //先将K个元素放到堆里
                maxHeap.offer(array[i]);
            }else {
                //堆里面放了K个元素
                Integer val = maxHeap.peek();
                //堆顶元素和数组当中的元素进行比较，
                //如果堆顶的小，堆顶元素先出堆，那么久把数组的元素放到堆中
                if(val!=null && val > array[i]){
                    maxHeap.poll();
                    maxHeap.offer(array[i]);

                }
            }
        }

        Integer[] ret = new Integer[k];
        for (int i = 0; i < k; i++) {
            Integer num = maxHeap.poll();
            ret[i] = num;
        }

        return ret;
    }
    public static void main(String[] args) {
        Integer[] val = {12,23,56,14,2,9,57,1};
        Integer[] ret = findKNum(val,5);
        System.out.println(Arrays.toString(ret));

    }
}
