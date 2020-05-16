/**
 * @program:test _5.16
 * @author:Nine_odes
 * @description:
 * @create:2020-05-16 15:25
 **/
public class TestDemo {
    public static void main(String[] args) {
        //Thread.State是一个枚举类型
        //for(Thread.State)
        Thread t = new Thread(){
            public void run(){
                for (int i = 0; i < 1_0000_0000; i++) {

                }
            }
        };
        System.out.println(t.getState());
        t.start();
        while(t.isAlive()){
            System.out.println(t.getState());
        }

        System.out.println(t.getState());
    }
}
