import java.util.LinkedList;
import java.util.List;

/**
 * @program:test_3.17
 * @author:Nine_odes
 * @description:
 * @create:2020-03-17 17:43
 **/
public class code3 {
    public List<Integer> getRow(int rowIndex) {

        if(rowIndex == 0){
            return null;
        }
        List<List<Integer>> rowArr = new LinkedList<>();
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j < rowIndex; j++) {
                if(j == 0 || j == i){
                    rowArr.get(i).add(1);
                }else{
                    rowArr.get(i).add(rowArr.get(i-1).get(j-1)+rowArr.get(i-1).get(j));
                }
            }
        }
        return rowArr.get(rowIndex);
    }
}
