package code3;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:continue and break
 * @create:2019-12-22 18:41
 */
public class ContinueAndBreakTest {
    public static void main(String[] args){
        //sum = 3+6+9+12+15+18+...+
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            if(sum > 5000) break;
            if(i % 3 != 0)  continue;
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}

