package day2;

/**
 * @program:test_6.4
 * @author:Nine_odes
 * @description:数组中的逆序对
 * @create:2020-06-04 11:46
 **/
public class AntiOrder {
    public static int count(int[] A, int n) {
        // write code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            for(int j = i+1; j < n;j++){
                if(A[i] > A[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,0};
        System.out.println(count(arr,arr.length));
    }
}
