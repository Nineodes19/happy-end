package Review5_23;

/**
 * @program:test_6.1
 * @author:Nine_odes
 * @description:
 * @create:2020-06-01 18:01
 **/
public class ThreadDemo22 {

    static class BlockingQueue{
        private int[] array = new int[1000];
        private volatile int size = 0;
        private volatile int head = 0;
        private volatile int tail = 0;

        public void offer(int value) throws InterruptedException {
            synchronized (this) {
                //最好写成while，wait是等待唤醒
                //也有可能出现当前wait被唤醒了，但是当前还没有满足的情况
                //例如当前有两个线程都去进行offer，都进入wait等待了，此时另外一个消费者线程进行了notifyAll
                //此时两个线程都被唤醒了
                //线程1先抢到了锁，线程1插入了新的元素，此时队列又慢了
                //这时候线程2抢到了锁，但是此时 插入条件又不满足了，所以要继续等待
                //这是如果不等待，而是继续往下指向性具体的插入操作，可能就出错了
                while(size == array.length){
                    wait();
                }
                array[tail] = value;
                tail++;
                if(tail == array.length){
                    tail = 0;
                }
                size++;
                notify();//此处的通知是为了唤醒消费者去进行获取数据
            }
        }

        public int poll() throws InterruptedException {
            int ret = 0;
            synchronized (this) {
                while(size== 0){
                    wait();
                }
                ret = array[head];
                head++;
                if(head == array.length){
                    head = 0;
                }
                size--;
                notify();//为了唤醒生产者线程来进行插入数据
            }
            return ret;
        }
    }
    public static void main(String[] args) {

    }
}
