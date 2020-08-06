package thread;

/**
 * @program:test_8.6
 * @author:Nine_odes
 * @description:
 * @create:2020-08-06 13:24
 **/
public class TestDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread t = new Thread(()->{
            synchronized(object){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                for (int i = 0; i < 1000_0000; i++) {

                }
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        System.out.println(t.getState());//NEW
        t.start();
        System.out.println(t.getState());//RUNNABLE
        Thread.sleep(10);
        synchronized(object){
            for (int i = 0; i < 10; i++) {
                System.out.println(t.getState());//WAITING
            }
            object.notify();
        }
        while(t.isAlive()){
            System.out.println(t.getState());
        }
    }
}
