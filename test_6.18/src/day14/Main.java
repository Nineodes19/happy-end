package day14;

import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * @program:test_6.18
 * @author:Nine_odes
 * @description:组个最小数（20）
 * @create:2020-06-18 18:24
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            while(n != 0){
                list.add(i);
                n--;
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != 0){
                list1.add(list.get(i));
                list.remove(i);
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
        }
    }
}