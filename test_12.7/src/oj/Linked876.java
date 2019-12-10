package oj;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:返回链表的中间节点
 * @create:2019-12-09 19:54
 */


public class Linked876 {
    public ListNode middleNode(ListNode head) {
        //快慢指针
        if(head == null || head.next == null){
            return head;
        }
        ListNode low = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            low = low.next;
            fast = fast.next.next;
        }
        //此时low一定在中间位置
        return low;






//        //第一次遍历
//        int n = 0;
//        ListNode temp = head;
//        while(temp!=null) {
//            temp = temp.next;
//            n++;
//        }
//        temp = head;
//        for (int i = 0; i < n/2; i++) {
//            temp = temp.next;
//        }
//        return temp;


//        if(head == null){//链表为空
//            return null;
//        }
//        ListNode key1 = head;
//        ListNode key2 = head;
//        while(key2 != null && key2.next != null){
//                key1 = key1.next;
//                key2 = key2.next.next;
//        }
//        return key1;


//        //第一次遍历取得当前链表的节点个数
//        int n  = 0;
//        ListNode temp = head;
//        while(temp != null){
//            temp = temp.next;
//            n++;
//        }
//        //第二次遍历，走n/2个长度
//        temp = head;
//        for (int i = 0; i < n/2; i++) {
//            temp = temp.next;
//        }
//        return temp;



    }
}
