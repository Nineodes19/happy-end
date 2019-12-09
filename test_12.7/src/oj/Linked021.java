package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:合并两个有序链表
 * @create:2019-12-09 20:52
 */



public class Linked021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode s = new ListNode(0);
        ListNode prev = s;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if(l1 == null && l2 != null){
            prev.next = l2;
        }
        if(l1 != null && l2 == null){
            prev.next =l1;
        }

        return s.next;
    }
}
