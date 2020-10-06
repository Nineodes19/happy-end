/**
 * @program:test_10.6
 * @author:Nine_odes
 * @description:
 * @create:2020-10-06 19:41
 **/
public class MyPriorityQueue {
    private int[] array = new int[100];
    private int size = 0;
    public void offer(int e){
        //入队列
        array[size++] = e;
        //将要插入的节点放在堆的最后一位，然后进行向上调整
        shiftUp(size-1);
    }

    public int poll(){
        //出队列
        int oldValue = array[0];//从堆顶开始进行删除
        array[0] = array[--size];
        shiftDown(array,0);
        return oldValue;
    }

    public int peek(){
        return array[0];
    }

    public void shiftDown(int[] array,int parent){
        int child = 2 * parent +1;
        int len = array.length;

        while(child < len){
            if(child +1 < len && array[child +1] < array[child]){
                child += 1;
            }

            if(array[parent] <= array[child]){
                break;
            }else{
                int t = array[parent];
                array[parent] = array[child];
                array[child] = t;

                parent = child;
                child = 2* parent +1;
            }
        }
    }

    public void shiftUp(int child){
        //先找到child的双亲节点
        int parent = (child-1) / 2;
        while(child >0){
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
