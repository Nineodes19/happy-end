import java.util.Arrays;

/**
 * @program:test_3.29
 * @author:Nine_odes
 * @description:
 * @create:2020-03-29 11:24
 **/
public class TestDemo {

    /**
     * 时间复杂度：最坏，最好-->O（n^2）
     * 空间复杂度：O（1）
     * 稳定性：稳定
     * @param array
     */
    public static void bubbleSort(int[] array){
        boolean flg = false;
        for(int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length - i -1; j++) {
                if(array[j] >= array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flg = true;
                }
            }
            if(flg == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,6,9,13,15,2,6,7,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
