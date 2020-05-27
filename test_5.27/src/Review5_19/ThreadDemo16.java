package Review5_19;

/**
 * @program:test_5.27
 * @author:Nine_odes
 * @description:
 * @create:2020-05-27 16:58
 **/
public class ThreadDemo16 {
    static class Counter{
        volatile public int count = 0;
        public void increase(){
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
