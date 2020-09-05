import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program:test_9.5
 * @author:Nine_odes
 * @description:
 * @create:2020-09-05 20:33
 **/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
public class TestDemo4 {
    //输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    // 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    // 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和
    // 中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

    /**
     * @param pre 前序数组
     * @param in 中序数组
     * @return
     */
    public TreeNode reConstructBinaryTree1(int[] pre,int[] in){
        //前序遍历序列{1,2,4,7,3,5,6,8}
        //中序遍历序列{4,7,2,1,5,3,8,6}
        if(pre.length == 0 || in.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if(in[i] == root.val){
                root.left = reConstructBinaryTree1(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree1(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }


    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
        if(startPre >endPre || startIn > endIn){
            return null;
        }
       TreeNode root  = new TreeNode(pre[startPre]);
        for (int i = startIn; i <=endIn ; i++) {
            if(in[i] == pre[startPre]){
                root.left = reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right = reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return root;
    }

    public TreeNode reConstructBinaryTree2(int[] pre,int[] in){
        int i = 0;
        if(pre.length != in.length || pre.length == 0 || in.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        while(in[i] != root.val) {
            i++;
        }
        int[] preLeft = new int[i];
        int[] inLeft = new int[i];
        int[] preRight = new int[pre.length-i-1];
        int[] inRight = new int[in.length -1-i];
        for(int j = 0; j < in.length; i++){
            if(j <i){
                preLeft[j] = pre[j+1];
                inLeft[j] = in[j];
            }else if(j < i){
                preRight[j-i-1] = pre[j];
                inRight[j-i-1] = in[j];
            }
        }
        root.left = reConstructBinaryTree2(preLeft,inLeft);
        root.right = reConstructBinaryTree2(preRight,inRight);
        return root;
    }

}
