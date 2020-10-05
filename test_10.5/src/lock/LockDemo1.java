package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program:test_10.5
 * @author:Nine_odes
 * @description:
 * @create:2020-10-05 20:24
 **/
public class LockDemo1 {
    private static final Lock lock = new ReentrantLock(false);

    public static void main(String[] args) {
        new Thread(()-> test(),"线程A").start();
        new Thread(()-> test(),"线程B").start();
        new Thread(()-> test(),"线程C").start();
        new Thread(()-> test(),"线程D").start();
        new Thread(()-> test(),"线程E").start();
    }
    public static void test(){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "已经获取到了锁");
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            //System.out.println(Thread.currentThread().getName() + "释放了锁");
            lock.unlock();
        }
    }
}
