package day28;

import java.util.Scanner;

/**
 * @program:test_7.18
 * @author:Nine_odes
 * @description: 守形数
 * @create:2020-07-18 13:28
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            if(Math.sqrt((double)N) == N%10 || N == 5 || N == 6){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }

    }
}
