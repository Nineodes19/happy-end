import java.util.Scanner;

/**
 * @program:test_8.1
 * @author:Nine_odes
 * @description: 句子逆序
 * @create:2020-08-01 13:40
 **/
public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        for(int i = arr.length-1; i >=0; i--){
            if(i >0 )
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i]);
        }
    }
}
