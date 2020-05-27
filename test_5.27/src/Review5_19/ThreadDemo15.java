package Review5_19;

import java.util.Scanner;

/**
 * @program:test_5.27
 * @author:Nine_odes
 * @description:
 * @create:2020-05-27 16:25
 **/

/**
 * 注意体会此处volatile处理问题和前面线程不安全的差异
 * 之前的场景是，多个线程同时修改同一个变量，和编译器是否优化没关系
 * 现在的场景是，一个线程读，一个线程写，编译器针对读操作优化了才导致的问题
 *
 * volatile只能保证内存的可见性，不能保证操作的原子性
 */
public class ThreadDemo15 {
    static class Counter{
        volatile public int count = 0;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(){
            @Override
            public void run() {

                /**
                 * 这个场景下，编译器自作主张把t1的从内存读count的操作给优化了
                 * 此处的读操作太频繁了，此处编译器就把这个读内存的操作给优化了
                 * 除了第一次判定的时候读内存之外，其他的后续循环都是直接
                 * 从刚才CPU中已经缓存好了的数据来进行判断
                 * （此处编译器万万没想不到，在另外一个线程中可能会对count修改
                 *
                 * 此处的优化就过火了，这个优化影响了程序的原本逻辑
                 * 这其实就类似于日常生活中“惯性思维”
                 *
                 * 显式规定，让编译器不要优化了
                 * volatile存在的意义就是填坑
                 *
                 * 让编译器每次都重新从内存中读取count值
                 * 编译器是有责任来保证多线程情况下优化结果也是正确的
                 *
                 */
                while(counter.count == 0){

                }
                System.out.println("循环结束");
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个整数：");
                counter.count = scanner.nextInt();
            }
        };
        t2.start();
    }
}
