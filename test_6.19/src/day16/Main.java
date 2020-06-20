package day16;


import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @program:test_6.19
 * @author:Nine_odes
 * @description:洗牌
 * @create:2020-06-19 19:21
 **/
public class Main {
    private static List<Integer> flush(List<Integer> cards,int n){
        List<Integer> left = cards.subList(0,n);
        List<Integer> right = cards.subList(n,n* 2);
        List<Integer> list = new ArrayList<>();
        int rightIndex,leftIndex;
        for (int i = 0; i < n; i++) {
            list.add(right.get(n - i - 1));
            list.add(left.get(n - i - 1));
        }
        for (int i = 0; i < n; i++) {
            int temp = list.get(i);
            list.set(i,list.get(2 * n - i - 1));
            list.set(2*n - i - 1,temp);
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> cards = new ArrayList<>();
            for (int j = 0; j < 2 * n; j++) {
                cards.add(sc.nextInt());
            }
            for (int j = 0; j < k; j++) {
                cards = flush(cards,n);
            }
            for (int j = 0; j < cards.size(); j++) {
                System.out.println(cards.get(j));
                if( j != cards.size() - 1){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
