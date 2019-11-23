package array;

public class Test {
    public  static  void main(String[] args){
        int[] arr = {1,2,3,4,5};
        doubleArray(arr);
        printArray(arr);
    }

    public  static void doubleArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]*= 2;
        }
    }

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.println(array);
        }
    }
}
