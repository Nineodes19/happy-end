package day43;

/**
 * @program:test_8.5
 * @author:Nine_odes
 * @description: 求和
 * @create:2020-08-05 17:13
 **/

import java.util.*;
public class Main1 {

    public static void count(int m,int sum,int current,int n,ArrayList<Integer> list){
        if(sum > m){
            return;
        }
        if(sum == m){
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while(it.hasNext()){
                sb.append(it.next() + " ");
            }
            System.out.println(sb.toString().trim());
        }else{
            for (int i = current+1; i <=n; i++) {
                list.add(i);
                count(m,sum+i,i,n,list);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
                count(m,i,i,n,list);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> listN = new ArrayList<>();
        for(int i = 0; i < n; i++){
            listN.add(i);
        }

            for (int i = 0; i < n; i++) {
                int temp = listN.remove(i);
                n--;
                if(temp == m){
                    System.out.println(temp);
                    continue;
                }
                if (listN.contains(m - temp)) {
                    System.out.println(temp + " " + (m - temp));
                    listN.remove(listN.indexOf(m-temp));
                    n--;
                }
            }
    }
}
