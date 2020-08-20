import java.util.ArrayList;
import java.util.Stack;

/**
 * @program:test_8.20
 * @author:Nine_odes
 * @description:双栈排序
 * @create:2020-08-20 11:43
 **/

/**
 * 升序对栈进行排序，最多使用一个额外栈存放临时数据（额外栈的栈底必须是排序的最大值
 * 排序前：栈A:3,1,5,4,2
 * 空栈B：
 *
 * A：3,1,5
 * B：4,2
 * A出栈： A.pop()存入B  A再出栈，4，与B栈顶比较，B出栈（存储该元素）
 * 将 A.pop()入栈B，再入保存的B出栈元素。
 * A出栈： 5，将之与B的栈顶元素比较，大于则B出栈（保存元素）直到栈B为空
 */
public class TestDemo1 {
    public static ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        for (int n:numbers) {
            stackA.push(n);
        }

        while(!stackA.isEmpty()){

            if(stackB.isEmpty()){
                stackB.push(stackA.pop());
            }else{
                int temp = stackA.pop();
                while(!stackB.isEmpty() && stackB.peek() > temp){
                    stackA.push(stackB.pop());
                }
                stackB.push(temp);
            }
        }
        while(!stackB.isEmpty()){
            list.add(stackB.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,5,6,3};
        System.out.println(twoStacksSort(arr));
    }
}
