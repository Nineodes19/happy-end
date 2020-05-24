package Reveiw5_24;

/**
 * @program:test_5.24
 * @author:Nine_odes
 * @description:
 * @create:2020-05-24 19:53
 **/
public class ThreadDemo2 {
    private static long count = 100_0000_0000L;
    public static void main(String[] args) {
        //完成一个简单的任务，让代码分别针对a和b两个整数，自增很多次

        //serial();

        //线程：节省时间，减少开销
        concurency();
    }

    private static void concurency() {
        long beg = System.currentTimeMillis();

        //创建匿名内部类,这个类继承自Thread
        //在{}里写这个子类的具体逻辑
        //此处new出来的实例类型就是这个新创建的匿名内部类
        Thread t1 = new Thread(){
            @Override
            public void run() {
                int a = 0;
                for(long i = 0; i < count; i++){
                    a++;
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                int b = 0;
                for(long i = 0; i < count; i++){
                    b++;
                }
            }
        };
        t2.start();


        try {
            //线程等待的逻辑
            //concurency是在main中的方法，
            // 这个逻辑和t1，t2中的run方法
            //的逻辑是并发执行的关系
            //为了让时间计算能够涵盖到t1和t2执行完毕，
            // 就必须加上这样join来进行等待
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - beg) + "ms");
    }

    //串行执行
    private static void serial(){
        //如何衡量一段代码的执行时间？
        //代码开始执行的时候记录一个时间戳
        //代码结束执行的时候，再记录一个时间戳
        //两者相减就是这个代码的执行时间
        long beg = System.currentTimeMillis();//单位是ms
        int a = 0;
        for(long i = 0; i < count ; i++){
            a++;
        }
        int b = 0;
        for(long i = 0; i < count; i++){
            b++;
        }
        long end = System.currentTimeMillis();

        System.out.println("time:" + (end - beg) + "ms");
    }
}
