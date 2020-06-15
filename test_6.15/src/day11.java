import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_6.15
 * @author:Nine_odes
 * @description:生成格雷码
 * @create:2020-06-15 18:17
 **/
public class day11 {
    public static String[] getGray1(int n){
        String[] res = null;
        if(n == 1){
            res = new String[]{"0","1"};
        }else{
            String[] str = getGray1(n-1);
            int teslen = 2*str.length;
            res = new String[teslen];
            for (int i = 0; i < str.length;i++) {
                res[i] = "0" + str[i];
                res[res.length-1-i] = "1" + str[i];
            }
        }
        return res;
    }

    public static String[] getGray(int n) {
        // write code here
        String[] res = null;//设置返回值数组res，初始值为null
        if(n == 1){
            res = new String[]{"0","1"};
        }else{
            String[] s = getGray(n-1);
            int reslen = 2*s.length;
            res = new String[reslen];
            for(int i = 0; i < s.length;i++){
                res[i] = "0" + s[i];
                res[reslen-1-i] = "1" + s[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(Arrays.toString(getGray(n)));
        }

    }
}
