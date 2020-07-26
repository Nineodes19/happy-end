import java.util.Scanner;

/**
 * @program:test_7.26
 * @author:Nine_odes
 * @description: 风口的猪-中国牛市
 * @create:2020-07-26 12:31
 **/
public class Solution {
    public static int calculateMax(int[] prices){
        if(prices == null || prices.length == 0 || prices.length <2 ||prices.length > 100){
            return 0;
        }
        int len = prices.length;
        int[] dp1 = new int[len];
        dp1[0] = 0;
        int minI = 0;
        for (int i = 1; i < len; i++) {
            if(prices[i] > prices[i-1]){
                dp1[i] = Math.max(prices[i] - prices[minI],dp1[i-1]);
            }else {
                dp1[i] = dp1[i-1];
                if(prices[i] < prices[minI]){
                    minI = i;
                }
            }
        }
        int[] dpr = new int[len];
        dpr[len-1] = 0;
        int maxI = len -1;
        for(int i = len-2; i>=0; i--){
            if(prices[i] < prices[i+1] ){
                dpr[i] = Math.max(prices[maxI] - prices[i],dpr[i+1]);
            }else {
                dpr[i] = dpr[i+1];
                if(prices[i] > prices[maxI]){
                    maxI = i;
                }
            }
        }
        int res = 0;
        for(int i = 0; i < len; i++){
            res = Math.max(dp1[i] + dpr[i],res);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
