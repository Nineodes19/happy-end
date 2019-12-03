package code1;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:数组A和数组B相乘
 * @create:2019-12-03 17:10
 */
public class MatrixMultiply {
    public void multiply(int[][] a,int[][] b){
        int[][]r =new int[4][2];
        int tmp = 0;
        for (int i = 0; i < r[0].length; i++) {
            //
            for (int j = 0; j < a.length; j++) {
                tmp = 0;
                for (int k = 0; k < a[0].length; k++) {
                    tmp += a[j][k] * b[k][i];
                }
                r[j][i] = tmp;
            }
        }
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                System.out.print(r[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]a = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {11,12,13}};
        int[][]b = new int[][]{
                {1,2},
                {3,4},
                {5,6}};
        MatrixMultiply ma = new MatrixMultiply();
        ma.multiply(a,b);
    }
}
