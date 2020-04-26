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
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        for(int i = 1; i <= n;i++){
            for (int j = 1; j <= n; j++) {
                if(i % j >= k){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
