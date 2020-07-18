package review;

/**
 * @program:test_717
 * @author:Nine_odes
 * @description:
 * @create:2020-07-17 19:13
 **/
public class ThreadDemo22 {
    /**
     * 基本特点：
     * 当队列满时，再去入队列会阻塞等待，直到队列有空余位置
     * 当队列空时，再去出队列会阻塞等待，直到队列中有元素
     * 对象等待集（wait/notify）
     * wait 等待条件满足
     */
    static class BlockingQueue{}
    private int[] array = new int[1000];
    private volatile int size = 0;
    private volatile int head = 0;
    private volatile int tail = 0;
    public static void offer(int value) throws InterruptedException {
        synchronized (this) {
            //使用while是担心wait被意外唤醒
            while(size == array.length){
                wait();
            }
            array[tail] = value;
            tail++;
            if(tail == array.length){
                tail = 0;
            }
            size++;

            //此处的通知是为了唤醒消费者来去进行获取
            notify();
        }
    }

    public static int poll() throws InterruptedException {
        int ret = 0;
        synchronized (this) {
            while(size == 0){
                wait();
            }
            ret = array[head];
            head++;
            if(head == array.length){
                head = 0;
            }
            size --;

            notify();
        }
        return ret;
    }

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();
        Thread worker = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    blockingQueue.offer();
                    System.out.println("生产者： " + i);
                }
            }
        };
        worker.start();

        Thread customer = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    blockingQueue.poll();
                    System.out.println("消费者： " + i);
                }
            }
        };
        customer.start();
    }
}
