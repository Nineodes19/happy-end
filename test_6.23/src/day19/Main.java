package day19;

import java.util.Arrays;

/**
 * @program:test_6.23
 * @author:Nine_odes
 * @description:子串判断
 * @create:2020-06-23 08:55
 **/
public class Main {
    public static boolean[] chkSubStr(String[] p,int n,String s){
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.contains(p[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"a","b","c","d"};
        String str = "abc";
        System.out.println(Arrays.toString(chkSubStr(s,4,str)));
    }
}
