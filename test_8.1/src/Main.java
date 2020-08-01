import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_8.1
 * @author:Nine_odes
 * @description: 删除公共字符
 * @create:2020-08-01 13:14
 **/
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2  = sc.nextLine();
        char[] ch = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if(!s2.contains(String.valueOf(ch[i]))){
                System.out.print(ch[i]);
            }
        }
        System.out.println();
    }
}
