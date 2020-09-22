/**
 * @program:test_9.22
 * @author:Nine_odes
 * @description:
 * @create:2020-09-22 20:43
 **/
public class TestDemo4 {
    public static int maxSubArray (int[] nums) {
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i],dp[i-1] + nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        //-2,1,-3,4,-1,2,1,-5,4]
        int max = Integer.MAX_VALUE;
        int[] arr = new int[]{max};
        System.out.println(maxSubArray(arr));
    }
}
