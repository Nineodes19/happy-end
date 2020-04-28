import java.util.Scanner;

/**
 * @program:test_4.28
 * @author:Nine_odes
 * @description:连续子数组最大和
 * @create:2020-04-28 17:39
 **/
public class TestDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        int maxNumber = dp[0];
        for(int i = 1; i< N; i++){
            dp[i] =Math.max(dp[i-1] + arr[i],arr[i]);
            maxNumber = Math.max(dp[i],maxNumber);
        }
        System.out.println(maxNumber);
    }
}
