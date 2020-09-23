import java.util.Scanner;

/**
 * @program:test_.23
 * @author:Nine_odes
 * @description:
 * @create:2020-09-23 10:46
 **/
public class TestDemo3 {
    public static void main(String[] args){
        /*
        输入两个字符串，从第一个字符串中删除第二个字符串中的所有字符，
         */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] str = s1.split("");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            if(!s2.contains(str[i])){
                sb.append(str[i]);
            }
        }
        System.out.println(sb);
    }
}
