/**
 * @program:test_9.11
 * @author:Nine_odes
 * @description:
 * @create:2020-09-11 15:29
 **/
import java.util.*;
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            ArrayList<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int min = (n % 2 == 1) ? n-1: n;
            int index = 0;
            while(index < min){
                if((index&1) == 0){
                    list.add(nums[index++]);
                }else{
                    list.add(0,nums[index++]);
                }
            }
            if(min == n){
                for (int i = 0; i < list.size()-1; i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println(list.get(list.size()-1));
            }else{
                list.add(nums[nums.length-1]);
                for (int i = list.size()-1; i > 0; i--) {
                    System.out.print(list.get(i)+" ");
                }
                System.out.println(list.get(0));
            }
        }
    }
}
