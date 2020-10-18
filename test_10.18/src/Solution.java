/**
 * @program:test_10.18
 * @author:Nine_odes
 * @description:
 * @create:2020-10-18 15:21
 **/
import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param matrix int整型二维数组
     * @return int整型
     */
    public int maxValue (int[][] matrix) {
        // write code here
        //从网格的左上角移动到右下角，每个位置可向右或向下移动

        int max = matrix[0][0];

        for (int i = 1 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max += Math.max(matrix[i][++j],matrix[++i][j]);
            }

        }
        return max;

    }
}
