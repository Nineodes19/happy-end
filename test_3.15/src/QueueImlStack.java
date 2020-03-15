import java.util.LinkedList;
import java.util.Queue;

/**
 * @program:test_3.15
 * @author:Nine_odes
 * @description:
 * @create:2020-03-15 10:40
 **/
public class QueueImlStack {
    private Queue<Integer> qu1;
    private Queue<Integer> qu2;
    private int size;
    private int[] elem;
    public  QueueImlStack(){
        this.qu1 = new LinkedList<>();
        this.qu2 = new LinkedList<>();
    }

    public void push(int x){
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else{
            qu1.offer(x);
        }
        this.size++;
    }

    public int pop(){
        //栈为空
        if(empty()){
            throw new RuntimeException("栈为空！");
        }
        int e = 0;
        if(!qu1.isEmpty()){
            //出size-1
            for (int i = 0; i < this.size-1; i++) {
                e = qu1.poll();
                qu2.offer(e);
            }
            e = qu1.poll();
        }else{
            for (int i = 0; i < this.size-1; i++) {
                e = qu2.poll();
                qu1.offer(e);
            }
            e = qu2.poll();
        }
        this.size--;
        return e;
    }

    public int top(){
        int e = 0;
        if(empty()){
            throw new RuntimeException("栈为空！");
        }

        if(!qu1.isEmpty()){
            //出size-1
            for (int i = 0; i < this.size; i++) {
                e = qu1.poll();
                qu2.offer(e);
            }
        }else{
            for (int i = 0; i < this.size; i++) {
                e = qu2.poll();
                qu1.offer(e);
            }
            e = qu2.poll();
        }
        return e;
    }

    public boolean empty(){

        return this.size == 0;
    }
}
