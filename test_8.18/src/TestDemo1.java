import java.util.ArrayList;
import java.util.Stack;

/**
 * @program:test_8.18
 * @author:Nine_odes
 * @description:判断链表是否回文
 * @create:2020-08-18 20:23
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class TestDemo1 {
    public boolean isPalindrome2(ListNode pHead) {
        String str = "";
        String str1 = "";
        while(pHead != null){
            str = str + String.valueOf(pHead.val);
            str1 = String.valueOf(pHead.val) + str1;
            pHead = pHead.next;
        }
        if(str.equals(str1)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPalindrome1(ListNode pHead){
        ListNode fast = pHead;
        ListNode slow = pHead;
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        while(slow != null){
            if(stack.pop() != slow.val){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        if(pHead == null){
            return false;
        }
        ListNode node = pHead;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        int N = list.size();
        for (int i = 0; i < N / 2; i++) {
            if(list.get(i) != list.get(N-i-1)){
                return false;
            }
        }
        return true;
    }
}
