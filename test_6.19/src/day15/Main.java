package day15;

/**
 * @program:test_6.19
 * @author:Nine_odes
 * @description:另类加法
 * @create:2020-06-19 18:21
 **/
public class Main {
    public int addAB(int A ,int B){
        if(B != 0){
            int a = A ^ B;//求A+B不考虑进位
            int b = (A&B) << 1;//求进位
            return addAB(a,b);
        }else{
            return A;
        }
    }
}
