/**
 * @program:test_9.10
 * @author:Nine_odes
 * @description:
 * @create:2020-09-10 22:10
 **/
public class TestDemo2 {
    public double Power(double base,int exponent){
        /*
        n为偶数，a的n次方等于n的二分之一次方  乘  n的二分之一次方
        n为奇数时，a的n次方等于 a的二分之一（n-1）次方 乘
        a的（n-二分之一）次方 乘a
         */

        int n = Math.abs(exponent);
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return base;
        }
        double result = Power(base,n>>1);
        result *= result;
        if((n & 1) == 1){
            result *= base;
        }
        if(exponent < 0){
            result = 1.0/result;
        }
        return result;
    }
}
