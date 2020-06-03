package Review5_23;

/**
 * @program:test_6.3
 * @author:Nine_odes
 * @description:
 * @create:2020-06-03 23:16
 **/

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * 定时器Timer 最核心的 接口往Timer中注册一个任务，并且制定这个任务多长时间后执行
 * 一个Timer对象中可以注册N个任务，能够有条不紊的把这些任务按照时间一次唤醒
 * Timer内部主要需要包含一个带优先级的阻塞队列，让时间越靠前的任务优先级越高
 * 另外通过一个专门的线程来定时扫描队列的队首元素
 * 如果队首元素已经时间到，就执行队首元素对应的任务即可
 */
public class ThreadDemo23 {
    //创建一个类来描述定时器中存放的任务
    static class Task implements Comparable<Task>{
        //表示该任务具体干啥
        private Runnable command;
        //啥时候执行
        private long time;

        public Task(Runnable command, long time) {
            this.command = command;
            this.time = time + System.currentTimeMillis();
        }
        public void run(){
            command.run();
        }

        @Override
        public int compareTo(Task o) {
            //时间越靠前，优先级越高
            return (int)(this.time - o.time);
        }
    }



    static class Timer{
        private PriorityBlockingQueue<Task> queue =
                new PriorityBlockingQueue<>();

    }
}
