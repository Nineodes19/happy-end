/**
 * @program:test_.23
 * @author:Nine_odes
 * @description:
 * @create:2020-09-23 20:18
 **/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(eatCount(n));
    }

    private static int eatCount1(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return eatCount1(n-1) + eatCount1(n-2);
    }

    private static int eatCount(int n){
        int T1 = 1;
        int T2 = 2;
        if(n == 1){
            return T1;
        }else if(n == 2){
            return T2;
        }
        int T3 = 0;
        for (int i = 3; i <= n; i++) {
            T3 = T1+T2;
            T1 = T2;
            T2 = T3;
        }
        return T3;
    }
}
