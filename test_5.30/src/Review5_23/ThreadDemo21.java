package Review5_23;

/**
 * @program:test_5.30
 * @author:Nine_odes
 * @description:
 * @create:2020-05-30 09:51
 **/
public class ThreadDemo21 {
    static class Singleton{
        private volatile static Singleton instance = null;
        private Singleton(){}
        public static Singleton getInstance(){
            //因为是static方法，直接对类对象加锁
            //类对象是唯一只有一份的，保证无论多少线程去调度getInstance操作，都能先触发加锁
            if (instance == null) {
                synchronized (Singleton.class){
                    if(instance == null){
                        instance = new Singleton();
                    }
                }
            }
            //懒汉模式的线程不安全只是存在于对象被实例化之前
            //此时调用getInstance可能触发new操作，才设计道修改，涉及到线程安全
            //如果实例已经被创建好了，后续再调用getInstance不涉及修改，就没有线程安全问题了
            //读操作可能会被编译器优化，读到的结果可能不是其他线程修改后的instance


            return instance;
        }
    }
}
