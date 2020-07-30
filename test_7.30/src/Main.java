import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @program:test_7.30
 * @author:Nine_odes
 * @description:红与黑
 * @create:2020-07-30 15:14
 **/
public class Main {
    static boolean[][] vis;
    static int count;
    static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = -1,b = -1;
            char[][] ch = new char[x][y];
            count = 1;
            vis = new boolean[x][y];
            for(int i = 0; i <  x;i++){
                String str = sc.next();
                for(int j = 0; j < y; j++){
                    ch[i][j] = str.charAt(j);
                    if(ch[i][j] == '@'){
                        a = i;
                        b = j;
                    }
                }
            }
            BFS(a,b,ch);
            System.out.println(count);
        }
    }
    public static void BFS(int x,int y,char[][]ch){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(x,y));
        vis[x][y] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(int i = 0; i < 4; i++){
                Node next = new Node(cur.x + dir[i][0],cur.y + dir[i][1]);
                if(next.x >= 0 &&next.x < ch.length && next.y >= 0 &&
                        next.y <ch[0].length
                        && ch[next.x][next.y] != '#' &&
                        !vis[next.x][next.y]){
                    count++;
                    queue.add(next);
                    vis[next.x][next.y] = true;
                }
            }
        }

    }
    static class Node{
        int x;
        int y;
        Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}
