import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program:test_9.2
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 23:21
 **/
public class TestDemo {
    public boolean hasCycle(ListNode head){
        Set<ListNode> set = new LinkedHashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
