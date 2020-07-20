/**
 * @program:test_7.20
 * @author:Nine_odes
 * @description:
 * @create:2020-07-20 16:22
 **/
import java.util.*;
public class TestDemo1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            int last = list.get(list.size()-1);
            System.out.println(last);
            list.remove(list.size()-1);
            for(int a:list){
                System.out.print(a+" ");
            }
        }
    }
}
