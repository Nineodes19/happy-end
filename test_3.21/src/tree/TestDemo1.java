package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program:test_3.21
 * @author:Nine_odes
 * @description:
 * @create:2020-03-21 14:54
 **/
public class TestDemo1 {

    public Node prev = null;
    public void ConverChild(Node pCur){
        if (pCur == null) {
            return;
        }
        ConverChild(pCur.left);
        pCur.left = prev;
        if(prev != null){
            prev.right = pCur;
        }

        prev = pCur;

        ConverChild(pCur.right);
    }
    public Node Conver(Node pRootOfTree){
        ConverChild(pRootOfTree);
        Node head = pRootOfTree;
        while(head != null && head.left != null){
            head = head.left;
        }
        return head;

    }


    public Node lowestCommonAncestor(Node root,Node p,Node q){
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return  left;
        }
        if(right != null){
            return right;
        }
        return null;
    }

    public boolean isCompeleteTree(Node root){
        if(root == null){
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur != null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else{
                break;
            }
        }
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur != null){
                return false;//不是一棵完全二叉树
            }else{
                queue.poll();
            }
        }
        return true;
    }

    void levelOrderTree(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur!= null){
                System.out.println(cur.val + " ");
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
        }
    }

    /**
     * 需要将每一层的数据存放到list当中
     * @param root
     * @return
     */
    public List<List<Character>> levelOrder(Node root) {
        List<List<Character>> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);//1

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Character> list = new ArrayList<>();
            //这个循环代表每一层的数据
            while (size > 0) {
                Node cur = queue.poll();
                size--;
                if (cur != null) {
                    System.out.println(cur.val + " ");
                    list.add(cur.val);
                    if (cur.left != null) {
                        queue.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                }
                ret.add(list);
            }
        }
        return ret;
    }
}
