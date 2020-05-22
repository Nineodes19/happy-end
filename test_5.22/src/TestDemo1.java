/**
 * @program:test_5.22
 * @author:Nine_odes
 * @description: 从前序与中序遍历序列构造二叉树
 * @create:2020-05-22 10:42
 **/
public class TestDemo1 {

    /**
     *
     * @param preorder 前序遍历数组
     * @param inorder 中序遍历数组
     * @return 返回根前序和中序遍历生成的二叉树
     */
    public TreeNode buildTree(int[] preorder,int[] inorder){
        //前序遍历的首元素是二叉树的根节点
        TreeNode node = new TreeNode(preorder[0]);
        //遍历中序遍历数组，找到根节点的位置，确定左右子树元素
        for (int i = 0; i < inorder.length; i++) {
            
        }


        return node;
    }
}
