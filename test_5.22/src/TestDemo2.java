import java.util.Objects;

/**
 * @program:test_5.22
 * @author:Nine_odes
 * @description:
 * @create:2020-05-22 12:39
 **/

class Node{
    char val;
    Node left;
    Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class TestDemo2 {
    public Node createNode(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        B.left = D;
        B.right = E;
        E.right = H;
        A.right = C;
        C.left = F;
        C.right = G;

        return A;
    }

    //前序遍历
    void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    //求结点的个数
    public int getSize2(Node root){
        //左树的节点个数加右树的节点个数
        if(root == null){
            return 0;
        }

        return getSize2(root.left) +getSize2(root.right) + 1;
    }

    static int leafSize = 0;
    public int getLeafSize1(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            leafSize++;
        }
        getLeafSize1(root.right);
        getLeafSize1(root.left);
        return leafSize;
    }
    public int getLeafSize2(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }else{
            return getLeafSize2(root.left) +getLeafSize2(root.right);
        }

    }
    public int getKLevelSize(Node root,int k){
        if(root == null){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return getKLevelSize(root.right,k-1) +getKLevelSize(root.left,k-1);
    }


    public static void main(String[] args) {
        TestDemo2 t = new TestDemo2();
        Node root = t.createNode();
        System.out.print("前序遍历结果：");
        t.preOrderTraversal(root);
        System.out.print("\n中序遍历结果：");
        t.inOrderTraversal(root);
        System.out.print("\n后序遍历结果：");
        t.postOrderTraversal(root);
        System.out.println("\n节点个数："+ t.getSize2(root));
        System.out.println("\n叶子结点个数："+ t.getLeafSize1(root));
        System.out.println(t.getKLevelSize(root,2));
    }
}
