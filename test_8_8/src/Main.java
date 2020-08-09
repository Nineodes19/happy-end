/**
 * @program:test_8_8
 * @author:Nine_odes
 * @description:马戏团
 * @create:2020-08-09 11:17
 **/
import java.util.*;
public class Main {
    static class People{
        int height;
        int weight;
        public People(int weight,int height){
            this.weight = weight;
            this.height = height;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            People[] arr = new People[n];
            for (int i = 0; i < n; i++) {
                int index = sc.nextInt();
                arr[index-1] = new People(sc.nextInt(),sc.nextInt());
            }
            Arrays.sort(arr,new Comparator<People>(){
                public int compare(People p1,People p2){
                    int result = Integer.compare(p1.height,p2.height);
                    if(result != 0){
                        //两者的身高不相等
                        return result;
                    }else{
                        //两者身高相同，要体重更轻才能继续加
                        //return (x < y) ? -1 : ((x == y) ? 0 : 1);
                        //当p1.weight < p2.weight时，返回-1；
                        //当x==y时，返回0；
                        //当x>y时，返回1
                        return Integer.compare(p1.weight,p2.weight);
                    }
                }
            });
            int[] dp = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < dp.length; i++) {
                dp[i] = 1;
                for(int j = i-1; j >=0; --j){
                    if((arr[i].weight > arr[j].weight)
                            || (arr[i].weight == arr[j].weight
                            && arr[i].height==arr[j].height)){
                        //在这里表明了dp[j]+1的条件：
                        //1.A的体重要大于B的体重
                        //2.当A的体重=B的体重时，还要往上加就需要
                        //A的身高等于B的身高
                        dp[i] = Math.max(dp[i],dp[j]+1);
                    }
                }
                max = Math.max(dp[i],max);
            }
            System.out.println(max);
        }
    }
}
