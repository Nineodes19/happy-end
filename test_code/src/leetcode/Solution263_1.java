package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:丑数
 * @create:2020-01-05 21:52
 */
public class Solution263_1 {
    public boolean isUgly(int num){
        if(num<=0) return false;
        while(num!=1)
        {
            if(num%2==0){
                num/=2;
            }else if(num%3==0){
                num/=3;
            }else if(num%5==0){
                num/=5;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution263 s = new Solution263();
        System.out.println(s.isUgly(8));
    }
}
