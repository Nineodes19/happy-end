import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_4.22
 * @author:Nine_odes
 * @description:
 * @create:2020-04-22 15:50
 **/
public class TestDemo2 {

    public static int Num(int n){
            int num = n /3 * 2;
            if(n % 3 == 2){
                return num+1;
            }else{
                return num;
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(Num(r) - Num(l-1));
    }
}
//   1   12   123   1234   12345    123456      1234567
//        1    2             3         4