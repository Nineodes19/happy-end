package Review5_20;

/**
 * @program:test_5.28
 * @author:Nine_odes
 * @description:
 * @create:2020-05-28 20:41
 **/

import org.omg.PortableServer.THREAD_POLICY_ID;


/**
 * IDEA的surround功能
 * 例如需要 给某段代码上面包裹上一段逻辑（if while）
 * 选中指定代码，Ctrl+alt + t
 * IDEA的surround是诸多开发工具中比较弱的
 */

/**
 * wait和sleep的对比
 *  1.sleep的等待时间是已知的，wait的等待时间sh8i不可控的
 *  2.线程调用sleep状态是TIMED_WAITING。调用wait进入的WAITING
 *  3.wait必须搭配锁使用，sleep和锁无关
 *
 *  NEW：Thread对象与哦了，PCB还没有
 *  RUNNABLE：就绪状态，当前这个线程准备就绪，随时可以在CPU上执行，或者正在执行
 *  TERMATED：PCB已销毁，Thread对象还在
 *
 *  WAITING：线程阻塞在wait方法中，等待其他线程唤醒
 *  TIMED_WAITING：线程阻塞在sleep方法中，等待时间到
 *  BLOCKED：线程阻塞在获取锁操作上，等待其他线程释放锁
 */

/**
 *
 */
public class ThreadDemo18 {
    //在这个代码中，必须要保证，WaitTask和NotifyTask对应的实例中，持有的locker是一个
    static class WaitTask implements Runnable{
        private Object locker;

        public WaitTask(Object locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            //while(true){
                synchronized (locker){
                    System.out.println("wait开始");
                    try {
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("wait结束");
                }
            //}
        }
    }

    static  class NotifyTask implements Runnable{

        private Object locker;

        public NotifyTask(Object locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            synchronized (locker) {
                System.out.println("Notify开始");
                locker.notify();
                System.out.println("notify结束");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();
        Object locker2 = new Object();
        Thread t1 = new Thread(new WaitTask(locker));
        Thread t2 = new Thread(new NotifyTask(locker));
        //start只是在内核中创建了PCB，这个对应的线程如何执行，看调度器
        //看起来试试t1的PCB先创建，t2的PCB后创建
        //实际上，t1先执行run还是t2先执行run，这个事情是不确定的
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
