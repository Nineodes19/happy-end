package leetcode;

import java.util.HashSet;
import java.util.Set;



/**
 * @program:test_code
 * @author: Nine_odes
 * @description:丑数
 * 只包含质因数2,3,5,的正整数
 * @create:2020-01-04 22:45
 */
public class Solution263 {
    public boolean isUgly(int num) {
        if(num == 0){
            return false;
        }
        while (num != 1){
            if(num % 2 == 0){
                num /= 2;
                continue;
            }
            if(num % 3 == 0){
                num /= 3;
                continue;
            }
            if(num % 5 == 0){
                num /= 5;
                continue;
            }
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        Solution263 s = new Solution263();
        System.out.println(s.isUgly(20));
    }
}
