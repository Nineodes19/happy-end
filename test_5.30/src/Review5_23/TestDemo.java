package Review5_23;

/**
 * @program:test_5.30
 * @author:Nine_odes
 * @description:
 * @create:2020-05-30 09:21
 **/

/**
 * 线程控制：
 * 1.线程创建
 * 2.线程中断
 * 3.线程等待（wait）
 * 4.获取当前线程实例
 * 5.线程休眠（sleep）---TINED_WAITING
 */

/**
 * 线程状态：
 * NEW
 * RUNNABLE
 * TERMIATED线程终止
 * TIMED_WAITING正在执行sleep
 * WAITING 调用wait，等待时间无限制
 * BLOCKED等待锁
 */
//线程安全
    //a线程不安全的原因
    //抢占式执行，多线程同时修改同一个变量，修改操作不是原子的，内存可见性，指令重排序
    //b解决方案
    //加锁---》原子性
    //同一时刻只有一个线程能获取到锁，其他线程如果想获取锁必须等待，直到该线程释放锁

    //volatile内存可见性
    //编译器过度优化，导致反复快速的读取操作被优化成只读一次，另外一个线程修改数据 ，读线程无法感知到
    //volatile能够保证内存的可见性，禁止编辑器进行这样阿德优化，从而每次都重新从内存读数据

    //wait/notify
    //防止抢占式执行导致线程饿死，一定程度上的干预线程之间执行的先后顺序

    //懒汉模式
public class TestDemo {
    //饿汗模式实例的创建是在Singleton类被加载的时候来进行的，类被加载的时机只有一次（JVM内部控制的）
    //此时就和多线程无关
    //如果多线程调用getInstance，此时不涉及到多线程同时修改同一个变量，此时也会有线程安全问题
//    static class Singlenton{
//        private static Singlenton instance = new Singlenton();
//        private Singlenton(){}
//        public static Singlenton getInstance(){return instance;}
//    }



    //当多个线程同时调用getInstance的时候，有可能会触发多个线程同时修改
    //存在线程安全问题

    //本质上还是多线程同时对同一个变量进行修改，并且修改操作不是原子的
    //1判断instance是否为null
    //2.为空则new一个对象
    //3.把new的结果写入instance
    static  class Singleton{
        private static Singleton instance = null;
        private Singleton(){}
        synchronized public Singleton getInstance(){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }
}
