package nowcoder;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:链表分割
 * @create:2019-12-11 17:51
 */

//以给定值x为基准将链表分割成两部分，
// 所有小于x的结点排在大于或等于x的结点之前
//给定一个链表的头指针 ListNode* pHead，
// 请返回重新排列后的链表的头指针。
// 注意：分割以后保持原来的数据顺序不变。
public class Solution01 {
    public ListNode partition(ListNode pHead, int x) {
        //1  2  9  4  2  7  4
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode small = new ListNode(-1);
        ListNode s = small;
        ListNode big = new ListNode(1);
        ListNode b = big;
        while(pHead != null){
            if(pHead.val < x){
                s.next = pHead;
                s = pHead;
            }else{
                b.next = pHead;
                b = pHead;
            }
            pHead = pHead.next;
        }
        b.next = null;
        s.next = big.next;
        return small.next;
    }
}
