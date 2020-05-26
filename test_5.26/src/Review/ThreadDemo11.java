package Review;

/**
 * @program:test_5.26
 * @author:Nine_odes
 * @description:
 * @create:2020-05-26 10:27
 **/
public class ThreadDemo11 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    //循环内部为空
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //在start之前先获取一次状态、
        System.out.println(t.getState());
        t.start();

        //isAlive描述的是PCB对象是否存活
        //只要Thread的状态不是new和terminatedm,就是Alive
        while(t.isAlive()){
            System.out.println("Alive时候的状态：" + t.getState());
        }

        System.out.println(t.getState());
    }
}
