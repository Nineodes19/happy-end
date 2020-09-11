import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @program:test_9.11
 * @author:Nine_odes
 * @description:
 * @create:2020-09-11 14:49
 **/
public class TestDemo1 {
    /*
    给定字符串s，s中的每个字符表示某砖块颜色
    漂亮的：最多存在一对不同颜色的相邻砖块
    实际上是：统计不同字符的个数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set set = new HashSet();
        for(int i = 0; i <str.length();i++){
            set.add(str.substring(i,i+1));
        }
        if(set.size() >= 3){
            System.out.println(0);
        }else{
            System.out.println(set.size());
        }
    }
}
