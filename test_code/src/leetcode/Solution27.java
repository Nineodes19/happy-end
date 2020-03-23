package leetcode;

/**
 * @program:test_code
 * @author:Nine_odes
 * @description:
 * @create:2020-03-23 13:44
 **/
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int lower = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != val){
                nums[lower] = nums[fast];
                lower++;
            }
        }
        return lower;
    }
}
