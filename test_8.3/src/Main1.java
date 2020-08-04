/**
 * @program:test_8.3
 * @author:Nine_odes
 * @description:字符串加解密
 * @create:2020-08-03 18:03
 **/

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(enCryption(s1));
            System.out.println(deCryption(s2));
        }
    }
    private static char encryption(char c){
        if(c >= 'a' && c <'z')
            return (char) (c+1-32);
        else if(c == 'z')
            return 'A';
        else if(c >='A' && c <'Z')
            return (char)(c+1+32);
        else if(c == 'Z')
            return 'a';
        else if(c >= '0' && c < '9')
            return (char) (c+1);
        else if(c == '9')
            return '0';
        else
            return c;
    }
    private static  char decryption(char c){
        if(c > 'a' && c <='z')
            return (char) (c-1-32);
        else if(c == 'a')
            return 'Z';
        else if(c >'A' && c <='Z')
            return (char)(c-1+32);
        else if(c == 'A')
            return 'z';
        else if(c > '0' && c <= '9')
            return (char) (c-1);
        else if(c == '0')
            return '9';
        else
            return c;
    }

    private static String enCryption(String s){
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            sb.append(encryption(c[i]));
        }
        return sb.toString();
    }
    private static String deCryption(String s){
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            sb.append(decryption(c[i]));
        }
        return sb.toString();
    }
}
