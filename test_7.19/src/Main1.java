import java.util.Scanner;

/**
 * @program:test_7.19
 * @author:Nine_odes
 * @description: 数字和为sum的方法数
 * @create:2020-07-19 10:30
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long[] dp = new long[sum+1];
        dp[0] = 1;
        for (int i = 0; i <n ; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] = dp[j]+dp[j-arr[i]];
            }
        }
        System.out.println(dp[sum]);
    }
}
