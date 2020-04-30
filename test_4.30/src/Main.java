import java.util.Scanner;

/**
 * @program:test_4.30
 * @author:Nine_odes
 * @description:
 * @create:2020-04-30 22:55
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] S = new int[K];
        for (int i = 0; i < N; i++) {
            S[sc.nextInt()%K]++;
        }
        int sum = S[0] > 0 ? 1 : 0;
        for (int i = 1,j = K -1; i <= j ; i++,j--) {
            sum += (i==j) ? (S[i] >= 1 ? 1 : 0) : Math.max(S[i],S[j]);
        }
        System.out.println(sum);
    }
}
