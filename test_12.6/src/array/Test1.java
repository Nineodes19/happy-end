package array;

/**
 * @program:test_12.6
 * @author: Nine_odes
 * @description:
 * @create:2019-12-06 22:17
 */
public class Test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("线程A");
        MyThread myThread1 = new MyThread("线程B");
        myThread.run();
        myThread1.run();
    }
}
