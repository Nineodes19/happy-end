/**
 * @program:test_5.23
 * @author:Nine_odes
 * @description:
 * @create:2020-05-23 16:03
 **/
public class ThreadDemo2 {
    //基本特点
    //当队列满时，再去入队列就会阻塞等待，直到队列有空余位置
    //当队列为空时，再去出队列也会阻塞等待，直到队列中有元素
    //对象等待集（wait、
    static class BlockingQueue{
        private int[]  array = new int[1000];
        private volatile int size = 0;
        private volatile int head = 0;
        private volatile int tail = 0;

        public void offer(int value) throws InterruptedException {
            synchronized (this){
                while(size == array.length){
                    wait();
                }
                array[tail] = value;
                tail ++;
                if(tail == array.length){
                    tail = 0;
                }
                size ++;

                //此处的通知是为了唤醒消费者来去进行获取数据
                notify();
            }

        }

        public int poll() throws InterruptedException {
            int ret = 0;
            synchronized (this){
                while(size == 0){
                    wait();
                }
                ret = array[head];
                head ++;
                if(head == array.length){
                    head = 0;
                }
                size --;
                return ret;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue();

        Thread customer = new Thread(){
            public void run(){
                while(true){
                    try {
                        int value = blockingQueue.poll();
                        System.out.println("消费者：" + value);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        customer.start();
        Thread producer = new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    try {
                        blockingQueue.offer(i);
                        System.out.println("生产者:" + i);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();

//        customer.join();
//        producer.join();
    }
}
