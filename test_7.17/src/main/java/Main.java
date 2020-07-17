import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program:test_717
 * @author:Nine_odes
 * @description:
 * @create:2020-07-17 12:51
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int x = sc.nextInt();
            if(list.contains(x)){
                System.out.println(list.indexOf(x));
            }else {
                System.out.println("-1");
            }
        }
    }
}
