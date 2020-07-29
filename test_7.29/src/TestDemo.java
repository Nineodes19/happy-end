import java.util.Arrays;

/**
 * @program:test_7.29
 * @author:Nine_odes
 * @description:
 * @create:2020-07-29 23:11
 **/
public class TestDemo {
    //稳定
    private static void insertSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            for(;j >=0 && array[j] > v; j--){
                array[j+1] = array[j];
            }
            array[j+1] = v;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,6,3,5,7,2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
