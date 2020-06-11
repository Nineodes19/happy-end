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
        int ret = 0;
        for (int i = n; i >= 5 ; i--) {
            int temp = i;
            while(temp % 5 == 0){
                ret++;
                temp/=5;
            }
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
