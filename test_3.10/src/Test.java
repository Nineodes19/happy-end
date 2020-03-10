import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program:test_3.10
 * @author:Nine_odes
 * @description:
 * @create:2020-03-10 19:06
 **/

class Person{
    private String name;
    private int age;
    private static int count = 100;
    {
        //构造代码块、实例代码块
        this.name = "zoumeng";
        this.age = 90;
    }

    //在静态代码块中不能访问实例成员变量
    static {
//        this.name = "jiuge";//静态的东西 属于类  不属于对象
//        this.age = 90;
        count = 9999;//static
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Test {

    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("jiuge");
        list.add(0,"hello");
        System.out.println(list);

        List<String>list1 = new LinkedList<>();
        list1.add("jigue");
        list1.add("cool0");
        list.addAll(list1);
        System.out.println(list);
//        List<Integer> list1 =new LinkedList<>();

    }

    /**
     * 在-128到127之间的数字，在第一次存储的时候，会缓存到一个叫做cache的数组当中
     * 当第二次去拿的时候，拿到的就是缓存里面的数据
     * 但是不在上面的区间的时候，会每次产生新的对象
     * @param args
     */
    public static void main5(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
    }

    public static void main4(String[] args) {
        Integer i = 10;
        int a = i;//自动拆包,拆成int
        System.out.println(a);
        long b = i.longValue();//拆成long了
        double d = i.doubleValue();
        System.out.println(b + " " + d);
    }

    /**
     * 装箱（装包）:简单类型变为包装类类型
     * 拆箱（拆包）：将包装类类型变为简单类型
     * @param args
     */
    public static void main3(String[] args) {
        Integer a = 10;//将一个int类型给他的包装类类型【自动装箱】
        System.out.println(a);

        Integer b = Integer.valueOf(10);//显示装包
//        Integer b = new Integer(10);//显示装包

    }
    public static void main2(String[] args) {
        MyArrayList<String> myArrayList3 = new MyArrayList<>();
        System.out.println(myArrayList3);

        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
        System.out.println(myArrayList1);

        MyArrayList<Person> myArrayList2 = new MyArrayList<>();
        System.out.println(myArrayList2);
    }

    public static void main1(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.insert("jiuge");
//        myArrayList.insert(2);
//        myArrayList.insert(3);
//        myArrayList.insert(2.3);


        String ret =(String) myArrayList.getPos(0);

        System.out.println(ret);
    }
}
