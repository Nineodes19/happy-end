import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @program:test_9.25
 * @author:Nine_odes
 * @description:
 * @create:2020-09-25 23:33
 **/

class ListNode {
    int val;
    ListNode next;
}
public class TestDemo {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while(!stack.isEmpty()){
            ret.add(stack.pop());
        }
        return ret;
    }
}
