import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * @program:test_4.26
 * @author:Nine_odes
 * @description:
 * @create:2020-04-26 20:38
 **/
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        long res = 0L;
        if(k ==0){
            System.out.println(n*n);
        }
        for (long i = k+1; i <= n; i++) {
            res+=(n/i)*(i-k) + Math.max(n%i-k+1,0);
        }
        System.out.println(res);
    }
}
