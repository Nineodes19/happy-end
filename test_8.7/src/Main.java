/**
 * @program:test_8.7
 * @author:Nine_odes
 * @description:
 * @create:2020-08-07 18:35
 **/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Map<Character,Integer> map = new HashMap<>();
            String[] str = new String[2];//存储两个盒子中的乒乓球字符串
            str = sc.nextLine().split(" ");
            String s = search(str,map);
            System.out.println(s);
        }
    }
    private static String search(String[] str, Map<Character,Integer> map){
        for (int i = 0; i < str[0].length(); i++) {
            if(map.containsKey(str[0].charAt(i))){
                map.put(str[0].charAt(i),map.get(str[0].charAt(i))+1);
            }else
                map.put(str[0].charAt(i),1);
        }

        for (int i = 0; i <str[1].length() ; i++) {
            if(map.containsKey(str[1].charAt(i))){
                map.put(str[1].charAt(i),map.get(str[1].charAt(i))-1);
            }else
                return "No";
        }
        for (int i = 0; i < str[0].length(); i++) {
            if(map.get(str[0].charAt(i)) < 0){
                return "No";
            }
        }
        return "Yes";
    }
}

/*
ABCDFYE CDE
ABCDGEAS CDECDE
 */