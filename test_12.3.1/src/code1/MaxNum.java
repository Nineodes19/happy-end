package code1;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:数组最大值
 * @create:2019-12-03 16:51
 */
public class MaxNum {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        int[] a = new int[ARRAY_SIZE];
        int max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            //给数组进行随机赋值
            a[i] = (int)(Math.random() * 10);
            System.out.print("  "+a[i]);
        }
        System.out.println();
        max = a[0];
        for (int j = 1; j < ARRAY_SIZE; j++) {
            if(a[j] > max){
                max = a[j];
                index = j;
            }
        }
        System.out.println("A["+index+"] has maximun value "+a[index]);
    }
}
