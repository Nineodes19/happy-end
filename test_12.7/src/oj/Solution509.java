package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:斐波那契数
 * @create:2019-12-10 15:50
 */
public class Solution509 {
    public  static int fib(int N) {
        int T0 = 0;
        int T1 = 1;
        int ret = 0;
        if(N == 1){
            ret = T0;
        }
        if(N == 2){
            ret = T1;
        }
        for(int i = 3; i < N  ; i++){
            ret = T0 + T1;
            T0 = T1;
            T1 = ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
