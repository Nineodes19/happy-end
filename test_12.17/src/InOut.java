import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @program:test_12.17
 * @author: Nine_odes
 * @description:
 * @create:2019-12-17 18:19
 */
public class InOut {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int score = sc.nextInt();
//            System.out.println(score);
//        }
//        Scanner sc1 = new Scanner(System.in);
//        int a = sc1.nextInt();
//        System.out.println(a);
////        double b = sc1.nextDouble();
////        System.out.println(b);
////
////        Scanner sc2 = new Scanner(System.in);
////        int c = sc2.nextInt();
////        System.out.println(c);
//
//        Scanner sc2 = new Scanner(new BufferedInputStream(System.in));
//        int b = sc2.nextInt();
//        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                double a = sc.nextDouble();
                System.out.println(a);
            }
        }
    }
}
