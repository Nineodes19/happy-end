package Review5_20;

/**
 * @program:test_5.29
 * @author:Nine_odes
 * @description:
 * @create:2020-05-29 22:56
 **/
public class ThreadDemo20 {
    static class Singleton{
        //当程序把类加载的时候。并没有立刻就申请内存空间
        //如果这个对象没有被使用，就不会涉及到内存分配。节省时间
        //饿汗模式中不管是否用到这个实力，都会分配内存（分配内存操作可能会分配很大的内存，非常耗时

        private static Singleton instance = null;

        private Singleton(){}

        public  static Singleton getInstance(){
            if(instance == null){
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


