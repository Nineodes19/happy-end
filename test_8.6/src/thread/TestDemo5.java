package thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @program:test_8.6
 * @author:Nine_odes
 * @description:
 * @create:2020-08-06 13:45
 **/
public class TestDemo5 {
    private static class Counter{
        private long n = 0;
        public synchronized void increment(){
            n++;
        }
        public synchronized void decrement(){
            n--;
        }
        public synchronized long value(){
            return n;
        }

        public static void main(String[] args) throws InterruptedException {
            final int COUNT = 1000_0000;
            Counter counter = new Counter();
            Thread thread = new Thread(()->{
                for (int i = 0; i < COUNT; i++) {
                    counter.increment();
                }
            },"李四");
            thread.start();
            for (int i = 0; i < COUNT; i++) {
                counter.decrement();
            }
            thread.join();
            System.out.println(counter.value());
        }
    }
}
