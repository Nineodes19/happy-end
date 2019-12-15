package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:环形链表
 * @create:2019-12-15 11:47
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
