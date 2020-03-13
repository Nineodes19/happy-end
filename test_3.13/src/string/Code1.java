package string;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @program:test_3.13
 * @author:Nine_odes
 * @description:
 * @create:2020-03-13 11:01
 **/
public class Code1 {


    public static void main(String[] args) {
        //泛型

    }

    /**
     * 创建字符串
     * @param args
     */
    public static void main1(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "hello world!";
        String str1 = new String("hello jiuge!");
        char[] arr = {'a','b','c'};
        System.out.println(str);
        System.out.println(str1);
        System.out.println(arr);
        System.out.println("================");
        String str2 = "Hello";
        String str3 = str2;
        str2 = "world";
        System.out.println(str2+"\n" + str3);

        String s = "hello";
        s = s + "world";
        s += "!!!";//改变的是s指向的对象
        System.out.println(s);

        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] value = (char[])valueField.get(s);
        value[0] = 'h';
        System.out.println(s);

        System.out.println("~~~~~~~~~~~~~~~~~~~``");
        char[] a = {'a','b','c','d'};
        System.out.println(new String(a));
        System.out.println(new String(a,2,3));
        String b = "hello";
        System.out.println(b.charAt(0));
    }
}
