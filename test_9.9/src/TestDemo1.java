import java.util.Arrays;

/**
 * @program:test_9.9
 * @author:Nine_odes
 * @description:
 * @create:2020-09-09 22:59
 **/
public class TestDemo1 {
    public int JumpFloor(int target){
        int[] dp = new int[target];
        Arrays.fill(dp,1);
        for(int i = 1; i<target;i++){
            for(int j = 0; j < i; i++){
                dp[i] += dp[j];
            }
        }
        return dp[target-1];
    }
}
