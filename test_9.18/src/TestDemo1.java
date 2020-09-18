/**
 * @program:test_9.18
 * @author:Nine_odes
 * @description:下厨房
 * @create:2020-09-18 09:00
 **/
import java.util.*;
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while(sc.hasNext()){
            String str = sc.nextLine();

            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list.size());
    }
}
