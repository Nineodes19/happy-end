import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @program:test_12.31
 * @author: Nine_odes
 * @description:
 * @create:2019-12-31 23:01
 */
public class test {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        list.add("Tom");
//        list.add("Bob");
//        list.add("Jack");
//
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);
//        }
//    }

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Hello");
//        list.add("Java");
//        list.add("World");
//        for (int i = 0; i < list.size(); i++) {
//            String s = (String) list.get(i);
//            System.out.println(s);
//        }
//
//    }

//    public static void main(String[] args) {
//        Collection<String> c = new ArrayList<String>();
//        c.add("Hello");
//        c.add("Java");
//        c.add("World");
//
//        Iterator<String> it = c.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }
//    }

//    public static void main(String[] args) {
//
//        Collection<String> c = new ArrayList<String>();
//        c.add("Hello");
//        c.add("Java");
//        c.add("World");
//        for(String s : c){
//            System.out.println(s);
//        }
//
//        int[] arr = {1,2,3,4,5};
//        for(int a : arr){
//            System.out.println(a);
//        }
//    }

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        System.out.println(list);
//        list.add("Java");
//        System.out.println(list);
//    }

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("hello");
//        list.add("world");
//        list.add("leslie");
//        System.out.println(list);
////        list.add(1,"Java");
////        System.out.println(list);
//        list.set(1,"java");
//        System.out.println(list);
//
//    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("leslie");
	list.add("java");
        System.out.println(list);
        List<String> list_ad = new ArrayList<String>();
        list_ad.add("are you ok ?");
        System.out.println("添加是否成功？"+ list_ad.addAll(list));
        for(int i = 0; i < list_ad.size(); i++){
            System.out.println(i + ":" + list_ad.get(i));
        }
    }
}
