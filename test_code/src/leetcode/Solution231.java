package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:2的幂
 * @create:2020-01-07 21:23
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        while(n % 2 == 0){
            n = n / 2;
        }
        return n == 1;
    }
}
