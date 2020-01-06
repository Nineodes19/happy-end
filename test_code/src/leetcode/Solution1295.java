package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:统计位数为偶数的数字
 * 给一个整数数组nums，返回其中位数为偶数的数字的个数
 * @create:2020-01-06 20:06
 */
public class Solution1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(oushu(nums[i])){
//                count++;
//            }
//        }
        for (int s:nums) {
            if(oushu(s)){
                count++;
            }
        }
        return count;
    }
    private boolean oushu(int array){
        int count = 1;
        while(array / 10 != 0){
            count++;
            array/=10;
        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1295 s = new Solution1295();
        int[] arr = {12,345,2,6,7896,5635,5};

        System.out.println(s.findNumbers(arr));
    }
}
