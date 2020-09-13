import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program:test_9.13
 * @author:Nine_odes
 * @description:
 * @create:2020-09-13 20:13
 **/
public class TestDemo3 {
    public static void main(String[] args) {
         class node{
            int u;
            int m;
            int time;
            node(int u,int m,int time){
                this.u = u;
                this.m = m;
                this.time = time;
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<node> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            node no = new node(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        String start = sc.nextLine();
        int[] dp = new int[n];

    }
}
