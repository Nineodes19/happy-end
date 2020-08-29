import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @program:test_8.29
 * @author:Nine_odes
 * @description:
 * @create:2020-08-29 22:28
 **/
public class TestDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>();//默认数组容量为11
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);

        PriorityQueue<Integer> q3 = new PriorityQueue<>(list);
        System.out.println(q3);
        System.out.println(q3.size());
        System.out.println(q3.peek());
    }
}
