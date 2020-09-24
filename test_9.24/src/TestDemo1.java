/**
 * @program:test_9.24
 * @author:Nine_odes
 * @description:
 * @create:2020-09-24 19:21
 **/

import java.util.*;
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String[] s = s1.split(" ");
        int n = Integer.parseInt(s[1]);
        char[] c = s[0].toCharArray();
        for (char ch : c) {
            if(!Character.isDigit(ch)){
                System.out.println("error");
                return;
            }
        }
        if(s[0].length() < n || s[0].length()  != 8){
            System.out.println("error");
            return;
        }
        StringBuffer sb = new StringBuffer();
        char[] arrsort = new char[s[0].length()];
        for (int i = 0,j = 0; i < s[0].length(); i++,j++) {
            if(i == n-1){
                i++;
            }
            arrsort[j] = s[0].charAt(i);
        }
        Arrays.sort(arrsort);
        for (int i = arrsort.length-1; i >=0; i--) {
            sb.append(arrsort[i]);
        }
            //System.out.println(Arrays.toString(arrsort));
        System.out.println(sb.toString());
    }
}
