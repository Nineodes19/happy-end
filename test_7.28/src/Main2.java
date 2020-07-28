import java.util.Scanner;

/**
 * @program:test_7.28
 * @author:Nine_odes
 * @description: 底下迷宫
 * @create:2020-07-28 16:23
 **/
public class Main2 {
    static String path = "";
    public static String pathOut(int n,int m,int[][] node,int power){
        if(n <= 0){
            return "Can not escape";
        }
        boolean[][] visited = new boolean[n][m];
        findPath(n,m,node,0,0,"",visited,power);
        return path;
    }
    public static void findPath(int n,int m, int[][] node,int nowx,int nowy,String res,boolean[][]visited,int power){
        if(nowx == 0 && nowy == m-1 && node[0][m-1] == 1){
            if(power >= 0){
                path = res + "[0," + (m-1) + "]";
            }else {
                path = "Can not escape";
            }
            return;
        }
        if(nowx < n && nowy < m && nowx >=0 && nowy >= 0 && node[nowx][nowy] == 1 && !visited[nowx][nowy]){
            visited[nowx][nowy] = true;
            res += "[" + nowx + "," + nowy + "],";
            //→
            findPath(n,m,node,nowx,nowy + 1,res,visited,power-1);
            //↓
            findPath(n,m,node,nowx+1,nowy,res,visited,power);
            //←
            findPath(n,m,node,nowx,nowy-1,res,visited,power-1);
            //↑
            findPath(n,m,node,nowx -1,nowy,res,visited,power-3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //迷宫：n*m
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int power = sc.nextInt();
            int[][] node = new int[n][m];
            for(int i = 0; i <n; i++){
                for(int j = 0; j < m; j++){
                    node[i][j] = sc.nextInt();
                }
            }
            System.out.println(pathOut(n,m,node,power));
        }
    }

}
