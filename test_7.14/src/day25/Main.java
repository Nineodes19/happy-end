package day25;

/**
 * @program:test_7.14
 * @author:Nine_odes
 * @description:
 * @create:2020-07-14 18:27
 **/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            int n = sc.nextInt();
            int[] score = new int[n];
            int[] grade = new int[n];
            for(int i = 0; i < n; i++){
                score[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                grade[i] = sc.nextInt();
            }

            double Gpa = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                double jidian = 0;
                if(grade[i] >= 90) jidian= 4.0;
                else if(grade[i] >= 85) jidian= 3.7;
                else if(grade[i] >= 82) jidian= 3.3;
                else if(grade[i] >= 78) jidian= 3.0;
                else if(grade[i] >= 75) jidian= 2.7;
                else if(grade[i] >= 72) jidian= 2.3;
                else if(grade[i] >= 68) jidian= 2.0;
                else if(grade[i] >= 64) jidian= 1.5;
                else if(grade[i] >= 60) jidian= 1.0;
                else jidian= 0;
                Gpa += score[i] * jidian;
                sum += score[i];
            }
            System.out.printf("%.2f",Gpa / sum);
        }
    }
    private static double Gpa(int grade){
        if(grade >= 90) return 4.0;
        else if(grade >= 85) return 3.7;
        else if(grade >= 82) return 3.3;
        else if(grade >= 78) return 3.0;
        else if(grade >= 75) return 2.7;
        else if(grade >= 72) return 2.3;
        else if(grade >= 68) return 2.0;
        else if(grade >= 64) return 1.5;
        else if(grade >= 60) return 1.0;
        else return 0.1;
    }
}
