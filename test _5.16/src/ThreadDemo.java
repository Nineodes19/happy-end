import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @program:test _5.16
 * @author:Nine_odes
 * @description: 线程等待
 * 通过线程等待，可以控制线程之间结束的先后顺序
 * @create:2020-05-16 15:03
 **/
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
       Thread t = new Thread() {
           @Override
           public void run() {
               for (int i = 0; i < 10; i++) {
                   System.out.println("我是一个线程");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println("我工作结束了");
           }
       };
       t.start();
       //执行到join的时候，当前线程（主线程)被阻塞（等）
        //一直等到t这个线程执行结束，join才会继续执行
       t.join();
       System.out.println("我是主线程");
    }
}
