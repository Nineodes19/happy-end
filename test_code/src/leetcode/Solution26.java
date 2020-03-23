package leetcode;

/**
 * @program:test_code
 * @author:Nine_odes
 * @description:
 * @create:2020-03-23 16:05
 **/
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int lower = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[lower] != nums[fast] ){
                nums[lower++] = nums[fast];
            }
        }
        return lower+1;
    }
}
