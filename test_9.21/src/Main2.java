/**
 * @program:test_9.21
 * @author:Nine_odes
 * @description:
 * @create:2020-09-21 20:25
 **/

import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class Main2 {
    public static ListNode solution (ListNode head, int m, int n) {
        // write code here
        //反转(m,n)区间的链表

        ListNode node = head;//需要返回的新链表
        ListNode cur = node;
        ListNode tem = head;
        int i = 0;
        for (; i < m; i++) {
            node.next = tem.next;
            tem = tem.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.val = 1;
        ListNode list1 = new ListNode();
        list1.val = 5;
        list.next = list1;
        ListNode list2 = new ListNode();
        list2.val = 9;
        list1.next = list2;
        ListNode list3 = new ListNode();
        list3.val = 13;
        list2.next = list3;
        ListNode list4 = new ListNode();
        list4.val =17;
        list3.next = list4;
        ListNode list5 = new ListNode();
        list5.val = 21;
        list4.next = list5;
        //System.out.println(list);
        System.out.println(solution(list,2,4));

    }
}
