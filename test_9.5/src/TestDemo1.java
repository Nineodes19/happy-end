/**
 * @program:test_9.5
 * @author:Nine_odes
 * @description:
 * @create:2020-09-05 19:53
 **/
public class TestDemo1 {
    //在一个二维数组中（每个一维数组的长度相同），
    // 每一行都按照从左到右递增的顺序排序，
    // 每一列都按照从上到下递增的顺序排序。
    // 请完成一个函数，输入这样的一个二维数组和一个整数，
    // 判断数组中是否含有该整数。
    public boolean Find1(int target,int[][]array){
        int len = array.length-1;
        int i =0;
        while(len >= 0 && (i<array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }

    /*  0 1 2 3   arr[0][0] = 0  arr[0][1] = 1
        1 2 3 4   arr[1][0] = 1  arr[1][1] = 2 arr[1][2] = 3
        2 3 4 5
        3 4 5 6
        4 5 6 7

     */
    public boolean Find(int[][] array,int target){
        for(int[] i : array){
            for(int j : i){
                if(j == target){
                    return true;
                }
            }
        }
        return false;
    }
}
