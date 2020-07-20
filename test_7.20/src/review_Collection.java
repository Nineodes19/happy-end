import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @program:test_7.20
 * @author:Nine_odes
 * @description:
 * @create:2020-07-20 09:16
 **/
public class review_Collection {
    public static void main(String[] args) {
        //创建集合cDemo
        Collection<String> cDemo = new ArrayList();

        //集合中的元素个数：0
        System.out.println("集合中的元素个数："+ cDemo.size());

        //集合是否为空： true
        System.out.println("集合是否为空： " + cDemo.isEmpty());


        //添加元素
        cDemo.add("Collection");
        cDemo.add("is");
        cDemo.add("nice");

        //集合中是否包含元素‘java’: false
        System.out.println("集合中是否包含元素‘java’: " + cDemo.contains("java"));
        //集合中是否包含元素‘nice’：true
        System.out.println("集合中是否包含元素‘nice’：" + cDemo.contains("nice"));


        //打印集合中的元素
        //集合cDemo中的元素有：[Collection, is, nice]
        System.out.println("集合cDemo中的元素有：" + cDemo);
        for (Object x:cDemo) {
            //Collection、is、nice、
            System.out.print(x + "、");
        }
        System.out.println();


        //删除集合元素Collection
        cDemo.remove("Collection");

        //[is, nice]
        System.out.println(cDemo);

        Collection<String> c = new ArrayList();
        c.add("x");
        c.add("a");
        //在集合指定位置添加元素，其中index为从0开始的集合元素下标
        ((ArrayList) c).add(1,"x");

        //往集合cDemo 中添加一个cDemo集合
        cDemo.addAll(c);

        //添加一个c集合后的cDemo集合元素：[is, nice, x, x, a]
        System.out.println("添加一个c集合后的cDemo集合元素：" +cDemo);


        //cDemo中是否包含c中的所有元素： true
        System.out.println("cDemo中是否包含c中的所有元素： "+cDemo.containsAll(c));

        //是否成功从cDemo中移除c中的所有元素： true
        System.out.println("是否成功从cDemo中移除c中的所有元素： "+cDemo.removeAll(c));

        //清空cDemo中的元素
        cDemo.clear();
        //清空后cDemo的中的元素个数： 0
        System.out.println("清空后cDemo的中的元素个数： "+cDemo.size());

    }
}
