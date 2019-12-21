package code2;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:48
 */
public class ThisTest {
    public static void main(String[] args) {
        Local aa = new Local();
    }
}
class Local{
    public int i = 1;
    Local(int i){
        System.out.println("this.i=" + this.i);
        System.out.println("i = " + i);
    }
    Local(){
        this(6);
    }
}
