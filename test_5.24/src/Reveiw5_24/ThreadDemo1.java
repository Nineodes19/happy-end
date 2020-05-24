package Reveiw5_24;

/**
 * @program:test_5.24
 * @author:Nine_odes
 * @description:
 * @create:2020-05-24 18:19
 **/
public class ThreadDemo1 {

    //并发式执行能让程序执行效率更高
    static class MyThread extends Thread{
        @Override
        public void run() {
            //线程的入口方法，当线程启动之后，就会执行到run方法中的逻辑
            //这个方法不需要手动调用，由JVM自动执行
            System.out.println("hello world");
            //加while循环是为了避免run方法执行完毕
            while(true){
                System.out.println("我是新线程");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //main方法也是一个线程
    public static void main(String[]  args) {
        //向上转型。
        Thread t = new MyThread();
        //调用start方法，就会在操作系统中创建一个线程
        //内核中就有了一个PCB对象被加入到双向链表中
        //当线程创建完毕之后 ，run方法就会被自动调用到
        //当run方法执行完毕，线程就被自动销毁了
        t.start();
        while(true){
            System.out.println("我是主线程");
            //Thread中的静态方法，可以让线程“休眠”一会儿
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
