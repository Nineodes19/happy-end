/**
 * @program:test_9.17
 * @author:Nine_odes
 * @description:
 * @create:2020-09-17 19:56
 **/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n >= 100*m){
            System.out.println(1);
        }

        for (int i = 1; i < 100; i++) {
            if(n*i >= (m*100 + cheng(n,i))){
                System.out.println(i);
                break;
            }
        }

        //System.out.println(cheng(60,2));
    }
    private static double cheng(int x,int n){

        if(n == 1){
            return x/2.0;
        }
        return cheng(x,n-1)+cheng(x,n-1)/2.0;
    }
}
