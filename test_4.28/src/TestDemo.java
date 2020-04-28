import java.util.Scanner;

/**
 * @program:test_4.28
 * @author:Nine_odes
 * @description: 建物流中转站
 * @create:2020-04-28 13:52
 **/
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] question = new int[n][n];
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                question[i][j] = sc.nextInt();
                result[i][j] = 0;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0;j < n; j++){
                if(question[i][j] == 0){
                    findOne(question,result,i,j,n);
                }else{
                    result[i][j] = Integer.MAX_VALUE;
                    findZero(question,result,i,j,n);
                }
            }
        }

        int minResult = Integer.MAX_VALUE;
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(result[i][j] < minResult)
                    minResult = result[i][j];
            }
        }

        minResult = minResult == Integer.MAX_VALUE ? -1 : minResult;
        System.out.println(minResult);
    }

    /**
     * @param question 问题数组
     * @param result 结果矩阵
     * @param x 结果矩阵的行
     * @param y 结果矩阵的列
     * @param n 行和列的最大值
     */
    private static void findZero(int[][] question,int[][] result, int x,int y,int n){
        int j = y;
        for(int i = x; i<n; i++){
            for(; j < n; j++){
                if(question[i][j] == 0){
                    result[i][j] += (Math.abs(i-x) + Math.abs(j-y));
                }
            }
            j = 0;
        }
    }

    private static void findOne(int[][] question,int[][] result,int x,int y, int n){
        int j = y;
        for (int i = x; i < n; i++) {
            for (; j < n; j++) {
                if(question[i][j] == 1 ){
                    result[x][y] += (Math.abs(i-x)+Math.abs(j-y));
                }
            }
            j=0;
        }
    }
}
