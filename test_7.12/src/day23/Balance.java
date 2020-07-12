package day23;

import java.util.*;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

/**
 * @program:test_7.12
 * @author:Nine_odes
 * @description: 二叉树平衡检查
 * @create:2020-07-12 16:32
 **/
public class Balance {
    public boolean isBalance(TreeNode root){
        if(root == null){
            return true;
        }
        int Rh = getTreeHeight(root.right);
        int Lh = getTreeHeight(root.left);
        if(Math.abs(Rh-Lh) > 1){
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }

    public int getTreeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left),getTreeHeight(root.right)) + 1;
    }
}
