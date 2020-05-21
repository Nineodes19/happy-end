package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program:test_5.21
 * @author:Nine_odes
 * @description:
 * @create:2020-05-21 21:23
 **/
public class TestDemo1{
    public List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        //预处理
        boolean[][] dp = new boolean[len][len];
        //状态转移方程
        for (int right = 0; right < len; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                }
            }
        }
        Deque<String> stack = new ArrayDeque<>();
        backtracking(s, 0, len, dp, stack, res);
        return res;
    }

    private void backtracking(String s,int start,int len,boolean[][] dp,Deque<String> path,List<List<String>> res){
        if(start == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < len; i++){
            if(!dp[start][i]){
                continue;
            }
            path.addLast(s.substring(start,i+1));
            backtracking(s,i+1,len,dp,path,res);
            path.removeLast();
        }
    }
}
