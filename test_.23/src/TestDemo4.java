/**
 * @program:test_.23
 * @author:Nine_odes
 * @description:
 * @create:2020-09-23 11:08
 **/

/*
输入两个整数n和m，从数列1,2，3，，，，n中随意取出几个数，使其和等于m
要求将所有可能的组合列出来
 */
import java.util.*;
public class TestDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        backtrack(n,m,new ArrayList<>(),1);
        for(List<Integer> temp:res){
            for (int i = 0; i < temp.size(); i++) {
                if(i == temp.size()-1){
                    System.out.println(temp.get(i));
                }else{
                    System.out.println(temp.get(i)+ " ");
                }
            }
        }
    }

    private static List<List<Integer>> res = new ArrayList<>();

    /**
     * @param n  数列的最大值
     * @param target 要得到的和
     * @param list 存储相加等于target的数列
     * @param start
     */
    private static void backtrack(int n,int target,List<Integer> list,int start){
        if(target ==0){
            //此时list数列值相加已经等于m，向数列中加入新的list
            res.add(new ArrayList<>());
        }else if(target > 0){
            for (int i = target; i <=n ; i++) {
                list.add(i);
                backtrack(n,target-i,list,i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
