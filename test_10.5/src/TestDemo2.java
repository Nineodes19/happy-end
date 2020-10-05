/**
 * @program:test_10.5
 * @author:Nine_odes
 * @description:
 * @create:2020-10-05 19:54
 **/
public class TestDemo2 {

    public static void shiftDown(int[] array,int parent){
        int child = 2 * parent + 1;//先标记parent的左孩子，因为没有左孩子就没有右孩子
        int size = array.length;
        while(child < size){
            if(child + 1 < size && array[child+1] < array[child]){
                child +=1;//右孩子存在并且右孩子小于左孩子，用child+1标记
            }
            if(array[parent] <= array[child]){
                break;
            }else {
                //将双亲与最小的孩子节点交换
                int t = array[parent];
                array[parent]= array[child];
                array[child] = t;

                //父亲节点中大的元素向下移动，可能造成子树不满足堆的性质，继续向下调整
                parent = child;//继续下移
                child = 2 * parent +1;
            }

        }
    }
    public static void createHeap(int[] array){
        int root = ((array.length-2) >>1);
        for(; root >= 0; root--){
            shiftDown(array,root);
        }
    }

    public static void shiftUp(int[] array,int child){
        int parent = (child -1) /2;
        while(child > 0){
            if(array[parent] > array[child]){
                break;
            }else{
                int t = array[parent];
                array[parent] = array[child];
                array[child] = t;
                child = parent;
                parent = (child - 1) /2;
            }
        }
    }
}
