package leetcode;

/**
 * @program:test_code
 * @author:Nine_odes
 * @description:
 * @create:2020-03-23 13:23
 **/
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode ret = new ListNode(-1);
        ret.next = head;
        int size = 0;
        while(ret.next != null){
            size ++;
            ret = ret.next;
        }
        for (int i = 0; i < size/2; i++){
            head = head.next;
        }
        return head;
    }
}
