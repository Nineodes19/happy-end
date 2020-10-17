/**
 * @program:test_10.17
 * @author:Nine_odes
 * @description:
 * @create:2020-10-17 20:39
 **/
import javafx.scene.layout.Priority;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        if(count == 0)
            System.out.println(s);

        String string = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                i++;
                while(s.charAt(i) != ')'){
                    s += s.charAt(i);
                    i++;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
    }
}
