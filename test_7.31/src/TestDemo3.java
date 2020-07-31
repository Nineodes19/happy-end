import java.util.Arrays;

/**
 * @program:test_7.31
 * @author:Nine_odes
 * @description:
 * @create:2020-07-31 13:05
 **/
public class TestDemo3 {

    private static void merge(int[] array,int low,int mid,int high){
        int i = low;
        int j = mid;
        int length = high - low;
        int[] extra = new int[length];
        int k = 0;
        while(i < mid && j < high){
            if(array[i] <= array[j]){
                extra[k++] = array[i++];
            }else{
                extra[k++] = array[j++];
            }
        }
        while( i < mid){
            extra[k++] = array[i++];
        }
        while(j < high){
            extra[k++] = array[j++];
        }
        for(int t = 0 ; t < length; t++){
            array[low + t] = extra[t];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,5,4,9,3,8,7,2,1};

        System.out.println(Arrays.toString(arr));

    }
}
