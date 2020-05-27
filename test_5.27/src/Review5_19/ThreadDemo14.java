package Review5_19;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * @program:test_5.27
 * @author:Nine_odes
 * @description:
 * @create:2020-05-27 15:14
 **/

/**
 * 在代码中，t1的start在前，t2的start在后
 * 但是程序启动时，到底是t1对应的线程先执行，还是t3
 * 对应的线程先执行，这个事情不能确定
 * start的先后顺序，只能代表“创建线程”的先后顺序
 * 操作系统先调度哪个线程上CPU，这个事情是不确定的
 *
 * 不是一创建线程，线程对应的内容就立刻执行，
 * 具体的执行时机还是得听内核的调度器说了算
 *
 * Linux调度器不是一种非常高效的调度器
 * 线程被创建，到执行的时间间隔，小可能微妙级别，大可能接近秒级
 * 因此有些对精度要求特别高的场景，Linux系统就不能胜任了。
 * （例如发射卫星）就需要是使用一些“实时操作系统）VXWorks
 *
 *
 */
public class ThreadDemo14 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                synchronized(ThreadDemo14.class){
                    System.out.println("请输入一个整数：");
                    int num = scanner.nextInt();
                    System.out.println("t1 : " + num);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized(ThreadDemo14.class){
                        System.out.println("t2");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        };
        t2.start();
    }
}
