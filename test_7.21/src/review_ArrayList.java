import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program:test_7.21
 * @author:Nine_odes
 * @description:
 * @create:2020-07-21 15:43
 **/
public class review_ArrayList {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("C语言");
        courses.add("java SE");
        courses.add("java web");
        courses.add("java EE");
        courses.add("C语言");
        System.out.println(courses);
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println(courses.get(3));

        System.out.println("------------------------");
        System.out.println("------------------------");
        //将index位置的list元素进行替换
        courses.set(3,"计算机基础");
        System.out.println(courses);
        System.out.println("------------------------");
        System.out.println("------------------------");
        List<String> list = courses.subList(1,3);
        System.out.println(list);
        System.out.println("------------------------");
        System.out.println("------------------------");
        List<String> list1 = new ArrayList<>(courses);
        List<String> list2 = new ArrayList<>(courses);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("------------------------");
        System.out.println("------------------------");
        ArrayList<String> arrayList = (ArrayList<String>) courses;
        System.out.println(arrayList);


    }
}
