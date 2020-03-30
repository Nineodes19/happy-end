package priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program:test_3.30
 * @author:Nine_odes
 * @description:
 * @create:2020-03-30 15:05
 **/
public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,5,7,2};
        PriorityQueue<Integer> q = new PriorityQueue<>(arr.length);
        for(int i : arr){
            q.offer(i);
        }

        System.out.println(q);
        //输出优先级队列q中有效元素个数
        System.out.println(q.size());

        //获取并输出优先级队列q中优先级最高的元素
        System.out.println(q.peek());

        //从优先级队列q中删除两个元素
        q.poll();
        q.poll();
        System.out.println(q);
        System.out.println(q.size());//获取优先级队列的有效元素个数
        System.out.println(q.peek());//获取优先级队列中优先级最高的元素

        q.clear();
        if(q.isEmpty()){
            System.out.println("优先级队列已经为空！");
        }else{
            System.out.println("优先级队列不为空！");
        }
    }

    public static void main1(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(52);
        q.offer(23);
        q.offer(12);

        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.offer(15);
        q.offer(25);
        q.offer(45);
        System.out.println("q的大小="+q.size());
        System.out.println(q);
        System.out.println("q的顶层元素：" + q.peek());

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(new PriorityQueue(list));
        PriorityQueue<String> q1 = new PriorityQueue<>(4);
        System.out.println("插入数据前q1的大小：" + q1.size());
        q1.offer("jiuge");
        q1.offer("qingchen");
        q1.offer("319");
        q1.offer("zoumeng");
        System.out.println("q1的长度是：" + q1.size());
        System.out.println("q1的元素是："+q1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("给q1中添加元素“九歌”是否成功：" + q1.offer("九歌"));
        System.out.println("给q中添加元素“47”是否成功：" + q.offer(47));
        System.out.println("能否获取q中优先级最高的元素：" + q.peek());
        q1.clear();
        System.out.println("能否获取q1中优先级最高的元素：" + q1.peek());
        System.out.println("检测优先级队列q是否为空：" + q.isEmpty());
        System.out.println("检测优先级队列q1是否为空：" + q1.isEmpty());
    }
}

