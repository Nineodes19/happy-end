/**
 * @program:test_9.7
 * @author:Nine_odes
 * @description:
 * @create:2020-09-07 10:30
 **/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int n = 101; n<200; n++){
            boolean flag = true;
            for(int m = 2; m < n; m++){
                if(n % m == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.print(n + " ");
            }
        }
    }

}
