package day10;

import java.util.*;

/**
 * @program:test_6.11
 * @author:Nine_odes
 * @description:Fibonacci数列
 * @create:2020-06-11 10:33
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int fibo = 0,f0 = 0,f1=1;
            int subleft = 0,subright;
            while(true){
                fibo = f0+f1;
                f0 = f1;
                f1 = fibo;
                if(fibo < n){
                    subleft = n - fibo;
                }else{
                    subright = fibo - n;
                    break;
                }
            }
            System.out.println(Math.min(subleft,subright));
        }

    }
}
