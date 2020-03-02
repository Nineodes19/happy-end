/**
 * @program:test_3.2
 * @author:Nine_odes
 * @description:报时助手
 * @create:2020-03-02 20:36
 **/

import java.util.Scanner;

/**
 * 输入格式：输入包含两个非负整数b和n，表示时间的时和分。非零的数字前没有前导0.
 * h小于24，m小于60
 * 输出格式：输出时间时刻的英文
 */
public class TestCode1 {

    public static String[] time1 = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
                                    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
                                    "eighteen","nineteen","twenty"};
    public static String[] time2 = {"twenty","thirty","forty","fifty"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int h = sc.nextInt();
            int m = sc.nextInt();
            if(h >= 24 || h >= 60){
                System.out.println("输入错误！");
                return;
            }
            if(h <= 20){
                System.out.print(time1[h]);
            }else{
                System.out.print("twenty" + "-" + time1[h-20]);
            }
            if(m == 0){
                System.out.print(" " + "o'clock");
            }else{
                if(m < 20){
                    System.out.print(" " + time1[m]);
                }else{
                    int a = m / 10;
                    int b = m % 10;
                    if(b == 0){
                        System.out.print(" " + time2[a-2]);
                    }else{
                        System.out.print(" " + time2[a-2] + "-" + time1[b]);
                    }
                }
            }
            System.out.println();
        }

    }
}
