/**
 * @program:test_9.19
 * @author:Nine_odes
 * @description:
 * @create:2020-09-20 20:23
 **/

import java.util.*;
public class TestDemo1 {
    //第一行字符串代表拥有的颜料，
    // 第二行字符串代表要涂色块的颜色
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Map<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                if(map.containsKey(s1.charAt(i))){
                    map.put(s1.charAt(i),map.get(s1.charAt(i)) +1);
                }else{
                    map.put(s1.charAt(i),1);
                }
            }
            System.out.println(map);
            int count = 0;
            for (int i = 0; i < s2.length(); i++) {
                if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i)) != 0){
                    map.put(s2.charAt(i),map.get(s2.charAt(i)) -1);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
