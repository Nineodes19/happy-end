package Review;

/**
 * @program:test_5.26
 * @author:Nine_odes
 * @description:
 * @create:2020-05-26 10:12
 **/
public class ThreadDemo10 {
    public static void main(String[] args) {
        //Thread.State是一个枚举类型

        //CPU在并发执行多个线程的时候，其实会维护一个任务队列。
        //这个任务队列中的线程，都是可以随时在CPU上执行的线程
        for(Thread.State state : Thread.State.values()){
            System.out.println(state);
            /**
             * NEW 这是一个新创建的线程，还没有开始运行start方法呢（PCB对象还没创建呢，但是Thread对象已经创建好了）
             * RUNNABLE  可工作状态（正在工作或者还没工作但是已经准备好了）
             * 当前线程没有就绪，而是在等待其他的事情：
             *      这两个状态和“锁”和“等待信号集”有关
             *          BLOCKED 表示当前线程在等待锁
             *          WAITING
             *      TIMED_WAITING 对应道sleep，如果查询状态的时候。线程正好在sleep，得到的状态就是这个
             * TERMINATED 线程的工作完成了（当前的PCB对象已经被销毁了，但是代码中的Thread对象还在）
             */
        }
    }
}
