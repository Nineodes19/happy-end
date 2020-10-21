/**
 * @program:test_10.21
 * @author:Nine_odes
 * @description:
 * @create:2020-10-21 19:31
 **/
import java.util.*;
public class Main {
    private static boolean isHw(int[] arr){
        for (int i = 0,j = arr.length-1; i <=j ; i++,j--) {
            if(arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(isHw(arr)){
            System.out.println(0);
        }
    }
}
