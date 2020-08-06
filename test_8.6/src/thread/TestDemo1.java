package thread;

/**
 * @program:test_8.6
 * @author:Nine_odes
 * @description:
 * @create:2020-08-06 13:22
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i = 0; i < 1000_0000; i++) {

            }
        },"李四");
        System.out.println(t.getName() + ": " + t.getState());
        t.start();
        while(t.isAlive()){
            System.out.println(t.getName()+": " + t.getState());
        }
        System.out.println(t.getName() + ": " + t.getState());
    }
}
