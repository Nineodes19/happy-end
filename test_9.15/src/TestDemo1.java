/**
 * @program:test_9.15
 * @author:Nine_odes
 * @description: 链表中倒数第k个结点
 * @create:2020-09-15 21:47
 **/

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class TestDemo1 {
    public ListNode FindKthToTail(ListNode head,int k){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        if(count < k){
            return null;
        }
        temp = head;
        ListNode fast = temp;
        ListNode low = temp;
        for (int i = 0; i < k; i++) {
            fast = temp.next;
            temp = temp.next;
        }
        while(fast != null){
            fast = fast.next;
            low = low.next;
        }
        return low;
    }
}
