package Review5_19;

/**
 * @program:test_5.27
 * @author:Nine_odes
 * @description:
 * @create:2020-05-27 17:23
 **/

/**
 * 等待集的核心操作主要有两个：
 * 1.等待（wait方法）
 * 2.通知（notify方法）
 *
 * Object对象的方法，任意对象都可以使用wait和notify
 * 调用wait的前提是发现当前操作的条件不满足，要想知道条件满不满足，
 * 就需要先能够访问资源（先获取到锁）
 * wait必须在同步代码块中才能使用，否则就会出现上面的异常（IllegalMonitorStateException）
 *
 * wait方法实际上做了三件事：
 *      1.先释放锁（如果你当前都没获取到锁，也就谈不上释放）
 *      2.等待通知（等待其他线程调用notify方法，把它唤醒）
 *      3.收到通知后，会重新尝试获取锁
 */

/**
 * 如果线程t是RUNNABLE状态
 * 此时t对应的PCB就在就绪队列中
 * 调度器决定谁要上CPU，从就绪队列中选
 * 一旦t调用wait。线程进入WAITING，
 * 此时t对应的PCB就被放到等待队列中了
 * 等待队列中的PCB是无法被调度到CPU上执行的
 */
public class ThreadDemo17 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized(object){
            System.out.println("等待前");
            object.wait();

            System.out.println("等待后");
        }

    }
}
