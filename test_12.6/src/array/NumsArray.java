package array;

/**
 * @program:test_12.6
 * @author: Nine_odes
 * @description:数组中重复的数字
 * @create:2019-12-06 16:22
 */

/**
 * 找出数组中重复的数字
 * 在一个长度为n的数组里的所有数字都在n~ n-1的范围内。
 * 数组中的某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次
 * 请找出数组中任意一个重复的数字。
 * 例如：输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复数字2或者3
 */


public class NumsArray {
    public static boolean duplicate(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i ; j--) {
                if(numbers[i] == numbers[j]){
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4,10,1,0,2,5,3};
        duplicate(nums);
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i] == nums[j]){
//                    System.out.println(nums[i]);
//                }
//            }
//        }
    }
}

