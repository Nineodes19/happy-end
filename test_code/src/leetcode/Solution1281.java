package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:整数的各位积和之差
 * 给你一个整数n，请帮忙计算并返回该整数[各位数字之积]
 * 与[各位数字之和]的差
 * @create:2020-01-03 21:43
 */
public class Solution1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int sub = 1;
        int a = n;//234
        int b = n;
        while(b!= 0){
            a = b % 10;//4
            b /= 10;//23
            sum += a;
            sub *= a;
        }
        return sub - sum;
    }

    public static void main(String[] args) {
        Solution1281 s = new Solution1281();
        System.out.println(s.subtractProductAndSum(234));
    }
}
