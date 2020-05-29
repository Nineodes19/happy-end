package Review5_20;

/**
 * @program:test_5.29
 * @author:Nine_odes
 * @description:
 * @create:2020-05-29 22:32
 **/

import com.sun.jnlp.PersistenceServiceNSBImpl;

/**
 * 单例模式要求：某个类的实例，。在一个程序中只能存在一个，不能存在多个
 * 当代码中不小心针对这个不该实例化多次的类进行多次实例化时，编译器就会做出
 * 一些对应的检查/限制
 */
public class ThreadDemo19 {

    static class Singleton{
        private static Singleton instance = new Singleton();
        //把构造方法设为私有，此时这个类无法在类外被实例化
        private Singleton(){

        }

        public static Singleton getInstance(){
            return instance;
        }
    }
    public static void main(String[] args) {
        //具体用法
        //要想获取到Singleton实力，必须通过getInstance获取，不能new
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        //getInstance得到的类内部的静态成员
        //静态成员是和类相关的（在类对象中），每个类只有一个类对象
        //此时每次调用getInstance得到的实力其实是同一个
        System.out.println(singleton == singleton2);
        System.out.println(singleton == singleton1);
    }
}
