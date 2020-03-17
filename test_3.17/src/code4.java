/**
 * @program:test_3.17
 * @author:Nine_odes
 * @description:
 * @create:2020-03-17 18:13
 **/
class Node{
    Node left;
    Node right;
    Node val;
}
public class code4 {
    public static void main(String[] args) {


    }
    void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }
}
