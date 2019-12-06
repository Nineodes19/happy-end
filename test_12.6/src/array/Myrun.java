package array;

/**
 * @program:test_12.6
 * @author: Nine_odes
 * @description:
 * @create:2019-12-06 22:20
 */
class Myrun implements Runnable{
    private String name;
    public Myrun(String name){
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name +"运行，i= "+i);
        }
    }
}
