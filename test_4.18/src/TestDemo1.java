import java.util.ArrayList;
import java.util.List;

/**
 * @program:test_4.18
 * @author:Nine_odes
 * @description:
 * @create:2020-04-19 09:23
 **/
public class TestDemo1 {
    public static int Fibonacci(int n) {
        if (n <= 0 || n > 100_10000) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i < 100_10000; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
            int tempadd = 0;
            int tempsub = 0;
            int N = n;
            if (list.contains(n)) {
                return 0;/////
            }
            while (!list.contains(n)) {
                n++;
                tempadd++;
            }
            int index = list.indexOf(n) - 1;
            tempsub = N - list.get(index);

            return tempadd < tempsub ? tempadd : tempsub;

        }

    public static void main(String[] args) {
        int ret = TestDemo1.Fibonacci(15);
        System.out.println(ret);
    }


}