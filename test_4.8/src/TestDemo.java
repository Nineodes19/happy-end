import java.util.HashSet;
import java.util.Set;

/**
 * @program:test_4.8
 * @author:Nine_odes
 * @description:
 * @create:2020-04-08 16:15
 **/
public class TestDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(9);
        set.add(15);
        set.add(11);
        System.out.println(set.contains(0));
        System.out.println(set.contains(11));
        System.out.println(set.remove(10));
    }
}
