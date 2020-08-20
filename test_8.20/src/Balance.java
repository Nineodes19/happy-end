

/**
 * @program:test_8.20
 * @author:Nine_odes
 * @description:二叉树平衡查找
 * @create:2020-08-20 20:08
 **/

class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val){
        this.val = val;
    }
}
public class Balance {
    public boolean isBanlance(TreeNode root){
        if(root == null){
            return true;
        }
        int lh = hight(root.left);
        int rh = hight(root.right);
        if(Math.abs(lh-rh) > 1){
            return false;
        }
        return isBanlance(root.left) && isBanlance(root.right);
    }

    private static int hight (TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(hight(root.left),hight(root.right)) + 1;
        }
    }
}
