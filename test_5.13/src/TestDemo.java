/**
 * @program:test_5.13
 * @author:Nine_odes
 * @description:
 * @create:2020-05-13 16:17
 **/
public class TestDemo {

    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("hello world");
        }
    }
    public static void main(String[] args) {
        Thread t = new MyThread();
        /**
         * t.run()；这是错误的，这样写并没有在系统中创建新线程
         * 需要start方法来创建新线程
         * 所谓的创建新线程，本质上是在操作系统内核中。创建，一个RCB对象
         * 把这个对象加入到双向链表中，接下来，就可以由操作系统进行调度了
         */
        t.start();
    }
}
