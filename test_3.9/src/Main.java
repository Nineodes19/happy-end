import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * @program:test_3.9
 * @author:Nine_odes
 * @description:
 * @create:2020-03-09 22:30
 **/

public class Main{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static Node listGenerator(int length,String[] numbers){
        Node head = new Node(Integer.parseInt(numbers[0]));
        Node cur = head;
        for(int i = 1; i < length;i++){
            cur.next = new Node(Integer.parseInt(numbers[i]));
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }

    public static Node insert(Node head,int num){
        Node node = new Node(num);
        if(head == null){
            node.next = null;
            return node;
        }
        Node pre = head;
        Node cur = head.next;
        while(cur != head){
            if(pre.val <= num && cur.val >= num){
                break;
            }
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = node;
        cur.next = cur;
        return head.val < node.val ? head : node;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] numbers = bufferedReader.readLine().split(" ");
        int num = Integer.parseInt(bufferedReader.readLine());
        Node head = listGenerator(n,numbers);
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = head;
        head = insert(head,num);
        System.out.print(head.val +" ");
        node = head.next;
        while(node != head){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
