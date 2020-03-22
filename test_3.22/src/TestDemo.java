import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @program:test_3.22
 * @author:Nine_odes
 * @description:
 * @create:2020-03-22 22:19
 **/
public class TestDemo {


    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        System.out.println("strings的大小:" + strings.size());
        System.out.println("strings是否为空：" + strings.isEmpty());

        System.out.println(strings.add("hello"));
        System.out.println(strings.add(" "));
        System.out.println(strings.size());
        System.out.println(strings.remove("hello"));
        System.out.println(strings.size());
        Object[] array = strings.toArray();
        System.out.println(Arrays.toString(array));
        for (String s:strings) {
            System.out.println(s);
        }
    }
    public static void main5(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append(" ");
        stringBuffer.append("world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        System.out.println(stringBuffer.replace(0,1,"the"));
        System.out.println(stringBuffer.delete(0,3));

        StringBuffer sb = new StringBuffer("helloworld");
        System.out.println(sb.delete(5,10).insert(0,"你好"));

    }
    public static void main4(String[] args) {
        //去除字符串两端字符
        String s = "   hello the world   !!!  ";
        System.out.println(s.trim());

        //字符串转大写
        System.out.println(s.toUpperCase());

        //字符串转小写
        String s1 = "HELLO";
        System.out.println(s1.toLowerCase());
        String  s2 = "";
        System.out.println(s2.isEmpty());
    }
    /**
     * 拆分IP地址
     * @param args
     */
    public static void main3(String[] args) {
        String str = "192.168.1.1";
        String[] ret = str.split("\\.");
        for(String s : ret){
            System.out.println(s);
        }
    }
    /**
     * 多次拆分
     * @param args
     */
    public static void main2(String[] args) {
        String s = "name=zhanagsan&age=18";
        String[] str = s.split("&");
        for(int i = 0; i < str.length; i++){
            String[] temp = str[i].split("=");
            System.out.println(temp[0] + " = " + temp[1]);
        }
    }
    public static void main1(String[] args) {
        String s = "hello the world";
        System.out.println(s.contains("hello"));//true
        System.out.println(s.indexOf("the"));
        System.out.println(s.indexOf("the",7));
        System.out.println(s.lastIndexOf("the"));
        String s1 = "&&&hello the world &&++";
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.endsWith("d"));
        System.out.println(s1.replaceAll("hello","HELLO"));
        System.out.println(s1.replaceFirst("l","L"));
        String[] str = s1.split(" ");
        for (String s2: str) {
            System.out.println(s2);
        }
        String[] arr = s1.split(" ",2);
        for (String s2: arr) {
            System.out.println(s2);
        }
    }
}
