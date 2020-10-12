/**
 * @program:test_10.12
 * @author:Nine_odes
 * @description:
 * @create:2020-10-12 22:48
 **/
public class ThreadDemo {
    private static class MyRunnable implements Runnable {
        public volatile boolean isQuit = false;

        public void run() {
            while (!isQuit) {
                System.out.println(Thread.currentThread().getName()
                        + ":别管我，我忙着转账呢！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()
                    + ":啊！险些误了大事");
        }
    }
}
