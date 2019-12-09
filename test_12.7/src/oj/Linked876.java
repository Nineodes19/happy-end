package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:链表的中间节点
 * @create:2019-12-09 19:54
 */


public class Linked876 {
    public ListNode middleNode(ListNode head) {
        if(head == null){//链表为空
            return null;
        }
        ListNode key1 = head;
        ListNode key2 = head;
        while(key2 != null && key2.next != null){
                key1 = key1.next;
                key2 = key2.next.next;
        }
        return key1;
    }
}
