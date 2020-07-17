import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_717
 * @author:Nine_odes
 * @description:
 * @create:2020-07-17 12:56
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ip = sc.nextLine();
            String num =sc.nextLine();
            System.out.println(ToNum(ip));
            ToIP(num);
        }
    }

    private static void ToIP(String p) {
        long temp = Long.parseLong(p);
        String ip = Long.toBinaryString(temp);
        StringBuffer sb = new StringBuffer();
        if(ip.length() < 32){
            for (int i = 0; i <32-ip.length() ; i++) {
                sb.append(0);
            }
            sb.append(ip);
        }else if(ip.length() == 32){
            sb.append(ip);
        }

        for (int i = 0; i < sb.length() - 8; i+=8) {
            System.out.print(Integer.parseInt(sb.substring(i,i+8),2) + ".");
        }
        System.out.println(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));
    }

    private static long ToNum(String ip){
        String[] arr = ip.split("\\.");
        long n = Long.parseLong(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            n = n<<8;
            n+=Long.parseLong(arr[i]);
        }
        return n;
    }
}
