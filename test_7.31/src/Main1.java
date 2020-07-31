import java.util.Scanner;

/**
 * @program:test_7.31
 * @author:Nine_odes
 * @description:回文串
 * @create:2020-07-31 18:00
 **/
public class Main1 {
    private static boolean isHW(String str){
        for(int i = 0,j = str.length()-1; i <= j; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    private static int lcs(String s,String s1){
        if(s == null || s1 == null){
            return 0;
        }
        int m = s.length();
        int n = s1.length();
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for(int i = 1; i < m; i++){
            dp[0][i] = 0;
            dp[i] [0] = 0;
        }
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(s.charAt(i-1) == s1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String s1 = new StringBuilder(s).reverse().toString();
            int len = lcs(s,s1);
            if(s.length()-len <=1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
