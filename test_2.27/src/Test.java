import java.sql.SQLOutput;

/**
 * @program:test_2.27
 * @author:Nine_odes
 * @description:
 * @create:2020-02-27 19:15
 **/
public class Test {
    public static void main(String[] args) {
        String s1 = new String("abcde").intern();
        String s2 = "abcde";
        System.out.println(s1 == s2);//true
//        String s1 = new String("abcde");
//        String s2 = "abcde";
//        System.out.println(s1 == s2);//false
//        String s1 = new String("abcdef");
//        System.out.println(s1.equals("abcdef"));//true
//        System.out.println("abcdef".equals(s1));//true 推荐
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        System.out.println(s1 == s2);//false
//        System.out.println(s1.equals(s2));//true
//        //构造String的方式
//        String str = "Hello";
//        String str1 = new String("Hello");
//        char[] array = {'a','b','c'};
//        String str2 = new String(array);

//        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2);//true


    }
}
