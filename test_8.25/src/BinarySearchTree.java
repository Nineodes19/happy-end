/**
 * @program:test_8.25
 * @author:Nine_odes
 * @description:
 * @create:2020-08-25 23:09
 **/
public class BinarySearchTree {
    public static class Node{
        int key;
        Node left;
        Node right;
        public Node(int key){
            this.key = key;
        }
    }
    private Node root = null;
    public Node serach(int key){
        Node cur = root;
        while(cur != null){
            if(key == cur.key){
                return cur;
            }else if(key > cur.key){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        return null;
    }

    public boolean insert(int key){
        if(root == null){
            root = new Node(key);
            return true;
        }
        Node cur = root;
        Node parent = null;//parent是待插入节点的父节点
        while(cur != null){
            if(key == cur.key){
                return false;//不允许插入已存在的值
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
        Node node = new Node(key);
        if(key < parent.key){
            parent.left = node;
        }else{
            parent.right = node;
        }
        return true;
    }

    public boolean remove(int key){
        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(key == cur.key){
                removeNode(parent,cur);
                return true;
            }else if(key < cur.key){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }

    private void removeNode(Node parent,Node cur){
        if(cur.left == null){
            //要删除的节点没有左孩子
            if(cur == root){
                //要删除的节点是根节点
                root = cur.right;
            }else if(cur == parent.left){
                //删除节点是父亲节点的左孩子
                parent.left = cur.right;
            }else{
                //删除节点是父亲节点的右孩子
                parent.right = cur.right;
            }
        }else if(cur.right == null){
            //要删除的节点没有右孩子
            if(cur == root){
                root = cur.left;
            }else if(cur == parent.right){
                //删除节点是父亲节点的右孩子
                parent.right = cur.left;
            }else{
                parent.left = cur.left;
            }
        }else{
            //此时要删除的节点有左孩子也有右孩子
            Node goatParent = cur;
            Node goat = cur.right;//较大值
            while(goat.left != null){
                goatParent = goat;
                goat = goat.left;
            }

            cur.key = goat.key;
            if(goat == goatParent.left){
                goatParent.left = goat.right;
            }else{
                goatParent.right = goat.right;
            }
        }
    }
}
