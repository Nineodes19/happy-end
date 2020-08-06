package thread;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

/**
 * @program:test_8.6
 * @author:Nine_odes
 * @description:
 * @create:2020-08-06 13:54
 **/
public class SynchronizedDemo {
    public synchronized static void method(){
        //System.out.println(Thread.currentThread().getState());
        synchronized (SynchronizedDemo.class){

        }
    }

    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        demo.method();


        //method();
    }
}
