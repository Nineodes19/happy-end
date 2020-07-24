/**
 * @program:test_7.24
 * @author:Nine_odes
 * @description: 上楼梯
 * @create:2020-07-24 17:31
 **/
public class Main1 {
    public static int countWays(int n){
        long[] pre = {1,2,4};
        if(n <= 0){
            return 0;
        }else if(n <= 3){
            return (int)pre[n-1];
        }else {
            for (int i = 4; i <= n; i++) {
                long temp = ((pre[0] +pre[1]) % 1000000007 +pre[2] )%1000000007;
                pre[0] = pre[1];
                pre[1] = pre[2];
                pre[2] = temp;
            }
        }
        return (int) pre[2];
    }
}
