/**
 * @program:test_8.143
 * @author:Nine_odes
 * @description:链表法分割
 * @create:2020-08-14 21:08
 **/

public class TestDemo1 {
    public ListNode partition(ListNode pHead,int x){
        ListNode h1 = null;
        ListNode min = h1;

        ListNode h2 = null;
        ListNode max= h2;
        ListNode temp = pHead;
        while(temp != null && temp.next!= null){
            if(temp.val < pHead.val){
                h1.val = temp.val;
                h1 = h1.next;
            }else{
                h2.val = pHead.val;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        h1.val = pHead.val;
        h1 = h1.next;
        h1.val = max.val;
        h1.next = max.next;
        return min;
    }
}
