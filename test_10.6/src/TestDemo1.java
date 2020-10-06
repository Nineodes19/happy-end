/**
 * @program:test_10.6
 * @author:Nine_odes
 * @description:
 * @create:2020-10-06 19:21
 **/
public class TestDemo1 {

    //堆的创建
    public static void createHeap(int[] array){
        //root代表最后一个非叶子结点，具体位置是堆倒数第二行的最后一个节点
        int root = ((array.length - 2))/2;
        for(; root >= 0; root--){
            shiftDown(array,root);
        }
    }
    public static void shiftDown(int[] array,int parent){
        //array是当前堆的层序存储数组
        //parent是要调整的节点
        int child = 2*parent + 1;
        int size = array.length;
        while(child < size){
            if(child + 1 < size && array[child+1] < array[child]){
                //右孩子存在并且右孩子是孩子节点较小值
                child += 1;
            }
            //此时判断孩子节点最小值和父节点的大小
            if(array[parent] <= array[child]){
                break;
            }else{
                //此时需要交换
                int t = array[parent];
                array[parent] = array[child];
                array[child] = t;

                //交换完成后继续向下调整
                parent = child;
                child = 2 *parent +1;
            }

        }
    }

    public void shifrDown(int[] array,int parent){
        int child = parent * 2 + 1;//先将孩子节点定位到parent的左孩子
        int size = array.length;

        while (child < size){
            //此时代表还没有交换到最后一个节点
            if(child + 1 < size && array[child + 1] < array[child]){
                //存在右孩子并且右孩子的值小于左孩子的值
                //将child直接定位到parent的右孩子
                child += 1;
            }
            if(array[parent] <= array[child]){
                //此时父节点小于等于孩子节点的最小值，直接跳出
                break;
            }else {
                //将父亲节点和较小的孩子节点交换
                int t = array[parent];
                array[parent] = array[child];
                array[child] = t;

                //交换完成之后将parent继续向下移动，继续进行对子树的调整
                parent = child;//交换的是较小的孩子，直接将parent定位到交换后的孩子节点位置即可

                child = parent * 2 + 1;//parent的左孩子
            }

        }
    }
}
