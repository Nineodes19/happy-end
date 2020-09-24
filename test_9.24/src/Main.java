/**
 * @program:test_9.24
 * @author:Nine_odes
 * @description:
 * @create:2020-09-24 19:43
 **/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//代表T组数据
        for (int i = 0; i < T; i++) {
            /*
            孔   钥匙
            01    11   00  00
            11    00   10  10
            10    10   11  11
             */
            int N = sc.nextInt();//钥匙孔
            int L = sc.nextInt();//钥匙
            for (int j = 0; j < N; j++) {
                int[] YS = new int[L];
                for (int k = 0; k < L; k++) {
                    YS[k] = sc.nextInt();
                }
            }
        }

    }
}
