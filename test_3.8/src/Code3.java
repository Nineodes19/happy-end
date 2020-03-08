/**
 * @program:test_3.8
 * @author:Nine_odes
 * @description:
 * @create:2020-03-08 23:27
 **/

class ListNode1{
    int val;
    ListNode1 next = null;
    public ListNode1(int val){
        this.val = val;
    }
}
public class Code3 {
    public static ListNode1 test(ListNode1 list1, ListNode1 list2){
        ListNode1 node = new ListNode1(-1);
        ListNode1 temp = node;
        while(list1 != null && list2 != null){
            if(list1.val >= list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        if(list1 == null){
            temp = list2;
        }
        if(list2 == null){
            temp = list1;
        }

        return node.next;
    }
}
