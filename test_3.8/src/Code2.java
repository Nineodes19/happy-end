/**
 * @program:test_3.8
 * @author:Nine_odes
 * @description:
 * @create:2020-03-08 23:19
 **/

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class Code2 {
    public ListNode Merge(ListNode listNode1,ListNode listNode2){
        ListNode node = new ListNode(-1);
        ListNode temp = node;
        while(listNode1 != null && listNode2 != null){
            if(listNode1.val >= listNode2.val){
                temp.next = listNode1;
                listNode1 = listNode1.next;
                temp = temp.next;
            }else{
                temp.next = listNode2;
                listNode2 =listNode2.next;
                temp = temp.next;
            }
        }

        if(listNode1 == null){
            temp = listNode2;
        }
        if(listNode2 == null){
            temp = listNode1;
        }
        return node.next;
    }
}
