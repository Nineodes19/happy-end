/**
 * @program:test_10.13
 * @author:Nine_odes
 * @description:
 * @create:2020-10-13 10:54
 **/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();//取倒数第几位元素
            int k = sc.nextInt();//一共要取几行链表
            int count = 0;
            for(int i = 0; i < k; i++){
                String s = sc.next();
                String[] arr = s.split(",");
                count+=Integer.parseInt(arr[arr.length-2]);
            }
            System.out.println(count);
        }

}
