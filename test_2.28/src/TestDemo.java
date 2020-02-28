import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @program:test_2.28
 * @author:Nine_odes
 * @description:
 * @create:2020-02-28 18:40
 **/
public class TestDemo {

    public static boolean func(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, UnsupportedEncodingException {

        String s1 = "abcdef";
        String s2 = "AbCdef";
        //代表s1和s2 比较
        /**
         * 代表：s1和s2比较
         * 比较的方式：找到第一个不相同的字符，进行比较
         * 1、正数  s1 > s2
         * 2、负数  s1 < s2
         * 3、0     s1 = s2
         */
        System.out.println(s1.compareTo(s2));

        //1a23456
//        String s = "1a23456";
//        System.out.println(func(s));

//        byte[] bytes = {97,98,99,100};
//        String s = new String(bytes);
//        System.out.println(s);
//
//        String s1 = "hello";
//        System.out.println(s1);
//        byte[] bytes1 = s.getBytes();
//        System.out.println(Arrays.toString(bytes1));
//
//        String s2 = "九歌";
//        System.out.println(s2);
//        byte[] bytes2 = s2.getBytes("utf-8");
//        System.out.println(Arrays.toString(bytes2));

//        String s1 = "hello";
//        //charAt:取字符
//        char ch = s1.charAt(1);
//        System.out.println("ch = " + ch);
//
//        //toCharArray() 将字符串变成字符数组
//        char[] chars = s1.toCharArray();
//        System.out.println(chars);
//        System.out.println(Arrays.toString(chars));
//
//        char[] chars1 = {'a','b','c','d','e'};
//        System.out.println("chars1:" + chars1);

//        char[] value = {'a','b','c'};
//        //String s = new String(value,1,2);
//        String s = new String(value);
//        System.out.println(s);

//        String str = "hrllo";
//        for (int i = 0; i < 1000; i++) {
//            str += i;
//        }
//        System.out.println(str);
        //不建议这样的代码出现-->会产生大量的临时对象

//        String str = new String("Hello");
//        //1.拿到该类的Class对象：类信息
//        Class cl = String.class;
//        //获得这个属性
//        Field field = cl.getDeclaredField("value");
//        //只有设置为true的时候，才能修改该属性的值
//        field.setAccessible(true);
//
//        char[] val = (char[])(field.get(str));
//        System.out.println(val);//Hello  H   e  l  l  o
//        val[0] = 'g';
//        System.out.println(val);
//       String str = "Hello";
//       str = "h" + str.substring(1);
//
//       System.out.println(str);

//        String str = "hello";
//        str = str + " world";
//        str +="!!!";
//        System.out.println(str);

        //        int a = 10;
//        int b = 20;
//        System.out.println(a == b);//==逻辑判断

        //字符串是引用类型
//        String s1 = "hello";
//        String s2 = new String("hello");
//
//        //s1 = null;
//        System.out.println(s1.equals(s2));//null.equals()不能实现，引用之前不能为空
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals("hello"));
//        System.out.println("hello".equals(s1));
        //System.out.println(s1 == s2);//比较引用值
//        String str1 = "hello";//在常量池中
//        String str2 = str1;//str2指向str1指向的常量池中的hello
//        str1 = "world";//常量池中
//        System.out.println(str1);
//        System.out.println(str2);
    }
}
