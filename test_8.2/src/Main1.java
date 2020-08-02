/**
 * @program:test_8.2
 * @author:Nine_odes
 * @description:
 * @create:2020-08-02 19:46
 **/
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer s = new StringBuffer("");
        int count = 0,max = Integer.MIN_VALUE;
        Map<Integer,StringBuffer> map = new HashMap<>();
        List<StringBuffer> list = new ArrayList<>();
        for(int i = 0; i < str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
                s.append(str.charAt(i));
            }else{
                map.put(count,s);
                if(count > max){

                    max = count;
                    count = 0;
                    s.delete(0,s.length());
                }

            }
        }
        for(Map.Entry<Integer,StringBuffer> entry : map.entrySet()){
            if(entry.getKey()==max){
                System.out.println(entry.getValue());
            }
//            System.out.println(entry.getKey() + ":"+entry.getValue());
        }

    }
}
