package code2;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 15:25
 */
interface IShape{
    void draw();
    public static final int num = 10;
}
class Cycle1 implements IShape{
    public void draw(){
        System.out.println("○");
    }
}
public class Test3 {
    public static void main(String[] args){
        IShape shape = new Cycle1();
        shape.draw();
    }
}
