package thread;

/**
 * @program:test_8.6
 * @author:Nine_odes
 * @description:
 * @create:2020-08-06 13:33
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().getName()
                                    +"：我跑着呢");
                Thread.yield();
            }
        },"李四");

        Thread thread2 = new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().getName()
                        +"：我跑着呢");
            }
        },"王五");
        thread1.start();
        thread2.start();

    }
}
