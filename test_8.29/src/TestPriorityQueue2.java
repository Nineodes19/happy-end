import java.util.PriorityQueue;

/**
 * @program:test_8.29
 * @author:Nine_odes
 * @description:
 * @create:2020-08-29 22:34
 **/
public class TestPriorityQueue2 {
    public static void main(String[] args) {
        int[] arr = {4,1,9,2,8,0,3,6,5};
        PriorityQueue<Integer> q = new PriorityQueue<>(arr.length);
        for(int e: arr){
            q.offer(e);
        }
        System.out.println(q.size());
        System.out.println(q);
        System.out.println(q.peek());

        q.poll();
        q.poll();
        System.out.println(q.size());
        System.out.println(q);
        System.out.println(q.peek());

        q.offer(0);
        System.out.println(q);
        System.out.println(q.peek());

        while (q.isEmpty()) {
            System.out.println(q);
            q.peek();
        }


//        q.clear();
//        if(q.isEmpty()){
//            System.out.println("优先级队列已经为空！！");
//        }else{
//            System.out.println("优先级队列不为空！！");
//        }
    }


}
