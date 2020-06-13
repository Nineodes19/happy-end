package day5;

import java.util.Scanner;

/**
 * @program:test_6.6
 * @author:Nine_odes
 * @description:神奇的口袋
 * @create:2020-06-07 08:29
 **/
public class Main {
    static int[] a;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = fun(0,40);
        System.out.println(count);
    }

    private static int fun(int i, int sum) {
        if(i == n){
            return 0;
        }
        if(a[i] == sum){
            return 1 + fun(i+1,sum);
        }else if(sum > a[i]){ return fun(i+1,sum-a[i]) + fun(i+1,sum); }
        return fun(i+1,sum);
    }
}
