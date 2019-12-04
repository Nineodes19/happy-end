package packaging;

import java.util.Arrays;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:
 * @create:2019-12-03 20:07
 */
public class Test4 {
    public static void main(String[] args) {
//        int[] num = {1,2,3,4,0};
////        System.arraycopy(num,1,num,2,3);
////        num[1] = 0;
////        System.out.println(Arrays.toString(num));

        int[] num = {1,2,3,4};
        System.arraycopy(num,2,num,1,2);
        num[3] = 0;
        System.out.println(Arrays.toString(num));
    }
}
