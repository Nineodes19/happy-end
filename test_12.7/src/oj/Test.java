package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:
 * @create:2019-12-10 13:25
 */
public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode node = new ListNode(2);
        ListNode node1 = new ListNode(4);
        l1.next = node;
        node.next = node1;

        ListNode l2 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        l2.next = node2;
        node2.next = node3;


        Linked021 link = new Linked021();
        ListNode node4 = link.mergeTwoLists(l1,l2);
        ListNode temp = node4;
        while(temp!= null){
            System.out.print(temp.val+"、 ");
            temp = temp.next;
        }
    }
}
