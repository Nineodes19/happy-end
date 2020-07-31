/**
 * @program:test_7.31
 * @author:Nine_odes
 * @description:二维数组打印
 * @create:2020-07-31 17:59
 **/
public class Main {
    public static void main(String[] args) {

    }
    private int[] arrayPrint(int[][] arr,int n){
        int[] res = new int[n*n];
        int index = 0;
        for(int j = n-1; j >= 0; j--){
            int k = j;
            for(int i = 0; i <n-j; i++){
                res[index]= arr[i] [ k++];
                index ++;
            }
        }
        for (int i = 1; i < n; i++) {
            int k = i;
            for(int j = 0; j < n-i; j++){
                res[index++] = arr[k++][j];
            }
        }
        return res;
    }
}
