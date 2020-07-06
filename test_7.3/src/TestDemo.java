/**
 * @program:test_7.3
 * @author:Nine_odes
 * @description:
 * @create:2020-07-04 10:57
 **/
public class TestDemo {

    public static int foo(int a,int b){
        if(b == 0){
            return 0;
        }
        if(b % 2 == 0){
            return foo(a+a,b/2);
        }
        return foo(a+a,b/2) + a;
    }
    public static void main(String[] args) {
        System.out.println(foo(1,3));
    }
}
