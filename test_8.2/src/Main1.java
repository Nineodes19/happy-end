/**
 * @program:test_8.2
 * @author:Nine_odes
 * @description:
 * @create:2020-08-02 19:46
 **/
import java.util.*;
public class Main1 {

    private static String findMax(String string){

        int temp = 0;
        int max = 0;
        String ret = "";//要返回的字符串
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){
                stringBuilder.append(ch[i]);
                temp++;
            }else{
                temp = 0;
                stringBuilder.delete(0,stringBuilder.length());
            }

            if(max < temp){
                max = temp;
                ret = stringBuilder.toString();
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findMax(s);
    }
}
