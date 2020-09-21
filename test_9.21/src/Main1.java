/**
 * @program:test_9.21
 * @author:Nine_odes
 * @description:
 * @create:2020-09-21 20:21
 **/
import java.util.*;
public class Main1 {

    public static void main(String[] args) {
        System.out.println(getABA(88));
    }
    public static int getABA (int number) {
        // write code here
        //得到最相近的ABA型整数
        String add = numberadd(number);
        String sub = numbersub(number);
        if(Integer.parseInt(add)-number < number - Integer.parseInt(sub)){
            return Integer.parseInt(add);
        }else{
            return Integer.parseInt(sub);
        }

    }

    private static boolean iswh(String number){
        for (int i = 0,j = number.length()-1; i < j; i++,j--) {
            if(number.charAt(i) != number.charAt(j)){
                return false;
            }
        }
        return true;
    }

    private static String numberadd(int s){
        s++;
        while(!iswh(Integer.toString(s))){
            s++;
        }
        return Integer.toString(s);
    }
    private static String numbersub(int s){
        s--;
        while(!iswh(Integer.toString(s))){
            s--;
        }
        return Integer.toString(s);
    }
}

