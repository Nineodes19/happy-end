package Reveiw5_24;

/**
 * @program:test_5.24
 * @author:Nine_odes
 * @description:
 * @create:2020-05-24 21:25
 **/

/**
 * 创建线程的几种方式：
 *1.创建一个类，显示的继承自Thread，重写run方法
 * 2.创建一个匿名内部类，继承自Thread，也重写run方法
 * 3.创建一个类，实现Runnable接口，再借助这个新类的对象来构造Thread对
 *      这种创建线程的方式，相当于把线程内部要执行的逻辑和Thread对象本身分开了
 *      这种写法代码耦合性更小
 * 4.创建一个匿名内部类，实现Runnable接口，重写run方法
 * 5.使用lambda表示
 *      lambda本质上是一个匿名方法；
 *      表达式的语法和java的其他语法想必，画风相去甚远
 */
public class ThreadDemo3 {

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("我是一个新线程");
        }
    }
    public static void main(String[] args) {
//        //显式创建类实现Runnable接口
//        Thread t = new Thread(new MyRunnable());
//        t.start();
//
//        //这是使用匿名内部类视线Runnable接口
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(
//                        "我是一个新线程"
//                );
//            }
//        });
//        t1.start();//不加start，线程未被创建

        Thread t = new Thread(() ->{
            System.out.println("我是一个新线程");
        });
        t.start();
    }
}
