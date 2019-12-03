package code1;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:homework
 * @create:2019-12-03 18:11
 */
public class Test {
    static void could_modify(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] *= i;
        }
    }

    static void printarray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printarray(array);
        could_modify(array);
        printarray(array);
    }
}
