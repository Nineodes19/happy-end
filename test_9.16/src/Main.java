/**
 * @program:test_9.16
 * @author:Nine_odes
 * @description:
 * @create:2020-09-16 19:39
 **/


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine().trim();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < str.length(); i++){
                if(i == 0 && (str.charAt(i) == '-' || str.charAt(i) == '+')){
                    sb.append(str.charAt(i));
                }else if(str.charAt(i)>='0' && str.charAt(i) <='9'){
                    sb.append(str.charAt(i));
                }else{
                    break;
                }
            }
            if(sb.length() == 0  || (sb.length()==1 && sb.charAt(0) == '-')){
                System.out.println(0);
            }else if(sb.length() > 31 && sb.charAt(0) == '-') {
                System.out.println(Integer.MIN_VALUE);
            }else if(sb.charAt(0) != '-' && sb.length() > 32){
                System.out.println(Integer.MAX_VALUE);
            }else{
                if(sb.charAt(0) == '+'){
                    sb.delete(0,1);
                    System.out.println(sb);
                }else{
                    System.out.println(sb);
                }
            }


        }
    }
}
