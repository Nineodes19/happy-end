/**
 * @program:test_10.9
 * @author:Nine_odes
 * @description:
 * @create:2020-10-09 23:06
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while(list1!= null && list2 != null){
            if(list1.val <= list2.val){
                head.next = list1;
                head = list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            head.next = list1;
        }
        if(list2 != null){
            head.next = list2;
        }
        return root.next;
    }
}
