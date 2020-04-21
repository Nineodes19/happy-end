import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_4.21
 * @author:Nine_odes
 * @description:
 * @create:2020-04-21 17:29
 **/
public class TestDemo2 {

    public static int numMaxPair(int[] arr1,int[] arr2){

        int num = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    num++;
                    break;
                }
            }
        }
        if(num != arr1.length){
            num++;
        }
        return num;
    }
    public static void main(String[] args){

//        Scanner in = new Scanner(System.in);
//        System.out.println("输入数组元素个数");
//        int n = in.nextInt();
//        int[] a = new int[n];
//        System.out.println("输入数组元素");
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();
//        }
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N],arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(numMaxPair(arr1, arr2));

    }
}
