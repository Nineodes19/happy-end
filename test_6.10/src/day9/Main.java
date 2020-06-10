package day9;

import java.util.Scanner;

/**
 * @program:test_6.10
 * @author:Nine_odes
 * @description:末尾0的个数
 * @create:2020-06-10 10:06
 **/
public class Main {
    static int count(int n){
        long sum = 1;//求n的阶乘
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        int ret = 0;//末尾0的个数

        while(sum % 10 == 0){
            ret ++;
            sum/=10;
        }
        return ret;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }
}
