package code1;

import java.util.Scanner;

/**
 * @program:test_2.20
 * @author:Nine_odes
 * @description:
 * @create:2020-02-20 21:06
 **/
//将一个正整数分解质因数，输入90，输出 90=2*3*3*5
public class program02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("请输入一个正整数");
//        int n = s.nextInt();
//        int k = 2;
//        System.out.print(n + "=");
//        while(k <= n){
//            if(k == n){
//                System.out.print(n);
//                break;
//            }else if(n % k == 0){
//                System.out.print(k + "*");
//                n /= k;
//            }else{
//                k++;
//            }
        System.out.println("请输入一个正整数：");

        while(s.hasNext()){
            int n = s.nextInt();
            int k = 2;
            System.out.print(n + "=");
            while(k <= n){
                if(k == n){
                    System.out.print(n);
                    break;
                }else if(n % k == 0){
                    System.out.print(k + "*");
                    n /= k;
                }else{
                    k++;
                }
            }
            System.out.println();
        }

    }


}
