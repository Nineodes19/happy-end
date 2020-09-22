/**
 * @program:test_9.22
 * @author:Nine_odes
 * @description:
 * @create:2020-09-22 20:36
 **/

import org.omg.CORBA.INTERNAL;

import java.util.*;
public class TestDemo3 {
    public static int thirdMax (int[] nums) {
        // write code here
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        if(list.size() > 3){
            return list.get(list.size()-3);
        }
       int max = Integer.MIN_VALUE;
       for (int i = 0; i < nums.length; i++) {
           if(nums[i] > max){
               max = nums[i];
           }
       }
       return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,4,5};

        //System.out.println(arr[arr.length-3]);
        System.out.println(thirdMax(arr));

//        Arrays.sort(nums);
//        if(nums.length == 0){
//            return 0;
//        }else if(nums.length < 3){
//            return nums[nums.length-1];
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = nums.length,-1; i >= 0; i--) {,
//            if(!list.contains(nums[i])){
//                list.add(nums[i]);
//            }
//        }
//        if(list.size() < 3){
//            return list.get(list.size()-1);
//        }
//        return list.get(2);
    }
}
