/**
 * @program:test_8.28
 * @author:Nine_odes
 * @description:
 * @create:2020-08-28 10:31
 **/
//前序和中序的非递归都是用栈来实现的
//队列：层序遍历和是否是完全二叉树

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
public class TestDemo1 {
    /**
     * 前序preorder;3 9  20  15  7
     * A B D E H C F G
     * 中序inorder ：9  3  15  20  7
     * D B E H A F C G
     * 后序：D H E B F G C A
     */

    public static int preindex = 0;
    //大的思路--》根据前序遍历完成
    public static TreeNode buildTreeChild(int[] preorder,int[] inorder,int inbegin,int inend){
        //此时在构造树的过程中，已经构造完成
        //没有左树或者没有右树，递归的终止条件。
        if(inbegin > inend){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preindex]);
        int rootIndex = findRootIndexOnInorder(inorder,preorder[preindex],inbegin,inend);


        if(rootIndex == -1){
            return null;
        }
        root.left = buildTreeChild(preorder,inorder,inbegin,rootIndex-1);
        root.right = buildTreeChild(preorder,inorder,rootIndex+1,inend);

        return root;
    }
    //在中序遍历的数组当中查找根节点所在的下标，如果没有，返回-1，如果有返回下标
    private static int findRootIndexOnInorder(int[] inorder,int val,int inbegin,int inend){
        for (int i = inbegin; i <= inend; i++) {
            if(inorder[i] == val){
                return i;
            }
        }
        return -1;
    }
    public static TreeNode buildTree(int[] preorder,int[] inorder){
        if(preorder == null || inorder == null){
            return null;
        }
        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }
}
