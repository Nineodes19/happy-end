package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:完全平方数
 * 给定正整数n，找到若干个完全平方数，使得它们的和等于n，
 * 要让组成和的完全平方数的个数最少。
 * @create:2020-01-06 19:45
 */
public class Solution279 {
    public int numSquares(int n) {
        int count = 0;
        while(n > 0){
            n = Maxnumber(n);
            count++;
        }
        return count;
    }
    private int Maxnumber(int n){
        for (int i = (int)Math.sqrt(n); i <= 0; i--) {
            if(i * i <= n){
                n -= i * i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution279 s = new Solution279();

        System.out.println(s.numSquares(12));
    }
}
