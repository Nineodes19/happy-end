import java.util.Scanner;

/**
 * @program:test_4.22
 * @author:Nine_odes
 * @description:
 * @create:2020-04-22 16:39
 **/

public class TestDemo3 {
    public static enum Direction{
        E,S,W,N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        char[] dir = {'N','E','S','W'};
        String s = sc.next();
        for (int i = 0; i < N; i++) {
            if(s.charAt(i) == 'L'){
                res--;
            }else{
                res++;
            }
        }
        res %= 4;
        if(res < 0){
            System.out.println(dir[4+res]);
        }else{
            System.out.println(dir[res]);
        }

    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int line = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for(int j = 0; j < line; j++){
                if(s.charAt(j) == '.'){
                    count++;
                    j+=2;
                }
            }
            System.out.println(count);
        }
    }
}
