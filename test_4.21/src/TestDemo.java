import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_4.21
 * @author:Nine_odes
 * @description:
 * @create:2020-04-21 13:51
 **/
public class TestDemo {

    public static boolean isHw(String s){
        int len = s.length();
        char[] str = s.toCharArray();
        for (int i = 0,j = len-1; i < j; i++,j--) {
            if(str[i] != str[j] ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int nums = sc.nextInt();
            String num = String.valueOf(Math.abs(nums));
            if(isHw(num)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
