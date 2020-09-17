/**
 * @program:test_9.17
 * @author:Nine_odes
 * @description:
 * @create:2020-09-17 19:27
 **/

import java.util.*;
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() > 2000){
            return;
        }
        String[] line = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            list = Str(line[i]);
            for (int j = 0; j < list.size(); j++) {
                int year = Integer.parseInt(list.get(j));
                if(year>=1000 && year <=3999){
                    System.out.print(year + " ");
                }
            }

        }
    }
    private static ArrayList<String> Str(String s){
        ArrayList<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if(sb.length() <= 4 && Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                list.add(sb.toString());
                sb.delete(0,sb.length());
            }
        }
        return list;
    }
}
