/**
 * @program:test_3.3
 * @author:Nine_odes
 * @description:高精度计算
 * @create:2020-03-03 16:35
 **/

import java.util.Scanner;

/**
 * 输入格式：输入一个正整数n,n<=1000;
 * 输出n!的准确值
 */
public class TestCode3 {
    static int MAX = 10000;
    public static void main(String[] args) {
        int[] A = new int[MAX];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A[0] = 1;
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            int ge = 0,sum;
            for (int j = 0; j <=count ; j++) {
                if((i * A[j] + ge) / 10 != 0){
                    sum = A[j] * i +ge;
                    A[j] = sum%10;
                    ge = sum / 10;
                    if(j == count){
                        count++;
                        continue;
                    }
                }else{
                    A[j] = i * A[j] + ge;
                    ge = 0;
                }
            }
        }

        for (int i = count; i >= 0 ; i--) {
            System.out.print(A[i]);
        }
    }
}
