package day17;

/**
 * @program:test_6.21
 * @author:Nine_odes
 * @description:二叉树的镜像
 * @create:2020-06-21 15:53
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Main1 {
    public static void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(8);
        TreeNode B = new TreeNode(6);
        TreeNode C= new TreeNode(10);
        TreeNode D= new TreeNode(5);
        TreeNode E = new TreeNode(7);
        TreeNode F = new TreeNode(9);
        TreeNode G= new TreeNode(11);
        A.left = B;
        B.left = D;
        B.right = E;
        A.right = C;
        C.left = F;
        C.right = G;
        System.out.println(A.toString());
//        Mirror(A);
//        System.out.println(A);
    }
}
