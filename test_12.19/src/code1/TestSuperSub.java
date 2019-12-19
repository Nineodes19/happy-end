package code1;

/**
 * @program:test_12.19
 * @author: Nine_odes
 * @description:
 * @create:2019-12-19 22:02
 */
class SuperClass{
    private int n;
    public SuperClass(){
        System.out.println("SuperClass()");
    }
    public SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

class SubClass extends SuperClass{
    private int n;
    public SubClass(){
        super(300);
        System.out.println("SubClass");
    }

    public SubClass(int n){
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}
public class TestSuperSub {
    public static void main(String[] args){
        SubClass subClass = new SubClass();
        SubClass subClass1 = new SubClass(200);
    }

}
