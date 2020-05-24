package Reveiw5_24;

/**
 * @program:test_5.24
 * @author:Nine_odes
 * @description:
 * @create:2020-05-24 22:23
 **/
public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                //hread.currentThread()获取到当前线程的实例
                while(!Thread.currentThread().isInterrupted()){
                    System.out.println("我正忙着转账呢！！！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                        break;//t.interrupt()会让t这个线程内部触发一个异常
                    }
                }
                System.out.println("转账被终止！");
            }
        };
        t.start();

        Thread.sleep(5000);
        System.out.println("对方是内鬼！赶紧停止交易！！");
        //这个方法并不是直接把线程中断掉，而是让线程内部抛出一个
        //InterruException异常
        t.interrupt();
    }
}
