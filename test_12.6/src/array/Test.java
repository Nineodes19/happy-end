package array;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.util.Scanner;

/**
 * @program:test_12.6
 * @author: Nine_odes
 * @description:星际穿越
 * @create:2019-12-06 19:46
 */

public class Test{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        int x = 0;
//        while(x + (int)Math.pow(x,2) <= h){
//            x++;
//        }
//        System.out.println(--x);
//    }

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long x = (long)Math.pow(h,0.5);
        if(x*x  + x > h){
            System.out.println(--x);
        }else{
            System.out.println(x);
        }
    }
}