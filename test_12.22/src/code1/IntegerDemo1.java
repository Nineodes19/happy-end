package code1;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 12:59
 */
public class IntegerDemo1 {
    public static void main(String[] args){

        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println("*************************");
        System.out.println(Integer.toString(100,2));
        System.out.println(Integer.toString(100,8));
        System.out.println(Integer.toString(100,16));
        System.out.println(Integer.toString(100,32));
        System.out.println(Integer.toString(100,36));
        System.out.println("///////////////////////////");
        System.out.println(Integer.parseInt("100",10));
        System.out.println(Integer.parseInt("100",2));
        System.out.println(Integer.parseInt("100",8));

//        String s = "100";
//        Integer ii = new Integer(s);
//        int x = ii.intValue();
//        System.out.println("x:" + x);
//
//        int y = Integer.parseInt(s);
//        System.out.println("y:" + y);

//        int i = 100;
//        Integer ii = new Integer(i);
//        System.out.println("ii:" + ii);
//
//        String s = "100";
//        //Integer iii = new Integer(s);
//        System.out.println("iii:" + s);

//        int number = 100;
//        String s1 = "" + number;
//        System.out.println("s1:" + s1);
//
//        String s2 = String.valueOf(number);
//        System.out.println("s2:" + s2);
//
//        Integer i = new Integer(number);
//        String s3 = i.toString();
//        System.out.println("s3:" + s3);
//
//        String s4 = Integer.toString(number);
//        System.out.println("s4:" + s4);
//        System.out.println("-----------------");
    }
}
