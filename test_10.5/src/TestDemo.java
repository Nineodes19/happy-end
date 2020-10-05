import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @program:test_10.5
 * @author:Nine_odes
 * @description:
 * @create:2020-10-05 19:10
 **/
public class TestDemo {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 11; i >0; i--) {
            q.offer(i);
        }
        q.offer(13);

        while(!q.isEmpty()){
            System.out.println(q);
            System.out.println(q.poll());
        }
        System.out.println(q.poll());
    }
}
