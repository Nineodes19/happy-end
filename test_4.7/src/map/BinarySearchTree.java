package map;

/**
 * @program:test_4.7
 * @author:Nine_odes
 * @description:
 * @create:2020-04-07 18:59
 **/
public class BinarySearchTree {
    static class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public Node root = null;

    public Node search(int val) {
        Node cur = root;
        while (cur != null) {
            if(val == cur.data){
                return cur;
            }else if(val > cur.data){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return null;
    }

    public boolean insert(int key){
        Node node = new Node(key);
        if(root == null){
            root = node;
            return true;
        }

        Node parent = null;
        Node cur = root;
        while(cur != null){
            if(cur.data ==key) {
                return false;
            }else if(cur.data > key){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        if(key > parent.data){
            parent.right = node;
        }else {
            parent.left = node;
        }
        return true;
    }

    public void remove(int key){

        Node parent = null;
        Node cur = root;

        while(cur != null){
            if(cur.data == key){
                removeNode(parent,cur);
                return;
            }else if(cur.data < key){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
    }

    private void removeNode(Node parent,Node cur){
        if(cur.left == null){
            //3种情况
            //cur是root
            if(cur == root){
                root = cur.right;
            }else {
                //此时，cur不是root
                if (cur == parent.left) {
                    parent.left = cur.right;
                }else if(cur == parent.right){
                    parent.right = cur.right;
                }
            }

        }else if(cur.right == null){
            if(cur == root){
                root = cur.left;
            }else if(cur == parent.right){
                parent.right = cur.left;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }
        }else{
            Node targetParent = cur;
            Node target = cur.right;
            while(target.left != null){
                targetParent = target;
                target = target.left;
            }
            //并没有删除，只是一个简单的值的偷换
            //因为是在右边找，找的是右边最小的数字，又因为
            //右边最小的数字一定是左树为空
            cur.data = target.data;
            if(target == targetParent.left){
                targetParent.left = target.right;
            }else{
                targetParent.right = target.left;
            }
        }
    }
}
