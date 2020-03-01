/**
 * @program:test_3.1
 * @author:Nine_odes
 * @description:
 * @create:2020-03-01 11:46
 **/
public class TestDemo {
    /**
     * 1.对String的拼接，在底层被优化为StringBuilder
     * 2.拼接调用的是StringBuilder的append方法
     * 3.拼接结束后，会转为String类型
     * @param args
     */
    public static void main(String[] args) {
//        String s  = "abcdef";
//        s = s + "hello";
//        System.out.println(s);

//        StringBuilder sb = new StringBuilder("abcdef");
//        sb.append("hello");
//        String ret =sb.toString();
//        System.out.println(ret);

        /**
         * 1.String是不可改变的，指的是他所指向的对象不可以改变，String指向拼接成的对象
         * 2.StringB是可变的
         */
//        StringBuilder sb = new StringBuilder("hello");
//        sb.append("world");
//        System.out.println(sb);

//        String s = "";
//        for (int i = 0; i < 10; i++) {
//            s += i;
//        }
//        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());

        /**
         * synchronized保证了线程安全
         */
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("jiuge");
    }
}
