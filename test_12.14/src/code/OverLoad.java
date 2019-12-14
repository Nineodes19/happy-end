package code;

/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:
 * @create:2019-12-14 23:03
 */
public class OverLoad {
    int sum(int a ,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    double sum(int a ,double b ){
        return a +b;
    }

    public static void main(String[] args) {
        OverLoad o = new OverLoad();
        System.out.println(o.sum(1,3));
        System.out.println(o.sum(1,3,5));
        System.out.println(o.sum(1,2.2));
    }
}
