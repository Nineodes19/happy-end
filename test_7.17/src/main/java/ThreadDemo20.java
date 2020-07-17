/**
 * @program:test_717
 * @author:Nine_odes
 * @description: 懒汉模式
 * 本质上是延时加载
 * 懒汉模式不是线程安全的
 * @create:2020-07-17 11:36
 **/
public class ThreadDemo20 {
    static class Singleton{
        private static Singleton instance = null;
        private Singleton(){}
        public static Singleton getInstance(){
            if(instance == null){
                //核心操作是new Singleton();
                //当多个线程同时调用getInstance()的时候，有可能触发多个线程
                //同时修改同一个变量，此时也会有多线程问题
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
