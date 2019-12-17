/**
 * @program:test_12.17
 * @author: Nine_odes
 * @description:
 * @create:2019-12-17 19:31
 */
public class For_Each {
    public static void main(String[] args) {
        {
            int[] marks = {125,132,95,116,110};
            int hightest_marks = maximum(marks);
            print(marks);
            System.out.println("The highest score is " +hightest_marks);
        }
    }

    public static int maximum(int[] numbers){
        int maxSoFar = numbers[0];
        for (int num:numbers) {
            if(num > maxSoFar){
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }

    public static void print(int[] args){
        for (int num:args) {
            System.out.print(num + "、 ");
        }
        System.out.println();
    }
}
