import java.util.Scanner;

/**
 * @program:test _5.16
 * @author:Nine_odes
 * @description:
 * @create:2020-05-16 17:47
 **/
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();

        Thread t1 = new Thread(){
            public void run(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个整数：");
                synchronized (locker){
                    int num = scanner.nextInt();
                    System.out.println("t1: " + num);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    synchronized (locker){
                        System.out.println("t2");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        Thread.sleep(1000);
        t2.start();
    }
}
