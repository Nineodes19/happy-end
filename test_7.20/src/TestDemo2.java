/**
 * @program:test_7.20
 * @author:Nine_odes
 * @description:
 * @create:2020-07-20 16:37
 **/
import java.util.*;
public class TestDemo2{
    private static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            sort(arr);
        }
    }
}
