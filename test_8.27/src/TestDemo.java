/**
 * @program:test_8.27
 * @author:Nine_odes
 * @description:
 * @create:2020-08-27 23:49
 **/
public class TestDemo {
    public void shiftDown(int[] array,int parent){
        int child = 2 * parent + 1;
        int size = array.length;
        while(child < size){
            if(child + 1 < size && array[child + 1] < array[child]){
                child += 1;
            }
            if(array[parent] <= array[child]){
                break;
            }else{
                int t = array[parent];
                array[parent] = array[child];
                array[child] = t;

                parent = child;
                child = parent * 2 + 1;
            }
        }
    }
}
