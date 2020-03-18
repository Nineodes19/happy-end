package string;

import java.util.Scanner;

/**
 * @program:test_3.18
 * @author:Nine_odes
 * @description:
 * @create:2020-03-18 14:16
 **/
public class Demo1 {





    public static void main(String[] args) {
        byte[] bytes = {'a','b','c','d','e'};
        System.out.println(new String(bytes,1,3));
    }
    public static void main5(String[] args) {
        String s = "helloworld";
        byte[] bytes = s.getBytes();
        for (byte b:bytes) {
            System.out.print(b + " ");
        }
    }

    public static void main4(String[] args) {
        //String s = "239980";
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            char[] ch = s1.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if(ch[i] < '0' || ch[i] > '9') {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }

    }

    public  static boolean isNumber(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] < '0' || ch[i] > '9'){
                return false;
            }
        }
        return true;
    }

    public static void main3(String[] args) {
        String s = "hello Word";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }

    public static void main2(String[] args){
        String s = "helloworld";
        System.out.println(s.charAt(0));
    }
    public static void main1(String[] args) {
        char[] arr = {'q','w','e','r','t'};
        System.out.println(new String(arr,0,3));
    }
}
