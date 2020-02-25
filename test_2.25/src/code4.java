/**
 * @program:test_2.25
 * @author:Nine_odes
 * @description:芯片测试
 * @create:2020-02-25 17:45
 **/

import java.util.Scanner;

/**有n（2<= n <= 20)块芯片，有好有坏，已知好芯片比坏芯片多。
 * 每个芯片都能用来测试其他芯片。用好的芯片测试其他芯片时，能正确的给出
 * 测试芯片是好是坏，坏芯片测试随机给出测试结果
 * 输入格式：输入数据第一行为一个整数n，表示芯片个数
 * 第二行到第n+1行为n*n的一张表，每行n个数据，第i行第i列数据表示用第i块芯片
 * 测试第j块芯片得到的测试结果
 * 输出格式：按从小到大的顺序输出所有好芯片的编号
 */


public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                count+=a[i][j];
            }
            if(count > n / 2){
                System.out.print((j + 1) + " ");
            }
        }
    }
}
