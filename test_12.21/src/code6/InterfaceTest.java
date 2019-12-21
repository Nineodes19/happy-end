package code6;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:32
 */
interface IA{
    int a = 1;
    void showa();
}
interface IB extends IA{
    int b = 2;
    void showb();
}
interface IC extends IA,IB{
    int c = 3;
    void showc();
}
public class InterfaceTest implements IC{
    public void showa(){
        System.out.println("aaaa");
    }
    public void showb(){
        System.out.println("bbbb");
    }
    public void showc(){
        System.out.println("cccc");
    }
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
