import javafx.geometry.Pos;

import java.util.Scanner;

/**
 * @program:test_7.20
 * @author:Nine_odes
 * @description: 二叉树遍历
 * @create:2020-07-20 14:45
 **/

class Node{
    Node left = null;
    Node right = null;
    char value;
    Node(char value){
        this.value = value;
    }
}
public class TestDemo {

    static String s1;
    static String s2;
    static int index = 0;
    private static Node buidTree(int low,int high){
        Node node = null;
        if(low <= high){
            char ch = s1.charAt(index++);
            node = new Node(ch);
            int point = s2.indexOf(ch);
            node.left = buidTree(low,point-1);
            node.right = buidTree(point+1,high);
        }
        return node;
    }
    private static void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            Node root = null;
            index = 0;
            root = buidTree(0,s1.length()-1);
            postOrder(root);
            System.out.println();
        }
    }
}
