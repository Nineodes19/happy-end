/**
 * @program:test_9.12
 * @author:Nine_odes
 * @description:
 * @create:2020-09-12 15:31
 **/

//
import java.util.*;
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = new String[3];
            for (int i = 0; i < 3; i++) {
                s[i] = sc.nextLine();
            }
            //String[] code = s[0].split(" ");
            String[] SA = s[1].split(" ");
            String[] SB = s[2].split(" ");

            if(SA.length==0){
                System.out.println(SB.length-SA.length);
                return;
            }
            ArrayList<String> list = new ArrayList<>();

            for(int i = 0; i < SB.length; i++){
                if(!s[0].contains(SB[i])){
                    list.add(SB[i]);
                }
            }


            System.out.println(count(SA, list));
        }
    }
    private static int count(String s1[],ArrayList<String> list){
        int count = 0;
        for (int i = 0; i < s1.length && i<list.size();i++){
            if(!list.contains(s1)){
                count++;
            }
        }
        if(s1.length < list.size()){
            count = list.size()-count;
        }
        return count;
    }
}
