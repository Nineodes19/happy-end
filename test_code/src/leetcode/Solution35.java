package leetcode;

/**
 * @program:test_code
 * @author:Nine_odes
 * @description:
 * @create:2020-03-23 18:52
 **/
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        //先判断nums[nums.length/2]和target的值
        //如果target大，在0--nums。lengthlength/2中继续找

        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;


    }
}
