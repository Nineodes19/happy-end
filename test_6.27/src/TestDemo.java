import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @program:test_6.27
 * @author:Nine_odes
 * @description:
 * @create:2020-06-27 23:01
 **/
public class TestDemo {
    public static void main(String[] args) {
        String s = "08:03:45PM";
        String[] s1 = s.split(":");
        String[] ret = new String[s1.length];
        if(s.contains("PM")){
            ret[0] = (Integer.parseInt(s1[0]) + 12)+"";
            for (int i = 1; i < s1.length; i++) {
                if(i == s1.length -1){
                    s1[i] = s1[i].substring(0,2);
                }
                ret[i] = s1[i];

            }
        }else{
            for (int i = 0; i < s1.length; i++) {
                if(i == s1.length -1){
                    s1[i] = s1[i].substring(0,2);
                }
                ret[i] = s1[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if(i < 2){
                System.out.print(ret[i] +":");
            }else{
                System.out.println(ret[i]);
            }
        }
    }
}
