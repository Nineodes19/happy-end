package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 11:43
 */
public class Solution160_2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB){
            //当sizeA！= sizeB时，令sizeA1== sizeB1== sizeA+ sizeB；
            pA = (pA == null)?headB : pA.next;
            pB = (pB == null)?headA : pB.next;
        }
        return pB;
    }
}
