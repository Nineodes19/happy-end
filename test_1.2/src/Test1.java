/**
 * @program:test_1.2
 * @author: Nine_odes
 * @description:
 * @create:2020-01-02 22:20
 */
class MyThred extends Thread{
    private String name;
    public MyThred(String name){
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行，i =" + i);
        }
    }
}
public class Test1 {
    public static void main(String[] args){
        MyThred mt1 = new MyThred("线程A");
        MyThred mt2 = new MyThred("线程B");
        mt1.run();
        mt2.run();
    }
}
