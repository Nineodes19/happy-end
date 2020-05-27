package Review5_19;

/**
 * @program:test_5.27
 * @author:Nine_odes
 * @description:
 * @create:2020-05-27 15:30
 **/

/**
 * 后置++和前置++ 本质上是一样的
 * 前置++：
 *      1.把数据从内存中写道CPU中（load）
 *      2.把CPU中的数据进行自增（incr）
 *      3.把CPU中的数据写回到内存中（save）
 */

/**
 * volatile保持内存的可见性，。java编译器对指令的优化
 * 优化不应该改变代码的逻辑（最终代码的结果，优化之前和优化之后不能有差异）
 *
 * 一般情况下，编译器能智能的判断何时能优化，优化哪里
 * 但是在多线程情况下，可能会翻车
 */
public class ThreadDemo5 {
    static class Counter{
        public int count = 0;
        public void increase(){
            ++count;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
