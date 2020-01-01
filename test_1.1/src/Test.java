import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program:test_1.1
 * @author: Nine_odes
 * @description:
 * @create:2020-01-01 23:20
 */
public class Test {
//    public static void main(String[] args) {
//        HashSet<String> hs = new HashSet<String>();
//        hs.add("Marry");
//        hs.add("Tom");
//        hs.add("Jack");
//
//        hs.add("Marry");
//
//        System.out.println("Marry在当前set中：" + hs.contains("Marry"));
//        System.out.println("Linda在当前set中：" + hs.contains("Linda"));
//
//        Iterator<String> it = hs.iterator();
//        System.out.println("当前set包含以下元素：");
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//    }

//    public static void main(String[] args) {
//        TreeSet<String> ts = new TreeSet<String>();
//        ts.add("Marry");
//        ts.add("Tom");
//        ts.add("Jack");
//
//        System.out.println("Marry在当前set中：" + ts.contains("Marry"));
//        System.out.println("Linda在当前set中：" + ts.contains("Linda"));
//
//        Iterator<String> it = ts.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//    }

    public static void main(String[] args) {
        TreeSet<String> ts  = new TreeSet<String>();
        ts.add("B");
        ts.add("C");
        ts.add("A");
        ts.add("F");
        ts.add("E");
        ts.add("G");

        System.out.println("当前set中最低的元素是：" + ts.first());
        System.out.println("当前set中最高的元素是：" + ts.last());
        System.out.println("当前set中大于等于D的元素是：" + ts.ceiling("D"));
        System.out.println("当前set中小于等于D的元素是：" + ts.floor("D"));
    }
}
