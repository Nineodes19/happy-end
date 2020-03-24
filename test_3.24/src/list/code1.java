package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:test_3.24
 * @author:Nine_odes
 * @description:
 * @create:2020-03-24 12:26
 **/
public class code1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("arr第1号位置的元素是："+arr.get(1));

    }

    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("String");
        list.add("List");
        list.add("string");
        list.add(0,"happy");

        System.out.println(list);

        list.remove(0);
        System.out.println(list.remove("happy"));
        System.out.println("删除list的第一个元素之后"+list);
//        list.clear();
//        System.out.println(list.size());
    }
}
