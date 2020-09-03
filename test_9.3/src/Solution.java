/**
 * @program:test_9.3
 * @author:Nine_odes
 * @description:
 * @create:2020-09-03 23:12
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head){
        //head为当前节点，如果当前节点为空，直接返回null
        if(head == null){
            return null;
        }
        /*
        当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        需要pre和next的目的是让当前节点从pre---head---next1---next2 变成
        next2 ---next1--- head--- pre
        即pre让节点可以翻转所指方向，但发展之后如果不用next节点
        保存next1节点的话，这个单链表就断开了
        所以需要pre和next两个节点
         */
        ListNode pre = null;
        ListNode next = null;
        /*
        当前节点不为空时始终进行循环，目的是让当前节点从next指向pre

         */
        while(head != null){
            /*
            先用next保存head下一个节点信息，保证单链表不会因为失去head节点的
        原节点而断裂
             */
            next = head.next;
            head.next = pre;

            pre = head;
            head = next;
        }
        return pre;
    }
}
