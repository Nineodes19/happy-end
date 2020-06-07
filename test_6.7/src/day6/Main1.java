package day6;

/**
 * @program:test_6.7
 * @author:Nine_odes
 * @description:计算糖果
 * @create:2020-06-07 09:38
 **/

import java.util.Scanner;

/**
 *  A-B    B-C  A+B   B+C
 *  1      -2    3    4
 *
 */
public class Main1 {
    public static void main(String[] args) {
        /**
         *   A-B    B-C  A+B   B+C
         */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        float a,b,c;
        a = (arr[0] +arr[2])/2f;
        b = (arr[1] +arr[3])/2f ;
        c = (arr[3] - arr[1])/2f;
        if((a - ((arr[0] +arr[2])/2))!= 0){
            System.out.println("No");
            return;
        }
        if((b-((arr[2] -arr[0])/2)!= 0) || (b !=((arr[1] +arr[3])/2) ) ){
            System.out.println("No");
            return;
        }
        if((c - (arr[3] - arr[1])/2) != 0){
            System.out.println("No");
            return;
        }
        System.out.print((int)a + " " + (int)b + " " + (int)c);

    }
}
