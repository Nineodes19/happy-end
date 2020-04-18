import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @program:test_4.18
 * @author:Nine_odes
 * @description:
 * @create:2020-04-18 15:19
 **/


//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}
//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}
//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}
//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}

public class TestDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"abcd");
        hashMap.put(2,"degf");
        hashMap.put(3,"hello");
        hashMap.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("key" + integer +" Value :" + s);
            }
        });

        hashMap.forEach(((integer, s) -> {
            System.out.println("key->" + integer + " value->" + s);
        }));
    }

    public static void main3(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bit");
        list.add("abc");
        list.add("gaobohhhh");
        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+" ");
            }
        });*/

        list.forEach(s->System.out.print(s+" "));

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        list.sort((o1, o2) -> {
            return o1.length() - o2.length();
        } );

    }

    public static void main2(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("helllo");
        list.add("world");
        list.add("collection");
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s + " ");
//            }
//        });
        list.forEach(s -> System.out.println(s));
    }


    public static void main1(String[] args) {
        NoParameterNoReturn noParameterNoReturn = ()->{
            System.out.println("无返回值无参数！");
        };
        OneParameterNoReturn oneParameterNoReturn = a -> {
            System.out.println("一个参数唔无返回值" + a);
        };
        oneParameterNoReturn.test(10);

        MoreParameterNoReturn moreParameterNoReturn = (a,b)-> {
            System.out.println("多个参数无返回值" + a + "  "+ b);
        };
        moreParameterNoReturn.test(10,20);

        NoParameterReturn noParameterReturn = () -> {
            System.out.println("无返回值无参数！");
            return 12;
        };



    }
}
