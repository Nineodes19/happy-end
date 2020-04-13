/**
 * @program:test_4.13
 * @author:Nine_odes
 * @description:
 * @create:2020-04-13 10:15
 **/
public class BinarySearchTree {
    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }


    public Node root = null;
    /**
     * 查找
     * @param val 需要查找的数据
     */
    public Node search(int val){
        Node cur = root;
        while(cur != null){
            if(cur.data == val){
                return cur;
            }else if(cur.data > val){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return null;
    }

    /**
     * 插入
     * @param key 需要插入的数据
     * @return 返回值为true或者false
     */
    public boolean insert(int key){
        Node node = new Node(key);
        if(root == null){
            root = node;
            return true;
        }

        Node parent = null;
        Node cur = root;
        while(cur != null){
            if(cur.data == key){
                return false;
            }else if (key > cur.data){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }

        if(key > parent.data){
            parent.right = node;
        }else{
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
            }else  if(cur.data < key){
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
            //三种情况

            if(cur == root){
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else{
                parent.right = cur.right;
            }
        }else if(cur.right == null){
            if(root == null){
                root = cur.left;
            }else if(cur == parent.right){
                parent.right = cur.left;
            }else{
                parent.left = cur.left; 
            }
        }else{

        }
    }
}


