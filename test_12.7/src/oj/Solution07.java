package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:删除链表中重复的节点
 * @create:2019-12-10 20:40
 */
public class Solution07 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = pHead;
        ListNode pre = head;
        while(head.next != null){
            if(head.next.next != null &&head.next.next.val == head.next.val){
                while(head.next.next != null && head.next.next.val == head.next.val){
                    head.next = head.next.next;
                }

                head.next = head.next.next;

                pre.next = head.next;
            }else{
                pre = head.next;
                head.next = head.next.next;
            }
        }
        return head.next;
    }
}
