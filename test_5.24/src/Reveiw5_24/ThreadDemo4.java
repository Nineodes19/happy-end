package Reveiw5_24;

import sun.awt.windows.ThemeReader;

/**
 * @program:test_5.24
 * @author:Nine_odes
 * @description:
 * @create:2020-05-24 21:40
 **/
public class ThreadDemo4 {
    public static void main(String[] args) {

        //给线程起名字，对于线程run方法逻辑的执行是没
        // 有任何影响的
        //唯一的用处就是方便调试（可以在调试工具中很方便的找到你目标的线程）
        Thread t = new Thread("我是一个新线程"){
            @Override
            public void run() {
                while(true){
                    System.out.println("hehe");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }
}
