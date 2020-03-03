/**
 * @program:test_3.3
 * @author:Nine_odes
 * @description:Huffuman树
 * @create:2020-03-03 12:48
 **/

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对于给定的一个数列，求出用该数列构造Huffman树的总费用
 * 输入格式：输入的第一行包含一个正整数n(n<=100)
 * 接下来是n个正整数，表示p0，p1，...pn-1，每个数不超过1000
 * 输出格式：输出用这些书构造Huffman树的总费用
 */
public class TestCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] > 1000){
                System.out.println("输入过界！！！");
                return;
            }
        }
        int k = 0,sum = 0;
        while(n > 1){
            Arrays.sort(a);//将数组a正序排列
            k = a[0] + a[1];//最小的两位数相加
            sum += k;
            a[0] = k;
            a[1] = Integer.MAX_VALUE;
            n--;
        }
        System.out.println(sum);
    }
}
