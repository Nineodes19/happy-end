
class MyRun implements Runnable{
    private String name;
    public MyRun(String name){
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行，i=" + i);
        }
    }
}
public class Test3 {
    public static void main(String[] args) {
        MyRun my1 = new MyRun("线程A");
        MyRun my2 = new MyRun("线程B");
        Thread t1 = new Thread(my1);
        Thread t2 = new Thread(my2);
        t1.start();
        t2.start();
    }
}
