package day7;

import java.util.Scanner;

/**
 * @program:test_6.8
 * @author:Nine_odes
 * @description:不要二
 * @create:2020-06-08 09:09
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int W = sc.nextInt();
            int H = sc.nextInt();
            if(W % 4 == 0 || H % 4 == 0){
                System.out.println(W *H /2);
            }else{
                System.out.println((W * H ) / 2 + 1);
            }
        }
    }
}
