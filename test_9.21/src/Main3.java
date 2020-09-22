import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @program:test_9.21
 * @author:Nine_odes
 * @description:
 * @create:2020-09-21 20:54
 **/
public class Main3 {
    public static ArrayList<Integer> sort (int[] students) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < students.length; i++) {
            set.add(students[i]);
            for (int j = i; j < students.length; j++) {
                if(set.size() != students.length && j == students.length-1){
                    j = 0;
                    set.add(students[j]);
                }
            }
        }
        while(set.size() != 0){

        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        System.out.println(sort(arr));
    }
}
