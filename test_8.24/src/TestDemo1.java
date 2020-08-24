import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program:test_8.24
 * @author:Nine_odes
 * @description:
 * @create:2020-08-24 10:29
 **/
public class TestDemo1 {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(atomicInteger.getAndIncrement());
                }
            }).start();
        }
        System.out.println(atomicInteger.get());
    }
}
