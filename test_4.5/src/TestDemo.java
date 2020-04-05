import java.util.Comparator;

/**
 * @program:test_4.5
 * @author:Nine_odes
 * @description:
 * @create:2020-04-05 09:36
 **/

class Algorithm<T extends Comparable<T>> {
    public T findMaxNum (T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

}

public class TestDemo {
    public static void main(String[] args) {
        Algorithm<Integer> algorithm = new Algorithm<>();
        Integer[] array = {13,2,5,7,1,89,78};
        int ret = algorithm.findMaxNum(array);
        System.out.println(ret);
    }
}
