package day23;

        import java.lang.reflect.Array;
        import java.util.Arrays;
        import java.util.Scanner;

/**
 * @program:test_7.12
 * @author:Nine_odes
 * @description: 数字分类（20）
 * @create:2020-07-12 16:34
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean tem = false;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        //double[] ret = new double[5];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] % 5 == 0 && arr[i] % 2 == 0){
                sum += arr[i];
                tem = true;
            }
        }
        if(tem){
            System.out.print(sum + " ");
            tem = false;
        }else
            System.out.print("N ");

        int sum1 = 0;
        int temp = 1;
        for (int i=0,j = 0; i < N; i++) {
            if(arr[i] % 5 == 1){
                sum1+=arr[i] * temp;
                temp *= -1;
                tem = true;
            }
        }
        if(tem){
            System.out.print(sum1 + " ");
            tem = false;
        } else
            System.out.print("N ");


        int sum2 = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] % 5 == 2){
                sum2++;
                tem = true;
            }
        }

        if(tem){
            System.out.print(sum2 + " ");
            tem = false;
        } else
            System.out.print("N ");

        int sum3 = 0;
        double count = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] % 5 == 3){
                sum3+=arr[i];
                count++;
                tem = true;
            }
        }
        if(tem){
            System.out.printf("%.1f ",sum3/count);
            tem = false;
        } else
            System.out.print("N ");


        int sum4 = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] % 5 == 4){
                if(arr[i] > sum4){
                    sum4 = arr[i];
                    tem = true;
                }
            }
        }
        if(tem){

            System.out.print(sum4);
            tem = false;
        } else
            System.out.print("N ");

    }
}
