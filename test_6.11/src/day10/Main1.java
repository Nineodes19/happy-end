package day10;

import java.util.Scanner;

/**
 * @program:test_6.11
 * @author:Nine_odes
 * @description:机器人走方格（1）
 * @create:2020-06-11 10:34
 **/
public class Main1 {
    private static int countWays(int x,int y){
        if((x == 1 || y == 1))
            return 1;
        else
            return countWays(x-1,y) + countWays(x,y-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(countWays(x,y));
        }
    }
}
