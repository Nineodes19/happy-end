package demo;

import java.util.Random;

/**
 * @program:test_5.30
 * @author:Nine_odes
 * @description:
 * @create:2020-05-30 13:54
 **/
public class testDemo1 {
    private static class MyThread extends Thread{
        @Override
        public void run() {
            Random random = new Random();
            while(true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();

        Random random = new Random();
        while(true){
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(random.nextInt(10));
        }
    }
}
