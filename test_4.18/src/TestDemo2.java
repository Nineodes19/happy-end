import java.util.HashSet;
import java.util.Set;

/**
 * @program:test_4.18
 * @author:Nine_odes
 * @description:
 * @create:2020-04-19 10:03
 **/
public class TestDemo2 {
    public static int Main(String array){
        Set<String> set = new HashSet<>();
        String[] s = array.split(" ");
        for (int i = 0; i < s.length; i++) {
            set.add(s[i]);
        }
        return set.size();
    }
}
