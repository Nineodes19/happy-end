import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_3.1
 * @author:Nine_odes
 * @description:
 * @create:2020-03-01 09:11
 **/
public class Test {

    public static void main(String[] args) {
        String s  = "abcdef";
        s = s + "hello";
        System.out.println(s);
    }

//    1.把当前的字符串转化为数组
//2.逆置整个字符数组
//3.将数组转化为字符串
    public static String reverse(String str,int left,int right){
        char[] s = str.toCharArray();
        while(left < right){
            char ch = s[left];
            s[left] =s[right];
            s[right] = ch;
            left ++;
            right--;
        }
        return new String(s);
        //return String.copyValueOf(s);//将数组变为字符串
    }
    public static void main6(String[] args) {
        String s = "abcdef";
        String ret = reverse(s,0,s.length()-1);
        System.out.println(ret);
    }
    public static void main5(String[] args) {
        String str ="    ab  cd    ef  ";
        String ret = str.trim();
        System.out.println(ret);
        String str2 = "abcdDEf23哈哈";

        //将字符串中的字母改为大写
        ret = str2.toUpperCase();
        System.out.println("toUpperCase:" + ret);

        ret = str2.toLowerCase();
        System.out.println("toLowerCase:" + ret);

        ret = str2.concat("jiuge");
        System.out.println("concat:" + ret);

        /**
         * 面试问题：数组有长度 字符串有长度  使用区别
         *             属性        方法
         */
        int[] array = {1,2,3,4,5};
        int len = array.length;//属性
        int len2 = str2.length();//方法

        /**
         * 空串    空的区别
         */
        String s1 = "";
        String s2 = null;//空，没有方法
        boolean flg = s1.isEmpty();
        System.out.println(flg);
    }
    public static void main4(String[] args) {
        String s = "helloworld";

        //substring()从参数位置开始提取子串，提取的长度是一直到字符串的结尾
        String ret = s.substring(1);
        System.out.println(ret);

        //一般来说，在源码中看到[beginIndex,endIndex) 左闭右开，可能会越界
        String ret2 = s.substring(1,3);
        System.out.println(ret2);
    }

    public static String func(String str){
        String[] ss = str.split(" ");
        String ret = "";//StringBffer    StringBuilder
        for (String s:ss){
            ret+=s;
        }
        return ret;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ret = func(str);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String strings = s.replaceAll(" ","");
        System.out.println(strings);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        for (String strings1:strings) {
            System.out.print(strings1);
        }
    }
}
