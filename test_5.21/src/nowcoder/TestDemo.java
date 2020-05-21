package nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program:test_5.21
 * @author:Nine_odes
 * @description:
 * @create:2020-05-21 10:07
 **/
public class TestDemo {
    static List<String> list = new ArrayList();
    public static boolean isHw(String s){
        int len = s.length();
        char[] str = s.toCharArray();
        for(int i = 0,j = len-1; i < j; i++,j--){
            if(str[i] != str[j]){
                return false;
            }
        }
        return true;
    }

    public static int Number(String str){
        if(isHw(str)){
            return 0;
        }

        for(int i = 0,j = str.length(); i < j; j--){
            if(isHw(str.substring(i,j))){
                list.add(str.substring(i,j));
                if (j < str.length()){
                    String arr = str.substring(j+1,str.length());
                    Number(arr);
                }
            }
        }
        return list.size() - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(Number(string));

    }

}
