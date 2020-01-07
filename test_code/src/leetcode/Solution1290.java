package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:二进制链表转整数
 * 给你一个单链表的引用节点，链表中的每个结点的值不是0就是1.
 * 已知此链表是一个整数数字的二进制表示形式。
 * 返回该链表所表示数字的十进制值
 * @create:2020-01-07 20:00
 */
public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        int countNode = 0;
        int number = 0;
        for (ListNode i = head; i != null ; i= i.next) {
            countNode++;
        }
        ListNode temp = head;
        while (temp != null){
            if(temp.val == 1){
                number+=(int)Math.pow(2,countNode-1);
            }
            temp = temp.next;
            countNode--;
        }
        return number;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(0);
        ListNode f = new ListNode(0);
        ListNode g = new ListNode(1);
        ListNode h = new ListNode(1);
        ListNode i = new ListNode(1);
        ListNode j = new ListNode(0);
        ListNode k = new ListNode(0);
        ListNode l = new ListNode(0);
        ListNode m = new ListNode(0);
        ListNode n = new ListNode(0);
        ListNode o = new ListNode(0);



        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;
        l.next = m;
        m.next = n;
        n.next = o;
        o.next = null;
        Solution1290 s = new Solution1290();
        System.out.println(s.getDecimalValue(a));
    }
}
