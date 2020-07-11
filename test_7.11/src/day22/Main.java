package day22;

/**
 * @program:test_7.11
 * @author:Nine_odes
 * @description:
 * @create:2020-07-11 18:30
 **/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] arr = s2.split("");
        int count = 0;//缺少的珠子数目
        for(int i = 0; i < s2.length(); i++){
            if(!s1.contains(arr[i])){
                count++;
            }
            if(i == s2.length() - 1){
                System.out.println("No " + count);
                return;
            }
        }
        System.out.println("Yes " + (s1.length() - s2.length()));
    }
}
