/**
 * @program:test_8.5
 * @author:Nine_odes
 * @description:
 * @create:2020-08-05 10:38
 **/
public class Thread4 {
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
        System.out.println(t.getName()+": " + t.getState());
    }
}
