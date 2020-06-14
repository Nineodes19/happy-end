package day11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program:test_6.14
 * @author:Nine_odes
 * @description:构建乘积数组
 * @create:2020-06-14 10:27
 **/
public class Main1 {
    public static int[] multiply(int[] A){
        int[] B = new int[A.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            int mul = 1;
            for (int j = 0; j < A.length; j++) {
                if(i != j){
                    mul = mul * A[j];
                }
            }
            list.add(mul);
        }
        for (int i = 0; i < list.size(); i++) {
            B[i] = list.get(i);
        }
        return B;
    }

    public static void main(String[] args) {
        int[]  A = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(multiply(A)));
    }
}
