

import java.util.Scanner;

/**
 * @program:tes_7.22
 * @author:Nine_odes
 * @description: 在霍格沃兹找零钱
 * @create:2020-07-22 20:01
 **/
public class Main {

    private static void findMoney(String s1,String s2){
        final int FIEST = 17*29;
        final int SECOND = 29;
        String[]  ps = s1.split("\\.");
        int lengths1 = ps.length;
        //5421
        int money = (lengths1 >= 1 ? Integer.parseInt(ps[0]) * FIEST : 0) +
                (lengths1 >= 2? Integer.parseInt(ps[1]) * SECOND : 0) +
                (lengths1 >= 3 ? Integer.parseInt(ps[2]) : 0);

        String[] as = s2.split("\\.");
        int lengths2 = as.length;
        //6959
        int moneys2 = (lengths2 >= 1? Integer.parseInt(as[0]) * FIEST : 0) +
                    (lengths2 >= 2? Integer.parseInt(as[1]) * SECOND : 0) +
                        (lengths2 >= 3 ? Integer.parseInt(as[2]) : 0);
        int find =   moneys2-money;//1532
        //17*29=493
        if(find < 0){
            find *= (-1);
            System.out.println("-");
        }
        System.out.println(find/(FIEST) + "." + (find%FIEST)/SECOND + "." + find%FIEST%SECOND);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            findMoney(s1,s2);
        }
    }
}
