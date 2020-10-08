import javax.swing.event.TreeExpansionEvent;

/**
 * @program:test_10.8
 * @author:Nine_odes
 * @description:
 * @create:2020-10-08 22:27
 **/
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val){
        this.val =val;
    }
    public TreeLinkNode getNext(TreeLinkNode pNode){
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left != null)
                node = next.left;
            return node;
        }else{
            while(pNode.next!=null){
                TreeLinkNode parent = pNode.next;
                if(parent.left == pNode)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }
}
