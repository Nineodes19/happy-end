import java.util.Scanner;

/**
 * @program:test_5.20
 * @author:Nine_odes
 * @description:
 * @create:2020-05-21 10:32
 **/
public class TestDemo15 {
    static class Counter {
        volatile public int count = 0;
        // volatile :让编译器每次都重新从内存中读取 count的值。
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (counter.count == 0) {

                }
                System.out.println("循环结束!");
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个整数:");
                counter.count = scanner.nextInt();
            }
        };
        thread2.start();
    }

}
