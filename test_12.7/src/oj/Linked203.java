package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:移除链表元素
 * @create:2019-12-10 13:20
 */
public class Linked203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(val-1);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        head = dummyHead.next;
        return head;
    }
}
