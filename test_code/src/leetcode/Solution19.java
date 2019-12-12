package leetcode;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:删除链表的倒数第N的节点
 * @create:2019-12-11 16:58
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head == null){
//            return null;
//        }
//        ListNode first = head;
//        ListNode sec = head;
//
//        int count = 0;
//        while(first != null){
//            first = first.next;
//            count++;
//            if(count >= n+1){
//                sec = sec.next;
//            }
//        }
//        ListNode dummyHead = new ListNode(-1);
//        dummyHead.next = head;
//        ListNode temp = dummyHead;
//        while(temp.next != null){
//            if(temp.next== sec){
//                temp.next = temp.next.next;
//            }else{
//                temp = temp.next;
//            }
//        }
//        return dummyHead.next;


        if(head == null || head.next == null){
            return null;
        }

        ListNode fast = head;
        ListNode sec = head;
        int count = 0;
        while(fast != null){
            fast = fast.next;
            count++;
            if(count >= n+2){
                sec = sec.next;
            }
        }
        //此时处在待删除位置的前一个节点
        if(count == n){
            return head.next;
        }else{
            sec.next = sec.next.next;
        }
        return head;
    }
}
