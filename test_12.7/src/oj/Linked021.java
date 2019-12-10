package oj;

import java.util.List;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:合并两个有序链表
 * @create:2019-12-09 20:52
 */



public class Linked021 {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode s = new ListNode(0);
//        ListNode prev = s;//prev暂存s
//        while(l1 != null && l2 != null){
//            if(l1.val <= l2.val){
//                prev.next = l1;
//                l1 = l1.next;
//            }else{
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        if(l1 == null && l2 != null){
//            prev.next = l2;
//        }
//        if(l1 != null && l2 == null){
//            prev.next =l1;
//        }
//
//        return s.next;
//    }


//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if(l1 == null){
//            return l2;
//        }
//        if(l2 == null){
//            return l1;
//        }
//        //此时l1和l2均不为空
//        //遍历l1 与l2 的节点
//        //产生一个新的链表l3
//
//        ListNode newLast= null;
//
//        ListNode newHead = newLast;
//        while(l1 != null && l2 != null){
//            if(l1.val <= l2.val){
//                ListNode node = new ListNode(l1.val);
//                //此时node为l3的第一个节点
//                if(newHead == null){
//                    newHead = newLast = node;
//                    l1 = l1.next;
//                }else{
//                    newLast.next = node;
//                    newLast = node;
//                    l1 = l1.next;
//                }
//            }else{
//                ListNode node = new ListNode(l2.val);
//                if(newHead == null){
//                    newHead = newLast = node;
//                    l2 = l2.next;
//                }else{
//                    newLast.next = node;
//                    newLast = node;
//                    l2 = l2.next;
//                }
//            }
//        }
//        //查看此时l1和l2谁还有剩余元素，将剩余元素尾插到l3
//        while(l1!= null){
//            ListNode node = new ListNode(l1.val);
//            newLast.next = node;
//            newLast = node;
//            l1 =l1.next;
//        }
//        while (l2 != null){
//            ListNode node = new ListNode(l2.val);
//            newLast.next = node;
//            newLast = node;
//            l2 = l2.next;
//        }
//        return newHead;
//    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode newHead = null;

        ListNode newLast = newHead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ListNode node = new ListNode(l1.val);//node是l3 的第一个节点
                if(newHead == null){
                    newHead = newLast = node;
                    l1 = l1.next;
                }else{
                    newLast.next = node;
                    newLast = node;
                    l1 = l1.next;
                }
            }else{
                ListNode node = new ListNode(l2.val);
                if(newHead == null){
                    newHead = newLast = node;
                    l2 = l2.next;
                }else{
                    newLast.next = node;
                    newLast = node;
                    l2 = l2.next;
                }
            }
        }
        while(l1 != null){
            ListNode node = new ListNode(l1.val);
            newLast.next = node;
            newLast = node;
            l1 = l1.next;
        }
        while(l2 != null){
            ListNode node = new ListNode(l2.val);
            newLast.next = node;
            newLast = node;
            l2 = l2.next;
        }
        return newHead;
    }
}
