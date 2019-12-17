import java.util.Scanner;

/**
 * @program:test_12.17
 * @author: Nine_odes
 * @description:一到1000之内3的倍数之和大于5000时输出
 * @create:2019-12-17 18:11
 */
public class ContinueAndBreakTest {
    public static void main(String[] args){
        int sum = 0;
//        Scanner cin = new Scanner(System.in);
//        String s = cin.next();
//        System.out.println(s);
        for(int i = 1; i < 1000; i++){
            if(sum > 5000){
                break;
            }
            if(i % 3 != 0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
