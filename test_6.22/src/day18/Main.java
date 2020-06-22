package day18;

import java.util.Scanner;

/**
 * @program:test_6.22
 * @author:Nine_odes
 * @description:DNA序列
 * @create:2020-06-22 12:40
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = sc.nextInt();
        int max = 0;
        int maxindex = 0;
        for (int i = 0; i < s.length() - N; i++) {
            int count = 0;
            for (int j = i; j < i+N; j++) {
                if(s.charAt(j) == 'G' || s.charAt(j) == 'C'){
                    count++;
                }
            }
            if(count > max){
                maxindex = i;
                max = count;
            }
        }
        System.out.println(s.substring(maxindex,maxindex+N));
    }
}
