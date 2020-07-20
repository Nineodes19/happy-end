import java.util.Scanner;

/**
 * @program:test_7.20
 * @author:Nine_odes
 * @description:
 * @create:2020-07-20 18:30
 **/
public class TestDemo3 {
    private static void sort(int[] arr){

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
