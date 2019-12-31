package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:和为零的N个唯一整数
 * @create:2019-12-29 22:10
 */
public class Solution5295 {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n/2; i++) {
            arr[i*2] = i+1;
            arr[i*2+1] = -(i+1);
        }
        return arr;
    }
}
