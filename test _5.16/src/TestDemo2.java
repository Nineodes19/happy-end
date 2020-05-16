import com.sun.org.apache.xml.internal.serializer.ToHTMLSAXHandler;
import oracle.jrockit.jfr.jdkevents.ThrowableTracer;

/**
 * @program:test _5.16
 * @author:Nine_odes
 * @description:
 * 多个线程并发式的修改同一个数据的时候，此时就可能导致最终结果不可预期
 * 线程不安全问题：【线程的“抢占式”执行】
 *
 * @create:2020-05-16 16:02
 **/
public class TestDemo2 {
    static class Counter{
        public int count = 0;

        //意味着进入方法的时候会加锁【lock】
        //结束方法的时候会解锁【unlock】
        synchronized public void increase(){
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
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
