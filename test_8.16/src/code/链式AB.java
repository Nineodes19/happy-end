package code;

/**
 * @program:test_8.16
 * @author:Nine_odes
 * @description:
 * @create:2020-08-16 23:01
 **/
public class 链式AB {
    public ListNode plusAB(ListNode a,ListNode b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        ListNode node = new ListNode(-1);
        ListNode temp = node;
        while(a!= null && b != null){
            temp.next = new ListNode(a.val+b.val);
            temp = temp.next;
            a = a.next;
            b = b.next;
        }
        if(a != null){
            temp.next = a;
        }
        if(b != null){
            temp.next = b;
        }
        return node.next;
    }
}
