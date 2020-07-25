import java.util.Scanner;

/**
 * @program:test_7.25
 * @author:Nine_odes
 * @description:Broken Keyboard
 * @create:2020-07-25 18:33
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        for (int i = 0; i < s2.length(); i++) {
            s1 = s1.replace(s2.charAt(i) + "","");
        }
        String count = "";
        for (int i = 0; i < s1.length(); i++) {
            if(count.contains(s1.charAt(i) + "")){
                continue;
            }else{
                System.out.println(s1.charAt(i));
                count+=s1.charAt(i);
            }
        }
        System.out.println();
    }
}
