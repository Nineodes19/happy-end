package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:
 * @create:2019-12-11 17:36
 */
public class Test {
    public static void main(String[] args) {
        ListNode s = new ListNode(1);
        ListNode s1 = new ListNode(2);
        ListNode s2 = new ListNode(3);
        ListNode s3 = new ListNode(4);
        ListNode s4 = new ListNode(5);

        s.next = s1;
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        Solution19 link = new Solution19();
        System.out.println(link.removeNthFromEnd(s,2).val);
    }


}
