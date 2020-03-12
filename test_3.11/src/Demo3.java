import java.util.ArrayList;
import java.util.List;

/**
 * @program:test_3.11
 * @author:Nine_odes
 * @description:
 * @create:2020-03-11 20:14
 **/
public class Demo3 {


    public static void main2(String[] args) {
        String s1 = "welcome to bit";
        String s2 = "come";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char tmp = s1.charAt(i);
            if(!s2.contains(tmp+"")){
                list.add(tmp);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }

    public static void main1(String[] args) {
        String s1 = "welcome to bit";
        String s2 = "come";
        StringBuffer s3 = new StringBuffer();
        for (int i = 0,j; i < s1.length(); i++) {
            for (j = 0; j < s2.length(); j++) {
                if(s1.charAt(i)==s2.charAt(j)){
                    break;
                }
            }
            if(j == s2.length()){
                s3.append(s1.charAt(i));
            }
        }
        System.out.println(s3);
    }
}
