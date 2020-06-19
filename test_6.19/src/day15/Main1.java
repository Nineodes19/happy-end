package day15;

import java.util.Scanner;

/**
 * @program:test_6.19
 * @author:Nine_odes
 * @description:饥饿的小易
 * @create:2020-06-19 18:22
 **/
public class Main1 {
    static int mod = 1000000007;
    static int LIMIT = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int ret = 0;
        for (int i = 0; i < LIMIT; i++) {
            x = x % mod;
            if(x == 0){
                System.out.println(ret);
                return;
            }else{
                if(g(g(x)) > mod){
                    long temp = x;
                    for (int j = 0; j <= 2 ; j++) {
                        temp = f(temp);
                        if(temp % mod == 0){
                            System.out.println(ret + j);
                            return;
                        }
                    }

                }
                x = g(x);
                ret++;
            }
        }
        System.out.println("-1");
    }
    private static Long f(long x){
        return 4 * x +3;
    }
    private static Long g(long x){
        return 8 * x + 7;
    }
}
