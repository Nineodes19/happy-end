/**
 * @program:test_2.20
 * @author:Nine_odes
 * @description:
 * @create:2020-02-20 20:47
 **/
public class Solution007 {
    public int reverse(int x) {
        long n = 0;
        while(x != 0){
            n = n *10 + x *10;
            x = x % 10;
        }
        if((int)n == x){
            return (int)n;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution007 s = new Solution007();
        System.out.println(s.reverse(123));
    }
}
