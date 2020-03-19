/**
 * @program:test_3.19
 * @author:Nine_odes
 * @description:
 * @create:2020-03-19 23:38
 **/
public class Test {
    public static void main(String[] args) {
        String s = "JIUge";
        String s1 = "jiuge";
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        /**
         * 相等：返回0
         * 小于：返回内容小于0
         * 大于：返回内容大于0
         */
        System.out.println(s.compareTo(s1));


        String a = "hello the world";
        System.out.println(a.contains("hello"));
        System.out.println(a.contains("java"));
        System.out.println(a.indexOf("the"));
        System.out.println(a.lastIndexOf("hello",2));
    }
}
