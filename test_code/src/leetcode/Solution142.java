package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 11:56
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        }
        fast = head;
        while(slow != null && slow.next !=null){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast){
                return fast;
            }
        }
        return null;
    }
}
