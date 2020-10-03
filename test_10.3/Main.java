/**
 * @program:test_9.25
 * @author:Nine_odes
 * @description:
 * @create:2020-09-26 11:00
 **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int maxsumofSubarray(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int[] dp = new int[arr.length];
        //要求子数组的最大累加和，因此最大值max初始化时
        // 值应该为Integer.MIN_VALUE;
        dp[0] = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            dp[i] = Math.max(dp[i-1]+arr[i] , arr[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){

        int[] arr = new int[]{};
        System.out.println(maxsumofSubarray(arr));
//        Scanner cin = new Scanner(System.in);
//        String inputStr = null;
//        while(cin.hasNext()) {
//            inputStr = cin.next();
//        }
//        int res;
//        if(inputStr == null || "".equals(inputStr)) {
//            res = maxsumofSubarray(null);
//        } else {
//            String[] split = inputStr.split(",");
//            int[] inputInt = new int[split.length];
//            for (int i = 0; i < split.length; i++) {
//                inputInt[i] = Integer.parseInt(split[i]);
//            }
//            res = maxsumofSubarray(inputInt);
//        }
//
//        System.out.println(res);
    }
}

