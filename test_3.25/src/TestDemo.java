import java.util.*;

/**
 * @program:test_3.25
 * @author:Nine_odes
 * @description:
 * @create:2020-03-25 19:09
 **/

class Person implements Comparable {
    public String name;
    public int age;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class TestDemo {

    public static int[] smallestK(int[] array,int k){
        int[] ret = new int[k];
        if(array == null || k <= 0){
            return ret;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            priorityQueue.offer(array[i]);
        }
        for (int i = 0; i < k; i++) {
            ret[i]= priorityQueue.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        /*PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Person());
        priorityQueue.offer(new Person());
        priorityQueue.offer(new Person());
        System.out.println(priorityQueue);*/
        int[] arr = {1,3,5,6,2,7,4};
        System.out.println(Arrays.toString(smallestK(arr,4)));
    }

    public static void main1(String[] args) {
        /**
         * PriorityQueue 当中，最小的元素优先级更高一点
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();//容量默认是11
        priorityQueue.offer(6);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.peek());//队头元素是最小元素


        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(20);//给一个容量
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(12);
        Iterator<Integer> it = arrayList.iterator();//迭代器
        //arrayList.iterator()返回一个迭代器对象
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(56);
        list.add(23);
        System.out.println("====================");
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(list);
        Iterator<Integer> i2 = priorityQueue2.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
    }
}
