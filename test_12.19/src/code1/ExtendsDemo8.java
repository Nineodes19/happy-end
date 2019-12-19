package code1;

/**
 * @program:test_12.19
 * @author: Nine_odes
 * @description:
 * @create:2019-12-19 22:23
 */
class Father1{
    public void show(){
        System.out.println("show Father1");
    }
}

class Son1 extends Father1{
    public void method(){
        System.out.println("method Son1");
    }
    public void show(){
        System.out.println("show Son1");
    }
}
public class ExtendsDemo8 {
    public static void main(String[] args){
//        Son1 s = new Son1();
//
//        s.show();
//        s.method();

        Father1 fat = new Son1();
        Son1 son1 = (Son1) fat;
        fat.show();
    }
}
