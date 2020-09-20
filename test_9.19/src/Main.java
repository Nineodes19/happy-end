/**
 * @program:test_9.19
 * @author:Nine_odes
 * @description:
 * @create:2020-09-20 20:35
 **/


/*
ABCABBACD

ABCABDABDABEABEABF

ABC ABD AEC
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                String s = sc.next();
                StringBuffer sb = new StringBuffer(s);
                String[] arr = new String[s.length()/3];
                for (int j = 0; j < arr.length; j++) {
                    String str = s.substring(0,3);
                    sb.delete(0,3);
                    s = sb.toString();

                    arr[j] = str;
                }
                System.out.println(likeString(arr)?"Yes":"No");
            }

        }

    }

    private static boolean likeString(String[] arr){
        //String类型的数组中每个位置都存储三位字符串
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                count =0;
                for (int k = 0; k < 3; k++) {
                    if(arr[i].charAt(k) != arr[j].charAt(k)){
                        count ++;
                    }
                }
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
}
