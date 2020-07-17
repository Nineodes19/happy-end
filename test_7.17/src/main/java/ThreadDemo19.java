/**
 * @program:test_717
 * @author:Nine_odes
 * @description: 饿汉模式是线程安全的，不设计线程不安全问题
 * @create:2020-07-17 11:38
 **/
public class ThreadDemo19 {
    static class Singleton1{
        //核心操作是new Singleton()操作，这个操作可能很耗时
        /*
        饿汉模式实例的创建是在Singleton类被加载的时候进行的，类被加载的时机只有一次
        （这是JVM内部控制的）所以这个操作就和多线程无关
         */
        private static Singleton1 instance1 = new Singleton1();

        private Singleton1(){}

        //如果多线程调用getInstance1()方法，此时不涉及到多线程同时修改同一个变量，
        // 因此也也不会有线程不安全的现象
        public static Singleton1 getInstance1(){
            return instance1;
        }
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance1();
        Singleton1 singleton11 = Singleton1.getInstance1();
        Singleton1 singleton12 = Singleton1.getInstance1();
        System.out.println(singleton1 == singleton12);
        System.out.println(singleton11 == singleton12);
    }
}
