package string;

import java.util.*;

/**
 * @program:test_3.13
 * @author:Nine_odes
 * @description:
 * @create:2020-03-13 18:49
 **/
public class Code2 {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        ((LinkedList<Integer>) queue).add(10);
        //System.out.println(queue.poll());
        //System.out.println(queue.peek());
        System.out.println(queue);
    }
    public static void main2(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.pop();//出栈
        System.out.println(stack);
        System.out.println(stack.search(30));

    }
    public static void main1(String[] args) {
        Solution s = new Solution();

        System.out.println(s.generate(4));
    }
}

class Solution{
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows == 0){
            return ret;
        }

        ret.add(new ArrayList<Integer>());
        ret.get(0).add(1);//第一行的第一个数据写入
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            //拿到前一行的
            List<Integer> prevRow = ret.get(i-1);
            for (int j = 1; j < i; j++) {
                //公式[i,j] = [i-1,j]+[i-1,j-1];
                int num = prevRow.get(j-1) + prevRow.get(j);
                curRow.add(num);
            }
            curRow.add(1);

            ret.add(curRow);
        }

        return  ret;
    }
}
