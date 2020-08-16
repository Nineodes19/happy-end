package code;

/**
 * @program:test_8.16
 * @author:Nine_odes
 * @description:
 * @create:2020-08-16 22:08
 **/
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class TestDemo1 {
    public ListNode partition(ListNode pHead,int x){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode Shead = new ListNode(-1);
        ListNode Bhead = new ListNode(-1);
        ListNode S = Shead;
        ListNode B = Bhead;
        while(cur != null){
            if(cur.val < x){
                S.next = new ListNode(cur.val);
                S = S.next;
            }else{
                B.next = new ListNode(cur.val);
                B = B.next;
            }
            cur = cur.next;
        }
        cur = Shead;
        while(cur.next!=null && cur.next.val != -1){
            //此时有比x小的节点
            cur = cur.next;
        }
        cur.next = Bhead.next;//将Shead和Bhead链接起来
        return Shead.next;
    }
}
