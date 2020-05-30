package Review5_23;

/**
 * @program:test_5.30
 * @author:Nine_odes
 * @description:
 * @create:2020-05-30 12:31
 **/

/**
 * 生产者-消费者模型--》并发编程中一种常见的编程方式
 *阻塞队列：生产者消费者模型的一种实现方式。
 *  如果队列满了，此时在进行入队列操作就会阻塞等替代，直到对垒中存在空闲位置
 *  如果队列为空，此时在进行出队列，出队列操作会阻塞等待，直到队列中北放入元素
 *
 *
 */
public class ThreadDemo22 {

    //基本特点：
    //当对垒满时，再去入队类就会阻塞等待，直到队列有空位
    //当队列为空时，再去出队列也会阻塞等待，直到队列中有元素
    //对象等待集（wait/notify）
    //wait是等待条件满足
    static class BlockingQueue{
        private int[] array = new int[1000];
        private volatile int size = 0;
        private volatile int head = 0;
        private volatile int tail = 0;

        public void offer(int value) throws InterruptedException {
            synchronized (this) {
                /**
                 * 最好写成while
                 * wait是等待唤醒，也有可能出现当前wait被唤醒了，但是条件还没有满足的情况
                 * 例如：当前有两个线程都去进行offer，都进入wait等待了
                 * 此时另外一个消费者线程进行了notiAll，
                 * 此时两个线程都被唤醒，线程1先抢到了锁，插入了新的元素，队列已满
                 * 这是线程2抢到了锁，擦哈如条件又不满足了，所以要继续等待
                 * 这时如果没有进行等待，而是继续往下进行具体点的插入操作，可能就出错了
                 *
                 * 同一时刻，要么生产者等待，要么消费者等待，不可能两者同时在等
                 */
                while(size == array.length){
                    wait();
                }
                array[tail] = value;
                tail++;
                if(tail == array.length){
                    tail = 0;
                }
                size++;
                //此处的通知是为了唤醒消费者来去进行获取数据
                notify();
            }
        }

        public int poll() throws InterruptedException {
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
                size--;
                //此处是为了唤醒生产者线程来进行插入数据
                notify();
            }
            return ret;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue();
        Thread customer = new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        int value = blockingQueue.poll();
                        System.out.println("消费者：" + value);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        customer.start();

        Thread producer = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    try {
                        blockingQueue.offer(i);
                        System.out.println("生产者：" + i);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();

        customer.join();
        producer.join();
    }
}
