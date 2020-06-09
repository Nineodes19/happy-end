package day8;

import java.sql.Connection;
import java.util.*;

/**
 * @program:test_6.9
 * @author:Nine_odes
 * @description: n个数里最小的k个
 * @create:2020-06-09 14:42
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String temp = sc.nextLine();
            String[] arr = temp.split(" ");
            int[] result = new int[arr.length -1];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if(i < arr.length - 1){
                    result[i] = Integer.parseInt(arr[i]);
                }else{
                    k = Integer.parseInt(arr[i]);
                }
            }
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                if(i < k-1){
                    System.out.print(arr[i] + " ");
                }else{
                    System.out.print(arr[i]);
                }
            }
        }
    }

    public static void main2(String[] args){
        int[] arr = new int[]{3,9,6,8,-10,7,-11,19,30,12,23};
        int k = 5;
        Arrays.sort(arr);
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int[] arr = new int[s1.length-1];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if(i < arr.length - 1)
                    arr[i] = Integer.parseInt(s1[i]);
                else
                    k = Integer.parseInt(s1[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                if(i < k-1){
                    System.out.print(arr[i] +" ");
                }else{
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
