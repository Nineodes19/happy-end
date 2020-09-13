/**
 * @program:test_9.12
 * @author:Nine_odes
 * @description:
 * @create:2020-09-12 15:10
 **/

import java.util.*;
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();//多少组
            String s1 = sc.nextLine();
            String[] S1 = s1.split(" ");
            String s2 = sc.nextLine();
            String[] S2 = s2.split(" ");
            String s3 = sc.nextLine();
            String[] S3 = s3.split(" ");
            for (int i = 0; i < S1.length; i++) {
                System.out.print(S1[i] + "-");
                for (int j = i; j < S2.length; j++) {

                }
            }
        }
    }
}
