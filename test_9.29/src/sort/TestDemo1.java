package sort;

/**
 * @program:test_9.29
 * @author:Nine_odes
 * @description:
 * @create:2020-09-29 18:40
 **/
public class TestDemo1 {
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];//是无序空间的第一个数
            //0~i代表的是有序空间
            int j = i-1;//和有序空间的数比较
            for(; j >= 0&& array[j] > v; j--){
                //当有序空间中j位置的值大于无序空间最后一个值时，
                array[j+1] = array[j];//将j位置的数值往后移一位，给要插入的值让位
            }
            array[j+1] = v;
        }
    }
    public static void bsInsertSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int v = array[i];
            int left = 0;
            int right = i;
            while(left < right){
                int m = (left + right) / 2;
                if(v >= array[m]){
                    left += 1;//区间左边变成右半区间的最左位置
                }else{
                    right = m;
                }
            }

            //这个for循环是在让数组的每一个需要移动的位置往后挪一位
            for (int j = i; j > left ; j--) {
                array[j] = array[j-1];
            }
            //最后再将我们要插入有序区间的无需区间的第一个数值赋给left
            array[left] = v;
        }
    }

    public static void shellSort(int[] array){
        int gap = array.length;
        while(gap > 1){
            insertSort(array,gap);
            gap = (gap /3) + 1;
        }
        insertSort(array,1);
    }
    private static void insertSort(int[] array,int gap){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i - gap;
            for(; j >=0 && array[j] > v; j--){
                array[j+gap] = array[j];
            }
            array[j+gap] = v;
        }
    }

    public static void selectSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int max = 0;//在无序区间寻找最大值
            for(int j = 1; j < array.length-i; j++){
                if(array[j] > max){
                    max = j;
                }
            }
            int t = array[max];
            array[max] = array[array.length-i-1];
            array[array.length-i-1] = t;
        }
    }

    public static void selectSortOP(int[] array){
        int low = 0;
        int high = array.length -1 ;
        while(low <= high){
            int min = low;
            int max = low;
            for (int i = low + 1; i <= max; i++) {
                if(array[i] < array[min]){
                    min = i;
                }
                if(array[i] > array[max]){
                    max = i;
                }
            }
            swap(array,min,low);
            if(max == low){
                max = min;
            }
            swap(array,max,high);
        }
    }
    private static void swap(int[] array,int max,int high){
        int t = array[max];
        array[max] = array[high];
        array[high] = t;
    }

    public static void heapSort(int[] array){
        createHeap(array);
        for(int i = 0; i < array.length-1; i++){
            swap(array,0,array.length-1);

            shiftDown(array,array.length-i-1,0);
        }
    }
    private static void createHeap(int[] array){
        for(int i = (array.length-1)/2; i >= 0; i--){
            shiftDown(array,array.length,i);
        }
    }

    public static void shiftDown(int[] array,int size,int index){
        int left = 2*index +1;
        while(left < size){
            int max = left;
            int right = 2*index +2;
            if(right < size){
                if(array[right] > array[left]){
                    max = right;
                }
            }
            if(array[index] >= array[max]){
                break;
            }
            int t = array[index];
            array[index] = array[max];
            array[max] = t;
            index = max;
            left = 2*index + 1;
        }
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[i+1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
            //一趟结束要是没有排序就意味着数列数有序的
            if(isSorted){
                break;
            }
        }
    }


    private static int partition(int[] array,int left,int right){
        int i = left;
        int j = right;
        int pivot = array[left];//选择的基准值
        while(i < j){
            //从两边开始比较
            while(i < j && array[j] >= pivot){
                j--;
            }
            array[i] = array[j];
        }
        array[j] = array[i];
        return i;
    }
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(int[] array,int left,int right){
        if(left == right){
            return;
        }
        if(left > right){
            return;
        }

        int pivotIndex = partition(array,left,right);
        quickSortInternal(array,left,pivotIndex-1);
        quickSortInternal(array,pivotIndex+1,right);
    }
}
