package day17;

/**
 * @program:test_6.21
 * @author:Nine_odes
 * @description:
 * @create:2020-06-21 15:42
 **/
class X{
    Y y = new Y();
    public X(){
        System.out.println("X");
    }
}
class Y{
    public Y(){
        System.out.println("Y");
    }
}
public class Z extends X {
    Y y = new Y();
    public Z(){
        System.out.println("Z");
    }

    public static void main1(String[] args) {
        new Z();
    }

    static boolean Paddy;
    public static void main2(String[] args) {
        System.out.println(Paddy);
    }
    public String name = "abx";

    public static void main(String[] args) {
        Z z = new Z();
        Z z1 = new Z();

        System.out.println(z.equals(z1) + "," + z.name.equals(z1.name));
    }
}
