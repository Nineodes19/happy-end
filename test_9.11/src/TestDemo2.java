/**
 * @program:test_9.11
 * @author:Nine_odes
 * @description:
 * @create:2020-09-11 14:56
 **/
import java.util.*;
public class TestDemo2 {
    public static void main(String[] args) {
        /*
        1 2
        2 1 3
        3 1 2 4
        4 2 1 3
         */
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String line = sc.nextLine();
        String[] s = line.split(" ");
        if(Integer.parseInt(num) % 2 == 0){
            int preindex = 0,lastindex = s.length-1;
            while(lastindex % 2 == 1 &&lastindex>-1){
                if(lastindex == 1){
                    System.out.print(s[lastindex]);
                }else{
                    System.out.print(s[lastindex] + " ");
                }
                lastindex -= 2;
            }
            System.out.print(" ");
            while(preindex % 2 == 0 && preindex < s.length){
                if(preindex == s.length-1 || preindex == s.length-2){
                    System.out.print(s[preindex]);
                }else{
                    System.out.print(s[preindex] + " ");
                }
                preindex+=2;
            }
        }else{
            int preindex = 1,lastindex = s.length-1;
            while(lastindex %2 == 0 && lastindex > -1){
                if(lastindex == 0){
                    System.out.print(s[lastindex]);
                }else{
                    System.out.print(s[lastindex] + " ");
                }
                lastindex -= 2;
            }
            System.out.print(" ");
            while(preindex %2 == 1 && preindex < s.length){
                if(preindex == s.length-1 || preindex == s.length-2){
                    System.out.print(s[preindex]);
                }else{
                    System.out.print(s[preindex] + " ");
                }
                preindex -=2;
            }
        }
    }
}
