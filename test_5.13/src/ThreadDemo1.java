import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.sql.Time;

/**
 * @program:test_5.13
 * @author:Nine_odes
 * @description:
 * @create:2020-05-13 19:19
 **/
public class ThreadDemo1 {
    private static long count = 100_0000_0000L;

    public static void main(String[] args) {

        //完成一个简单的任务，让代码分别针对a和b两个整数，自增很多很多次
        //serial();
        concurency();
    }

    private static void concurency(){
        long beg = System.currentTimeMillis();//单位是：ms

        //创建了一个匿名内部类
        //这个类继承自Thread
        //{}就可以写这个子类里面的具体逻辑了。
        //此处new出来的实例类型其实就是这个新创建的匿名内部类的类型
        Thread t1 = new Thread(){
            @Override
            public void run(){
                int a = 0;
                for(long i = 0; i < count; i++){
                    a++;
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run(){
                int b = 0;
                for(long i = 0; i < count; i++){
                    b++;
                }
            }
        };
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - beg) + " ms");
    }
    private static void serial(){
        //如何衡量一段代码的执行时间？
        /**
         * 代码开始执行的时候记录一个时间戳，
         *
         */
        int a = 0;
        for(long i = 0; i < count; i++){
            a++;
        }
        int b = 0;
        for(long i = 0; i < count; i++){
            b++;
        }


    }
}
