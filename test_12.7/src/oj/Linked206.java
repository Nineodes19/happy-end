package oj;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:反转链表
 * @create:2019-12-09 22:39
 */
public class Linked206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = new ListNode(head.val);
        while(head.next != null){
            ListNode node = new ListNode(head.next.val);
            node.next = newhead;
            newhead = node;
            head = head.next;
        }
        return newhead;
    }
}
