package day18;

/**
 * @program:test_6.22
 * @author:Nine_odes
 * @description:
 * @create:2020-06-22 12:30
 **/
public class TestDemo {
    public static void main(String[] args) {
        Integer i1 = 59;
        int i2 = 59;

        //Integer.valueOf() 底层是new了一个新的Integer对象
        Integer i3 = Integer.valueOf(59);
        Integer i4 = new Integer(59);
        System.out.println(i3==i4);
    }
}
