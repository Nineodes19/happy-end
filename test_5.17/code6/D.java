package code6;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 22:29
 */
abstract class Animals{
    String name;
    int leg;
    public Animals(String name,int leg){
        this.name = name;
        this.leg = leg;
    }
    public abstract void eat();
}
class Lion extends Animals{
    public Lion(String name,int leg){
        super(name,leg);
    }
    public void eat(){
        System.out.println("吃肉！");
    }
}
public class D {
    public static void main(String[] args){
        Lion li = new Lion("非洲狮",4);
        li.eat();
    }
}
