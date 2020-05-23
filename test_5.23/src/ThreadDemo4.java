

import javax.management.relation.RoleUnresolved;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @program:test_5.23
 * @author:Nine_odes
 * @description:
 * @create:2020-05-23 17:40
 **/
public class ThreadDemo4 {
    //创建类来描述线程池中的线程长啥样
    static class Worker extends Thread{

        private BlockingQueue<Runnable> queue = null;
        public Worker(BlockingQueue<Runnable> queue){
            this.queue = queue;
        }
        @Override
        public void run() {
            try {
                while(!Thread.currentThread().isInterrupted()){
                    //queue是阻塞队列，当任务队列为空时，worker线程们就会在take方法
                    //阻塞，直到有新的任务加入到queue中，worker才会被唤醒
                    //System.out.println("执行run之前");
                    Runnable runnable = queue.take();
                    //System.out.println("执行run之后");
                    runnable.run();
                }
            }catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }
    }

    //创建类来描述线程池对象
    static class MyThreadPool{
        //线程池内置的任务队列，每个工作线程都要从这个队列中获取到任务并执行
        private BlockingQueue<Runnable> queue = new LinkedBlockingDeque<>();

        //包含了当前线程池中都有哪些工作线程
        private List<Worker> workers = new ArrayList<>();

        //限制线程池中，最多只能有10个线程
        private int maxWorkerCount = 10;

        public void execute(Runnable command){
            if(workers.size() < maxWorkerCount){
                //此时worker线程数目不足，创建新的worker添加到线程池中
                Worker worker = new Worker(queue);
                worker.start();
                workers.add(worker);
                System.out.println("创建新的线程");
            }
            try {
                queue.put(command);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void shutdown(){
            //这个方法要关闭线程池，把线程池中的所有worker线程都干掉
            for(Worker worker : workers){
                worker.interrupt();//强制关闭
            }
            //interrupt只是出发异常并设置标记位，线程也不是马上就被销毁了
            for(Worker worker: workers){
                try {
                    worker.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //当shutdown执行完毕，就能保证所有的线程都被回收了
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadPool myThreadPool = new MyThreadPool();
        for(int i = 0; i < 100; i++){
            myThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("这是我要执行的任务");
                }
            });
        }

        Thread.sleep(300);
        myThreadPool.shutdown();
    }
}

