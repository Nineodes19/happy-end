package code5;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:20
 */
abstract class A{
    void shows(){
        System.out.println("没有抽象方法的抽象类A");
    }
}
abstract class Abs{
    abstract void show();
    abstract void show(int i);
}
public class Real extends Abs{
    int x;
    void show(){
        System.out.println("x = " + x);
    }
    void show(int i){
        x = i;
        System.out.println("x = " + x);
    }
}
