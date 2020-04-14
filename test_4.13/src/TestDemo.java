/**
 * @program:test_4.13
 * @author:Nine_odes
 * @description:
 * @create:2020-04-13 10:44
 **/
public class TestDemo {

    public static void preOrder(BinarySearchTree.Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(BinarySearchTree.Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int[] array = {21,8,28,4,24,30,26};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int val:array) {
            binarySearchTree.insert(val);
        }
        preOrder(binarySearchTree.root);
        System.out.println();
        inOrder(binarySearchTree.root);
        System.out.println();
        System.out.println(binarySearchTree.search(8).data);

        binarySearchTree.remove(28);
        preOrder(binarySearchTree.root);
        System.out.println();
        inOrder(binarySearchTree.root);
    }
}
