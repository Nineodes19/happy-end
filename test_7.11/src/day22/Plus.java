package day22;
import java.util.*;
/**
 * @program:test_7.11
 * @author:Nine_odes
 * @description:
 * @create:2020-07-11 18:43
 **/



class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here

        ListNode l1 = a,l2 = b;
        ListNode head = new ListNode(0);
        ListNode p = head;
        int sum = 0;
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }

        while(l1!=null || l2!=null||sum != 0){
            if(l1!=null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10);
            sum /= 10;
            p = p.next;

        }
        return head.next;
    }
}
