package array;

/**
 * @program:test_12.6
 * @author: Nine_odes
 * @description:
 * @create:2019-12-06 22:22
 */
public class RunableTest {
    public static void main(String[] args) {
        Myrun myrun = new Myrun("线程A");
        Myrun myrun1 = new Myrun("线程B");
        Thread thread = new Thread(myrun);
        Thread thread1 = new Thread(myrun1);
        thread.start();
        thread1.start();
    }
}
