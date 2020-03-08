import java.util.Scanner;

/**
 * @program:test_3.8
 * @author:Nine_odes
 * @description:进制转换
 * @create:2020-03-08 23:11
 **/
public class Code1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Trans(n));
    }

    public static String Trans(int n){
        String s = "0123446789ABCDEF";
        StringBuffer str = new StringBuffer();
        for (int i = 0; n >= 16; i++) {
            int a = n % 16;
            n /= 16;
            str.append(s.charAt(a));
        }
        str.append(s.charAt(n));
        return str.reverse().toString();
    }
    public static void main1(String[] args) {
        //十六进制转十进制
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Long.parseLong(s,16));
    }
}
