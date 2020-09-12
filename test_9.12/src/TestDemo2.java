/**
 * @program:test_9.12
 * @author:Nine_odes
 * @description:
 * @create:2020-09-12 15:22
 **/
//最多的回文
import java.util.*;
public class TestDemo2 {
    //多少个长度大于1的子串都是回文
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() <= 1){
            System.out.println("0");//没有长度大于1 的
            return;
        }
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String arr = s;
                if(isHw(arr.substring(i,j))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    private static boolean isHw(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j >0 ; j--) {
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
