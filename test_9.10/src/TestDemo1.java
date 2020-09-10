/**
 * @program:test_9.10
 * @author:Nine_odes
 * @description:
 * @create:2020-09-10 16:20
 **/

/*

给定一个double类型的浮点数base和
int类型的整数exponent。
求base的exponent次方。
保证base和exponent不同时为0
 */
public class TestDemo1 {
    public double Power(double base,int exponent){
        double result = 1.0;
        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        return result;
    }
    boolean flag = false;
    public double Power1(double base,int exponent){
        //当指数为负数时，先对指数求绝对值，算出结果再取导数
        //当底数是0且指数是负数时，需要对0 求导，该操作将出错
        flag = false;
        if(base == 0.0 && exponent <0){
            flag = true;
            return 0.0;
        }

        int abs = Math.abs(exponent);
        if(exponent < 0){
            abs = -exponent;
        }
        double result = PowerWith(base,abs);
        if(exponent < 0){
            result = 1.0 / result;
        }
        return result;
    }
    double PowerWith(double base, double exponent){
        double res = 1.0;
        for(int i = 1; i <= exponent; i++){
            res *= base;
        }
        return res;
    }
}
