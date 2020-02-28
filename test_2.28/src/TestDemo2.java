import java.util.Arrays;

/**
 * @program:test_2.28
 * @author:Nine_odes
 * @description:
 * @create:2020-02-28 21:00
 **/
public class TestDemo2 {
    public static void main(String[] args) {

        //字符串拆分
        String s = "ab-cd,ef,gh-hi";
        //分割结束之后，会以字符串数组的形式进行组织
        String[] strings = s.split(",");

        for (int i = 0; i < strings.length; i++) {

//            System.out.println(strings[i]);
            String[] strings1 = strings[i].split("-");

//            System.out.println(Arrays.toString(strings1));
            for (int j = 0; j < strings1.length; j++) {
                System.out.println(strings1[j]);
            }
        }
//        System.out.println(Arrays.toString(strings));

//        String s = "ababcabcdabcde";
//        //replaceAll() 全部替换
//        String s1 = s.replaceAll("ab","hh");
//        System.out.println(s1);
//        String s2 = s.replace("ab","30");
//        System.out.println(s2);
//
//        //将第一个子串替换成目标字符串
//        String s3 = s.replaceFirst("bc","oo");
//        System.out.println(s3);

//        String s = "abcdefgcdef";
//
//        boolean flg = s.startsWith("b");//以什么开头
//        System.out.println(flg);
//
//        //代表的是从2号下标判断，是否是以字符串cd开头的
//        boolean s1 = s.startsWith("cd",2);
//        System.out.println(s1);
//
//        boolean s2 = s.endsWith("efg");
//        System.out.println(s2);

//        //判断一个子串或者子集本身是否存在
//        boolean flg = s.contains("defg");
//        System.out.println(flg);
//
//        //indexOf:返回子串第一个字符的位置
//        int index = s.indexOf("cdef");
//        System.out.println(index);

//        int lastIndex = s.lastIndexOf("cdef",6);
//        System.out.println("last " + lastIndex);
    }
}
