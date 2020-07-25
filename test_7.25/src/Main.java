import java.util.Scanner;

/**
 * @program:test_7.25
 * @author:Nine_odes
 * @description:球的半径和体积
 * @create:2020-07-25 18:33
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double[] arr = new double[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = sc.nextDouble();
            }

            System.out.printf("%.3f",getRadius(arr)) ;
            System.out.print(" ");
            System.out.printf("%.3f",getV(arr));
            System.out.println();
        }
    }
    private static double getRadius(double[] arr){
        //0 1 2
        //3 4 5
        double r = 0;
        double rs = 0;
        rs = (arr[3] - arr[0])*(arr[3] - arr[0]) + (arr[4] - arr[2])*(arr[4] - arr[2])
                +(arr[5]- arr[2])*(arr[5]- arr[2]);
        r = Math.sqrt(rs);

        return r;
    }
    private static double getV(double[] arr){
        double v = 0;
        v = 4*Math.acos(-1)*Math.pow(getRadius(arr),3)/3;

        return v;
    }
}
