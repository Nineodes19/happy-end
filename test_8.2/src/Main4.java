/**
 * @program:test_8.2
 * @author:Nine_odes
 * @description:
 * @create:2020-08-02 20:16
 **/

import java.util.*;
public class Main4 {
    static class customer{
        int count;//人数
        int money;//消费金额

        @Override
        public String toString() {
            return "customer{" +
                    "count=" + count +
                    ", money=" + money +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//桌子个数
        int m = sc.nextInt();//总共几波客人
        int[] table = new int[n];
        for (int i = 0; i < n; i++) {
            table[i] = sc.nextInt();
        }

        List<customer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            customer c = new customer();
            c.count = sc.nextInt();
            c.money = sc.nextInt();
            list.add(c);
        }
        //System.out.println(list);
        int max=0;
        int sum = 0, sumcur = 0;

        for (int j = 0; j < n; j++) {
            customer l= null;
            for(int i = 0; i < list.size(); i++){
                l = list.get(i);
                if(l.count <= table[j]) {
                    sum = Math.max(sum, l.money);
                }
            }
            max += sum;
            System.out.println(sum);
            sum = 0;
            list.remove(l);
        }
        System.out.println(max);
    }
}
