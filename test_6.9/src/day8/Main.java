package day8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @program:test_6.9
 * @author:Nine_odes
 * @description:删数
 * @create:2020-06-09 14:42
 **/
public class Main {
    public static void main(String[] args) {
        String s = "3 9 6 8 -10 7 -11 19 30 12 23 5";
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length-1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1)
                arr[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n > 1000){
                n = 999;
            }
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                queue.offer(i);
            }
            while(queue.size() != 1){
                for (int i = 0; i < 2; i++) {
                    queue.offer(queue.poll());
                }
                queue.poll();
            }
            System.out.println(queue.poll());
        }
    }
}
