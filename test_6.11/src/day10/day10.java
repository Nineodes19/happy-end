package day10;

/**
 * @program:test_6.11
 * @author:Nine_odes
 * @description:
 * @create:2020-06-11 10:27
 **/
public class day10 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a,b);
        System.out.println(a+"," + b);
    }

    private static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y=x;
    }
}
