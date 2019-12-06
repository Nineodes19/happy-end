package array;

/**
 * @program:test_12.6
 * @author: Nine_odes
 * @description:进程与线程
 * @create:2019-12-06 22:13
 */
class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行，i = " +i);
        }
    }
}
