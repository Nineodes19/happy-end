
import java.util.LinkedList;
import java.util.List;

/**
 * @program:test_3.20
 * @author:Nine_odes
 * @description:
 * @create:2020-03-20 20:09
 **/

//Definition for a binary tree node.


public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null){
            return list;
        }
        List<Integer> list1 = postorderTraversal(root.left);
        list.addAll(list1);

        List<Integer> list2 = postorderTraversal(root.right);
        list.addAll(list2);

        list.add(root.val);

        return list;

    }
}
