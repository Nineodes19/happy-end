/**
 * @program:test_5.20
 * @author:Nine_odes
 * @description:
 * @create:2020-05-20 19:03
 **/
public class ThreadDemo {
    //在这个代码中。必须要保证，WaitTask和NotiTask对应的实例中是同一个对象
    static class WaitTask implements Runnable{
        private Object locker;

        public WaitTask(Object locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            while(true){
                synchronized(locker){
                    System.out.println("wait开始");
                    try {
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("wait结束");
                }
            }
        }
    }

    static class NotifyTask implements Runnable{
        private Object locker;

        public NotifyTask(Object locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            System.out.println("notify开始");
            locker.notify();
            System.out.println("notify结束");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();
        Thread t1 = new Thread(new WaitTask(locker));
        Thread t2 = new Thread(new NotifyTask(locker));
        t1.start();
        //为了大概率让t1限制性，t2后执行，手动加一个sleep
        //Thread.sleep(5000);
        t2.start();
        //start只是在内核中创建了PCB，这个对应的线程如何执行？
        //看起来是t1的PCB先创建，t2的PCB后创建，实际上，
        // t1 先执行还是t2限制性run，这个事情是不确定的
    }
}
