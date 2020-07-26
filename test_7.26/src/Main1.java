/**
 * @program:test_7.26
 * @author:Nine_odes
 * @description:
 * @create:2020-07-26 21:57
 **/
public class Main1 {
    private static class ListNode{
        private char val;
        private ListNode left;
        private ListNode right;
        public ListNode(char val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    private static ListNode createTree(String str,int[] index){
        char ch = str.charAt(index[0]);
        if(ch == '#'){
            return null;
        }else{
            ListNode root = new ListNode(ch);
        }
    }
}
