package review5_25;

/**
 * @program:test_6.12
 * @author:Nine_odes
 * @description:
 * @create:2020-06-13 23:41
 **/
public class ThreadDemo27 {
    static class BlockingQueue{
        private int[] array = new int[1000];
        private volatile int head = 0;
        private volatile int tail = 0;
        private volatile int size = 0;

        public void put(int val) throws InterruptedException {
            //把val放到队尾位置上即可
            synchronized (this) {
                while(size == array.length){
                    this.wait();
                }
                array[tail] = val;
                tail++;
                if(tail >= array.length){
                    tail = 0;
                }
                size++;
                notify();
            }
        }
        public int take() throws InterruptedException {
            int ret = 0;
            synchronized (this) {
                while(size == 0){
                    wait();
                }
                ret = array[head];
                head++;
                if(head >= array.length){
                    head = 0;
                }
                size--;
                notify();
            }
            return ret;
        }

    }
}
