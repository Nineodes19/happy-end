/**
 * @program:test_9.8
 * @author:Nine_odes
 * @description:
 * @create:2020-09-08 23:46
 **/
public class TestDemo2 {
    /*
        要求输入一个整数n，输出斐波那契数列的第n项
    */
    public static int Fibonacci(int n){
        int F0 = 0;
        int F1 = 1;
        int F2 = 0;
        if(n == 0){
            return F0;
        }else if(n==1){
            return F1;
        }
        for(int i = 2; i < n; i++){
            F2 = F0+F1;
            F0 = F1;
            F1 = F2;
        }
        return F2;
    }

    //0 1 1 2 3 5
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibonacci(n));
    }
}
