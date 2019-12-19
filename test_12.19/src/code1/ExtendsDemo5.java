package code1;

/**
 * @program:test_12.19
 * @author: Nine_odes
 * @description:
 * @create:2019-12-19 22:15
 */

class Father{
    public int num = 10;
}
class Son extends Father{
    public int num = 20;
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
public class ExtendsDemo5 {
    public static void main(String[] args){
        /**
         * new 一个Son对象时，先执行其父类Father的
         */
        Son s = new Son();
        s.show();
    }
}
