package code1;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:二维数组
 * @create:2019-12-03 17:03
 */
public class SumAll {
    public static void main(String[] args) {
        int total = 0;
        int[][]arr = new int [3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i+j;
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        System.out.println(" The Sum is:"+total);
    }
}
