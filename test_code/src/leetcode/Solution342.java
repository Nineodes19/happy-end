package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:4的幂
 * 给定一个整数（32位有符号整数），请编写一个函数判断是不是4的幂次方
 * @create:2020-01-07 20:57
 */
public class Solution342 {
//    public boolean isPowerOfFour(int num) {
//
//        for (int i = 0; i <= num/2; i++) {
//            if((int)Math.pow(4,i) == num){
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean isPowerOfFour(int num) {
        if(num == 0) return false;
        while(num % 4 == 0){
            num /= 4;
        }
        return num ==1;
    }



    public static void main(String[] args) {
        Solution342 s = new Solution342();
        System.out.println(s.isPowerOfFour(1));
    }
}
