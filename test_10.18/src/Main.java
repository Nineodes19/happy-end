/**
 * @program:test_10.18
 * @author:Nine_odes
 * @description:
 * @create:2020-10-18 15:29
 **/
/*
计算200以内正整数的阶乘
 */
import java.util.*;
public class Main {
    public static String jiecheng(int num){
        long sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }

        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N <1 || N >200){
            System.out.println("Error");
        }
        System.out.println(jiecheng(N));
    }
}
