package lock;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program:test_10.5
 * @author:Nine_odes
 * @description:
 * @create:2020-10-05 20:35
 **/
public class LockDemo3 {
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();
    static class ThreadDemo implements Runnable{
        Lock firstLock;
        Lock secondLock;
        public ThreadDemo(Lock firstLock, Lock secondLock) {
            this.firstLock = firstLock;
            this.secondLock = secondLock;
        }
        @Override
        public void run() {
            try{
                firstLock.lockInterruptibly();
                TimeUnit.MILLISECONDS.sleep(50);
                secondLock.lockInterruptibly();
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                firstLock.unlock();
                secondLock.unlock();
                System.out.println(Thread.currentThread().getName() + "获取到了资源，正常结束！");
            }
        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo(lock1,lock2));
        Thread thread1 = new Thread(new ThreadDemo(lock2,lock1));
        thread.start();
        thread1.start();
        thread1.interrupt();//是第一个线程中断
    }


}
