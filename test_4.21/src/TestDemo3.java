import java.util.Scanner;

/**
 * @program:test_4.21
 * @author:Nine_odes
 * @description:
 * @create:2020-04-21 17:59
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入数组元素个数");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("输入数组元素");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
    }
}
