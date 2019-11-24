package method;
import java.lang.String;
import java.util.Arrays;
public class Test {
    public static void main(String[] args){
        int[] arr1 = {1,-2,5,7,3};
        int [] newArr ={12,52,4,15,36,58,45,66,25,1,2,5,3,5};
        System.out.println("数组的最大元素为："+arrMax(arr1));
        System.out.println("数组的最小元素为："+arrMin(arr1));
        System.out.println("数组元素的字符串输出为："+arrStr(arr1));
        int[] arr2 = arrCopy(arr1);
        arr2[3] = 25;
        System.out.println("新数组元素的字符串输出为："+arrStr(arr2));
        int[] arr3 = doubleArr(arr1);
        System.out.println("数组arr1各元素乘2之后为："+arrStr(arr3));
        System.out.println("数组arr1中元素10的下标是："+findIndex(arr1,10));
        System.out.println("判断数组arr1是否为升序数组："+arrIsSorted(arr1));
        bubbleSort(arr1);
        System.out.println("冒泡排序之后arr1的元素为："+arrStr(arr1));
        bubbleSort(newArr);
        System.out.println("冒泡排序之后newArr的元素为:" +arrStr(newArr));
        System.out.println("二分查找寻找index= 58的元素的下标："+binarySearch(newArr,58));
    }

    //冒泡排序
    public static void bubbleSort(int[] array){
        //向后遍历一个数组
        //当i从0开始时，程序得不到输出
        for (int i = 1; i < array.length; i++) {
            //依次比较相邻的数组元素
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] > array[j+1]){
                    //将array[j]和array[j+1]的元素交换
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    //判断一个数组是否为升序数组
    public static boolean arrIsSorted(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[i+1]){
                System.out.println("该数组不是升序数组！");
                return false;
            }
        }
        return true;
    }
    //二分查找（针对已经排列好的升序数组）
    public static int binarySearch(int[] array,int index){
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(index < array[mid]){
                //在左半区间查找
                right = mid - 1;
            }else if(index > array[mid]){
                //在右半区间查找
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //在数组中查找指定值，找到返回其索引，没找到返回-1
    public static int findIndex(int[] array,int index){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == index){
                return i;
            }
        }
        //循环结束之后还没有找到index，则该数组中没有要查找的元素index
        System.out.println("没有找到该元素！");
        return -1;
    }

    //写一个方法找到整形数组的最大值
    public static int arrMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i] >= max){
                max = array[i];
            }
        }
        return max;
    }
    //写一个方法找到整形数组的最小值
    public static int arrMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] <= min){
                min = array[i];
            }else{
                min = min;
            }
        }
        return min;
    }
    //写一个方法，将数组中的每个元素都 * 2 ，不改变原数组
    public static int[] doubleArr(int[] array){
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = 2 * array[i];
        }
        return newArr;
    }
    /**
    写一个方法，打印数组的每个元素
    格式：[值1 ，值2 ，值3 ，。。。]
    */
    public static String arrStr(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                //数组---->String 任意加一个字符串
                str+= array[i] + "]";
            }else{
                str+= array[i]+", ";
            }
        }
        return str;
    }

    //写一个方法，产生一个新的数组，新的数组的内容和原数组相同
    public static int[] arrCopy(int[] array){
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }
}
