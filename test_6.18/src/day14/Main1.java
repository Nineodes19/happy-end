package day14;

import java.util.LinkedList;

/**
 * @program:test_6.18
 * @author:Nine_odes
 * @description:尼科彻斯定理
 * @create:2020-06-18 18:24
 **/
public class Main1 {
    public static void main(String[] args) {
        int N = 6;
        int ret = 0;
        for(int i = 1 ; i <= 6; i++){
            ret += i;
        }
        LinkedList list = new LinkedList();
        for (int i = 0; i < ret*2; i+=2) {
            list.add(i+1);
        }
        for (int i = ret-N; i < list.size(); i++) {
            if(i != list.size()-1)
                System.out.print(list.get(i) + "+");
            else
                System.out.print(list.get(i));
        }

    }
}
