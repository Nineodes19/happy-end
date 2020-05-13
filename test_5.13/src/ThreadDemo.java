/**
 * @program:test_5.13
 * @author:Nine_odes
 * @description:
 * @create:2020-05-13 18:47
 **/
public class ThreadDemo {
    static class MyThread extends Thread{
        @Override
        public void run(){
            //线程的入口方法，当线程启动之后，会执行到run方法中的逻辑

            //这个方法不需要手动调用，由JVM来自动执行的
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
    public static void main(String[] args) throws InterruptedException {
        //向上转型
        Thread t = new MyThread();
        //调用start方法，就会在操作系统中创建一个线程。
        //内核中就有了一个PCB对象，被加入到双向链表中
        //当线程创建完毕后，run方法就会被自动调用
        //当run方法执行完毕，线程就被自动销毁了。
        t.start();
        while(true){
            System.out.println("我是主线程");
            Thread.sleep(1000);
        }
    }
}
