package code1;

import java.math.BigDecimal;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 13:32
 */
public class BigDecimalDemoo {
    public static void main(String[] args){
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println("add:" + bd1.add(bd2));
        System.out.println("subtract:" + bd1.subtract(bd2));
        System.out.println("multiply:" + bd1.multiply(bd2));
        System.out.println("divide:" + bd1.divide(bd2));
        System.out.println("divide:"+ bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));
    }
}
