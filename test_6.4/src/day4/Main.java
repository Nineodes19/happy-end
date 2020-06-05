package day4;

/**
 * @program:test_6.4
 * @author:Nine_odes
 * @description:
 * @create:2020-06-05 10:29
 **/
import java.util.*;
public class Main{
    private static int Apple(int N){
        int count= 0;
        int max = N;
        if(N < 6){
            return -1;
        }else if(N % 8 == 0){
            return N /8;
        }else{
            for(int i = 0; i < N ; i++) {
                if((N - i * 6) % 8 == 0 ){
                    count = i + (N - i * 6) / 8;
                    if(max > count){
                        max = count;
                    }
                }
            }
        }

        return max;

    }

//    private static int Apple(int N){
//        return -1;
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            System.out.println(Apple(N));
        }
    }
}
