import java.util.ArrayList;

/**
 * @program:test_9.5
 * @author:Nine_odes
 * @description:
 * @create:2020-09-05 20:23
 **/
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class TestDemo3 {
    //输入一个链表，按链表从尾到头的顺序返回一个ArrayList
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null){
            return list;
        }

        ListNode pre = null;
        ListNode next = null;
        while(listNode != null){
            next = listNode.next;
            listNode.next = pre;

            pre = listNode;
            listNode = next;
        }
        while(pre != null){
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }
}
