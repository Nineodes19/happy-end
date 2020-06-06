package review3_13;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:test_6.6
 * @author:Nine_odes
 * @description:
 * @create:2020-06-06 10:44
 **/
public class TestDemo1 {
    public static List<List<Integer>> generate(int numbers){
        List<List<Integer>> ret = new ArrayList<>();
        if(numbers == 0){
            return ret;
        }
        ret.add(new ArrayList<>());
        ret.get(0).add(1);
        for (int i = 1; i < numbers; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            //拿到前一行的
            List<Integer> prevRow = ret.get(i-1);
            for (int j = 1; j < i; j++) {
                //公式
                curRow.add(prevRow.get(j) + prevRow.get(j-1));
            }
            curRow.add(1);
            ret.add(curRow);
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(generate(4));
    }
}
