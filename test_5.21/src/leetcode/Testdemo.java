package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program:test_5.21
 * @author:Nine_odes
 * @description:
 * @create:2020-05-21 12:27
 **/
public class Testdemo {
    public  List<List<String>> partition(String s){
        int len = s.length();
        List<List<String>>res = new ArrayList<>();
        if(len == 0){
            return res;
        }

        Deque<String > stack = new ArrayDeque<>();
        backtracking(s,0,len,stack,res);
        return res;
    }

    /**
     *
     * @param s
     * @param start 字符起始的索引位置
     * @param len 字符串s的长度
     * @param path 记录根节点到叶节点的路经
     * @param res 记录所有结果的返回值
     */
    private void backtracking(String s,int start,int len,Deque<String> path,List<List<String>> res){
        if(start == len){//起始位置等于字符串长度（即一个字符）
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < len; i++){
            //判断子串是否回文，如果不是，剪枝
            if(!checkPalindrome(s,start,i)){
                continue;
            }

            path.addLast(s.substring(start,i+1));
            backtracking(s,i+1,len,path,res);
            path.removeLast();//剪枝
        }
    }
    private boolean checkPalindrome(String str,int left,int right){
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
