import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

/**
 * @program:test_6.26
 * @author:Nine_odes
 * @description:
 * @create:2020-06-26 10:14
 **/
public class LongestString {

    public static int getLongest(String[] str,int n){
        if(str == null || str.length == 0){
            return 0;
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }

        });

        Map<String,Boolean> map = new HashMap<>();
        for (String key:str) {
            map.put(key,true);
        }
        for (String string :str) {
            if(canBulidWord(string,true,map)){
                return string.length();
            }
        }
        return 0;
    }

    private static boolean canBulidWord(String str,boolean isOriginal,Map<String,Boolean> map){
        if(map.containsKey(str) && isOriginal){
            return map.get(str);
        }
        for (int i = 1; i < str.length(); i++) {
            String left = str.substring(0,i);
            String right = str.substring(i);
            if(map.containsKey(left) && map.containsKey(right) && canBulidWord(right,false,map)){
                return true;
            }
        }
        map.put(str,false);
        return false;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"a","b","c","ab","bc","abc"};
        System.out.println(getLongest(s,s.length));
    }
}
