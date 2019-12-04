package code;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 13:41
 */
public class For_Each {

    public static void main(String[] args) {
        {
            int[] marks = {125,132,95,116,110};

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }

    public static int maximum(int[] numbers) {
        int maxSoFar = numbers[0];
        for(int num : numbers) {
            if(num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
