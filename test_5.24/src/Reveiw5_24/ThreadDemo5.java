package Reveiw5_24;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @program:test_5.24
 * @author:Nine_odes
 * @description:
 * @create:2020-05-24 21:47
 **/
public class ThreadDemo5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是一个新线程！我还活着");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("我要死了");
            }
        };

        //先在start之前调用get方法获取线程相关属性
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getState());//线程状态
        System.out.println(t.getPriority());//优先级
        System.out.println(t.isDaemon());
        System.out.println(t.isAlive());//表示当前run是否在执行
        System.out.println(t.isInterrupted());//表示当前线程是否被中断

        t.start();

        while(t.isAlive()){
            System.out.println("该线程还活着，状态是:" + t.getState());
            Thread.sleep(500);
        }
    }
}
