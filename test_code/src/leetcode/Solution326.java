package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:3的幂
 * @create:2020-01-08 20:32
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }


}
