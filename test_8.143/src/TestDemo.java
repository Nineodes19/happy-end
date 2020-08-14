/**
 * @program:test_8.143
 * @author:Nine_odes
 * @description:访问单个节点的删除
 * @create:2020-08-14 21:05
 **/

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class TestDemo {
    public boolean removeNode(ListNode pNode){
        if(pNode == null || pNode.next == null){
            return false;
        }
        pNode.val = pNode.next.val;
        pNode.next = pNode.next.next;
        return true;
    }
}
