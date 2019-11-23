import javax.xml.bind.SchemaOutputResolver;

public class Test_11_23 {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] newArr = {10,3,43,54,67,34,6};
        System.out.println(arrStr(arr));
        doubleArray(arr);
        boolean ret = arrIsSorted(newArr);
        System.out.println(ret);
        bubbleSort(newArr);
        System.out.println(arrStr(newArr));
        System.out.println(findElement(newArr,54));
    }

    //二分查找
    public static int binarySearch(int[] arr,int data){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            count ++;
            int mid = (left + right)/2;
            if(arr[mid] > data){
                //在左半区间查找
                right = mid - 1;
            }else if(arr[mid] < data){
                //在右半区间查找
                left = mid + 1;
            }else{
                //mid就是所找元素的下标
                return mid;
            }
        }
        return -1;
    }
    //在一个数组中查找指定值，找到返回其索引，没找到返回-1
    public static int findElement(int[] arr,int data){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr){
        //向后遍历一遍数组
        for (int i = 1; i < arr.length; i++) {
            //依次比较相邻的两个元素
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]){
                    //交换arr[j]和arr[j+1]的元素
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //判断一个数组是否为有序数组
    public static boolean arrIsSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                System.out.println("不是升序数组");
                return false;
            }
        }
        return true;
    }

    //写一个方法，将数组中的每个元素都* 2，不改变原数组
    public static void doubleArray(int[] array){
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i] * 2;
        }
        //输出数组元素
        System.out.println(arrStr(newArr));
    }

    //写一个方法，打印数组的每个元素
    public static String arrStr(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                str += array[i]+"]";
            }else{
                str += array[i] +", ";
            }
        }
        return str;
    }

    //写一个方法，产生一个新的数组，新的数组的内容和原数组相同
    public static int[] arrCopy(int[] sourseArr){
        int[] newArr = new int[sourseArr.length];
        for (int i = 0; i < sourseArr.length; i++) {
            newArr[i] = sourseArr[i];
        }
        return newArr;
    }

}
