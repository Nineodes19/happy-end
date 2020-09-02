/**
 * @program:test_9.2
 * @author:Nine_odes
 * @description:判断链表是否有环
 * @create:2020-09-02 23:15
 **/

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class Solution {
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
