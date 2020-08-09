/**
 * @program:test_8_8
 * @author:Nine_odes
 * @description: 合唱团
 * @create:2020-08-09 11:17
 **/
//import java.util.*;
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();//学生个数
//        int[] arr = new int[n+1];
//        for (int i = 1; i < n+1; i++) {
//            arr[i] = sc.nextInt();//每个学生的能力值
//        }
//        int k = sc.nextInt();//需要选择的学生个数
//        int d = sc.nextInt();//位置间隔
//
//        long[][] f = new long[n+1][k+1];
//        long[][] g = new long[n+1][k+1];
//        for(int one = 1; one <= n; one++){
//            f[one][1] = arr[one];
//            g[one][1] = arr[one];
//        }
//        for(int kk=2; kk<=k; kk++){
//            for(int one=kk; one<=n; one++){
//                long tempmax = Long.MIN_VALUE;
//                long tempmin = Long.MAX_VALUE;
//                for(int left = Math.max(kk-1,one-d); left<=one-1; left++){
//                    if(tempmax<Math.max(f[left][k-1]*arr[one],g[left][k-1]*arr[one])){
//                        tempmax=Math.max(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
//                    }
//                    if(tempmin>Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one])){
//                        tempmin=Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
//                    }
//                }
//                f[one][k] = tempmax;
//                g[one][k] = tempmin;
//            }
//        }
//        long result = Long.MIN_VALUE;
//        for(int one = k; one <=n; one++){
//            if(result<f[one][k]){
//                result = f[one][k];
//            }
//        }
//        System.out.println(result);
//    }
//}



import java.util.*;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//学生人数
        int[] arr = new int[n+1];//存储学生能力值
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();//需要选取的学生人数
        int d = sc.nextInt();//相邻学生间隔
        long[][] dp = new long[n+1][k+1];
        long[][] dp1 = new long[n+1][k+1];
        for(int one = 1; one<=n; one++){
            dp[one][1] = arr[one];
            dp1[one][1] = arr[one];
        }
        for(int kk = 2; kk <=k;kk++){
            for(int one = kk; one <=n; one++){
                long tempmax = Long.MIN_VALUE;
                long tempmin = Long.MAX_VALUE;
                for(int left=Math.max(kk-1,one-d);left <= one-1; left++){
                    if(tempmax < Math.max(dp[left][kk-1]*arr[one],dp1[left][kk-1]*arr[one])){
                        tempmax = Math.max(dp[left][kk-1]*arr[one],dp1[left][kk-1]*arr[one]);
                    }
                    if(tempmin > Math.min(dp[left][kk-1]*arr[one],dp1[left][kk-1]*arr[one])){
                        tempmin = Math.min(dp[left][kk-1]*arr[one],dp1[left][kk-1]*arr[one]);
                    }
                }
                dp[one][kk] = tempmax;
                dp1[one][kk] = tempmin;
            }
        }
        long ret = Long.MIN_VALUE;
        for(int i = k; i <= n; i++){
            if(ret < dp[i][k]){
                ret = dp[i][k];
            }
        }
        System.out.println(ret);
    }
}