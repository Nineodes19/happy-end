/**
 * @program:test_8
 * @author:Nine_odes
 * @description:
 * @create:2020-08-04 13:16
 **/
public class ThreadDemo {

    class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("这里是线程运行的代码");
        }
    }
    class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "这里是线程运行的代码");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("使用匿名类创建Thread子类对象");
            }
        };
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名类创建Runnable子类对象");
            }
        });

        Thread t3 = new Thread(()-> System.out.println("使用匿名类创建Thread子类对象"));

        Thread t4 = new Thread(()->{
            System.out.println("使用匿名类创建Thread子类对象");
        });

    }
}
