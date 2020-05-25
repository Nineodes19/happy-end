package review5_16;

/**
 * @program:test_5.25
 * @author:Nine_odes
 * @description:
 * @create:2020-05-25 13:31
 **/
public class ThreadDemo9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
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
                System.out.println("我工作结束了！");
            }
        };
        t.start();
        t.join();//执行到join时，当前线程被阻塞
        System.out.println(
                "我是主线程"
        );
    }
}
