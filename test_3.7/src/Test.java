import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_3.7
 * @author:Nine_odes
 * @description:数列排序
 * @create:2020-03-07 23:08
 **/
public class Test {
    /**
     * 给定一个长度为n的数列，将这个数列按从小到大的书序排列
     * 输入：第一行为一个整数n
     * 第二行包含n个整数，为待排序的书 ，每个整数的绝对值小于10000
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        while(scanner.hasNext()){
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if(arr[i] >= 10000){
                    try {
                        throw new Exception("数组元素值大于10000");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            Arrays.sort(arr);
            for (int x:arr) {
                System.out.print(x + " ");
            }
        }
    }


}
