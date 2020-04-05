
/**
 * @program:test_4.5
 * @author:Nine_odes
 * @description:
 * @create:2020-04-05 11:28
 **/
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }


    public Node head;

    public void insertHead(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void insertTail(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            //cur  指向的位置 就是尾巴节点
            cur.next = node;
        }
    }

    public void show() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
public class Code {

    public  static Node Swap(Node headA, Node headB){
        Node dummyhead = null;
        while(headA.next != null && headB.next!=null){
            if(headA.data > headB.data){
                dummyhead.next = headA;
                headA = headA.next;
            }
            dummyhead.next = headB;
            headB = headB.next;
        }

        if(headA.next == null){
            dummyhead.next = headB;
        }
        if(headB.next == null){
            dummyhead.next = headB;
        }

        return dummyhead.next;
    }

    public static void main(String[] args) {
        Node headA = new Node(1);
        headA.insertTail(3);
        headA.insertTail(5);
        headA.insertTail(6);
        Node headB = new Node(2);
        headB.insertTail(4);
        headB.insertTail(10);
        Node node =  Swap(headA,headB);
        node.show();

    }
}
