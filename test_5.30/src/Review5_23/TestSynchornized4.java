package Review5_23;

/**
 * @program:test_5.30
 * @author:Nine_odes
 * @description:
 * @create:2020-05-30 13:04
 **/
public class TestSynchornized4 {
    public  void func(TestSynchornized4 test) {
        synchronized (test) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        TestSynchornized4 test = new TestSynchornized4();
        TestSynchornized4 test2 = new TestSynchornized4();
        Thread t1 = new Thread(){
            @Override
            public void run() {

                test.func(test2);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                test.func(test2);
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
