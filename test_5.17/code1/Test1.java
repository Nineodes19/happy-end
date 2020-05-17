package code1;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:装箱与拆箱
 * @create:2019-12-22 12:48
 */
public class Test1 {
    public static void main(String[] args){
        int t1 = 2;
        Integer t2 = t1;
        System.out.println(t2);
        Integer t3 = new Integer(10);
        System.out.println(t3);
        System.out.println(t2.toString());
        int t4 = t2;
        System.out.println(t4);
        int t5 = t2.intValue();
        System.out.println(t5);
    }
}
