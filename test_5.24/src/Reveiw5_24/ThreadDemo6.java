package Reveiw5_24;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @program:test_5.24
 * @author:Nine_odes
 * @description:
 * @create:2020-05-24 22:07
 **/
public class ThreadDemo6 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {

                while(true){
                    try {
                        System.out.println("hehe");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //如果不调用Thread的start方法，此时并没有创建出新的线程
        //虽然手动调用run 也能执行线程内部的逻辑， 但是本质上不是借助线程进行并发执行
        //直接用run是串行执行的
//        t1.run();

        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("haha");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
//        t2.run();
        t2.start();
    }
}
