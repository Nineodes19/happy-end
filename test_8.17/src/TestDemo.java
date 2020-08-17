import java.util.List;

/**
 * @program:test_8.17
 * @author:Nine_odes
 * @description:
 * @create:2020-08-17 23:25
 **/

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class TestDemo {
    public static ListNode plusAB(ListNode a, ListNode b){
        ListNode resultHead = new ListNode(-1);
        ListNode resultCurrent = resultHead;
        int addToNextDigit = 0;
        while(a != null || b != null){
            int aVal = a != null ? a.val:0;
            int bVal = b != null ? b.val:0;

            int sum = aVal+bVal+addToNextDigit;
            int nodeDigit = sum % 10;
            addToNextDigit = sum / 10;
            resultCurrent.next = new ListNode(nodeDigit);
            resultCurrent = resultCurrent.next;
            a = a!=null ? a.next : null;
            b = b != null ? b.next:null;
        }
        return resultHead.next;
    }


}
