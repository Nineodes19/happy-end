import java.util.Scanner;

/**
 * @program:test_9.13
 * @author:Nine_odes
 * @description:
 * @create:2020-09-13 19:36
 **/

/*
n个节点数，m条边（路线）
 */
import java.util.*;
public class TestDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(n);
        System.out.println(s);
    }
    public static void main1(String[] args) {
        String s = "? 、";
//        StringBuffer sb = new StringBuffer(s);
//        //sb.append("?").append(" ").append("、");
//        System.out.println(sb);

//        char[] ch = s.toCharArray();
//        System.out.println("、"+s.charAt(1) + "、");
        Stack<Character> stack = new Stack<>();
        stack.push('1');
        stack.push(' ');
        stack.push('2');
        System.out.println(stack);
    }
}
