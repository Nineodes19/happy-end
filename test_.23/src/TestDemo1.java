import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program:test_.23
 * @author:Nine_odes
 * @description:
 * @create:2020-09-23 09:20
 **/
public class TestDemo1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 字符串查找
     * @param s string字符串 被查找的字串
     * @param pattern string字符串 要查找的模式串
     * @return int整型
     */
    public static int indexOf (String s, String pattern) {
        // write code here
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == pattern.charAt(0)){
                if(s.substring(i,i+pattern.length()).equals(pattern)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "bc";
        System.out.println(indexOf(a,b));
    }
}
