package review5_19;

/**
 * @program:test_5.26
 * @author:Nine_odes
 * @description:
 * @create:2020-05-26 17:18
 **/
public class ThreadDemo14 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("我是一个MyThread的新线程");

        }
    }

    public static void main(String[] args) {


        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("我是一个新线程");
            }
        };
        t.start();

        Thread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new Runnable");
            }
        });
        t2.start();

        Thread t3 = new Thread(() ->{
            System.out.println("lanmda");
        });
        t3.start();
    }
}
