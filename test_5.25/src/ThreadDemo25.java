import com.sun.deploy.util.BlackList;

import java.util.concurrent.BlockingQueue;

/**
 * @program:test_5.25
 * @author:Nine_odes
 * @description:
 * @create:2020-05-25 18:37
 **/
public class ThreadDemo25 {
    //饿汉模式的实现，是线程安全的
    //多线程调用getInstance的时候不涉及同时修改同一个变量
    //懒汉线程是不安全的
    static class Singleton{
        private static Singleton instance = null;
        private Singleton(){}

        public static Singleton geetInstance(){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }


}
