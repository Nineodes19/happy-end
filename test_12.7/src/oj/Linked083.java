package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:删除排序链表中的重复元素
 * @create:2019-12-10 20:49
 */
public class Linked083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while(temp.next != null && temp.next.next!= null ){
            if(temp.next.val == temp.next.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }
}
