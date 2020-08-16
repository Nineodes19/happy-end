

/**
 * @program:test_8.15
 * @author:Nine_odes
 * @description:
 * @create:2020-08-15 23:45
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode Shead = new ListNode(-1);
        ListNode Bhead = new ListNode(-1);
        ListNode Stmp = Shead;
        ListNode Btmp = Bhead;
        while(cur != null){
            if( cur.val < x){
                Stmp.next = new ListNode(cur.val);
                Stmp = Stmp.next;
            }else{
                Btmp.next = new ListNode(cur.val);
                Btmp = Btmp.next;
            }
            cur = cur.next;
        }
        cur = Shead;
        while(cur.next!= null && cur.next.val != -1){
            cur = cur.next;
        }
        cur.next = Bhead.next;
        return Shead.next;
    }
}
