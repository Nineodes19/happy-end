import java.util.Scanner;

/**
 * @program:test_7.21
 * @author:Nine_odes
 * @description:
 * @create:2020-07-21 12:25
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
