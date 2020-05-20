/**
 * @program:test_5.20
 * @author:Nine_odes
 * @description:
 * @create:2020-05-20 21:15
 **/
public class ThreadDemo1 {

    //Singleton单例
    static class Singleton{
        private static Singleton instance = new Singleton();
        //当把这个类的构造方法设为私有的时候，此时这个类就无法在类外部被实例化
        private Singleton(){ }

        public static Singleton getInstance() {
            return instance;
        }
    }
    public static void main(String[] args) {
        //具体用法
        //要想获取到Singleton实例，必须通过getInstance获取
        //不能new（因为构造方法是private，new的时候会直接编译出错）
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
        System.out.println(singleton == singleton1);
        System.out.println(singleton2);
    }
}
