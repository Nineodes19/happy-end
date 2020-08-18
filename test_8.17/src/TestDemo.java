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
    public static ListNode plusAB1(ListNode a, ListNode b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        ListNode p1 = a,p2 = b;
        ListNode head = new ListNode(-1);
        ListNode p = head;
        int sum = 0;//进位
        while(p1 != null || p2!=null || sum != 0){
            if(p1!=null){
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2!=null){
                sum += p2.val;
                p2 = p2.next;
            }
            p.next = new ListNode(sum % 10);
            sum /=10;
            p = p.next;
        }
        return head.next;
    }
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

    public static ListNode plusABS(ListNode a,ListNode b){
        ListNode resultHead = new ListNode(-1);
        ListNode resultCurrent = resultHead;
        int add =0;//进位的值
        while(a!= null || b != null){
            int aVal = a != null ? a.val : 0;
            int bVal = b != null ? b.val : 0;

            int sum = aVal+bVal+add;
            int nodeDigit = sum % 10;//当前位置的值
            add = sum / 10;//add为进位值
            resultCurrent.next = new ListNode(nodeDigit);
            resultCurrent = resultCurrent.next;//后移
            a = a!=null ? a.next : null;
            b = b!=null ? b.next:null;
        }
        return resultHead.next;

    }

}
