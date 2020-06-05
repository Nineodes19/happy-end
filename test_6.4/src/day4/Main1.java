package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_6.4
 * @author:Nine_odes
 * @description:
 * @create:2020-06-05 12:27
 **/
public class Main1 {

    private static String delete(String s,String arr){
        StringBuffer ret= new StringBuffer();
        for (int i = 0,j; i < s.length(); i++) {
            for (j=0; j < arr.length(); j++) {
                if(s.charAt(i) != arr.charAt(j)){
                    continue;
                }else {
                    break;
                }
            }
            if(j == arr.length()){
                ret.append(s.charAt(i));
            }
        }

        return ret.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String arr = sc.nextLine();
            System.out.println(delete(s,arr));
        }
    }
}
