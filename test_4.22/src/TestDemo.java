import java.util.Scanner;

/**
 * @program:test_4.22
 * @author:Nine_odes
 * @description:
 * @create:2020-04-22 15:34
 **/
//public class TestDemo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for (int i = 0; i < N ; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int[] dp = new int[N];
//        dp[0] = arr[0];
//        int max = dp[0];
//        for(int i = 1; i < N; i++){
//            dp[i] = Math.max(arr[i],dp[i-1] + arr[i]);
//            max = Math.max(max,dp[i]);
//        }
//
//        System.out.println(max
//        );
//    }
//}

public class TestDemo{
    public static int Maxnumber(int[] arr){

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int max = dp[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(arr[i],arr[i] + dp[i-1]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Maxnumber(arr));
    }
}