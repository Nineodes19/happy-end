import java.util.ArrayList;

/**
 * @program:test_8.18
 * @author:Nine_odes
 * @description:集合栈
 * @create:2020-08-18 21:44
 **/
public class TestDemo2 {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> curArray  = new ArrayList<>();
        list.add(curArray);
        for (int i = 0; i < ope.length; i++) {
            switch (ope[i][0]){
                //Push操作
                case 1:
                    if(curArray.size() != size){
                        //未满
                        curArray.add(ope[i][1]);
                    }else{
                        //已满
                        curArray = new ArrayList<>(size);
                        list.add(curArray);
                        curArray.add(ope[i][1]);
                    }
                    break;
                //出栈pop
                case 2:
                    if(curArray.size() != 0){
                        curArray.remove(curArray.size()-1);
                    }else{
                        list.remove(list.size()-1);
                        curArray = list.get(list.size()-1);
                        curArray.remove(curArray.size()-1);
                    }
                    break;

            }

        }
        return list;
    }
}
