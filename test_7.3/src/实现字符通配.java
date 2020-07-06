import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program:test_7.3
 * @author:Nine_odes
 * @description:
 * @create:2020-07-03 15:19
 **/
public class 实现字符通配 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //*.com
        //shopeemobile.com
        String s = "o*m";
        String s1 = "shopeemobile.com";
        HashMap<Integer,Integer> map = new HashMap<>();
        String[] arr = s.split("\\*");


        System.out.println(Arrays.toString(arr));
    }
}
