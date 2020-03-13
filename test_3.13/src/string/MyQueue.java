package string;

/**
 * @program:test_3.13
 * @author:Nine_odes
 * @description:
 * @create:2020-03-13 21:17
 **/

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MyQueue {
    public Node front;
    public Node rear;

    /**
     * 尾插法
     * @param data
     */
    public void offer(int data){
        Node node  = new Node(data);
        //是否第一次插入
        if(this.front == null){
            this.front = node;
            this.rear = node;
            return;//插入完成就走人了
        }
        this.rear.next = node;
        this.rear = node;
    }

    public int poll(){
        if(empty()){
            throw new RuntimeException("队列为空");
        }
        int data = this.front.val;
        this.front = this.front.next;
        return -1;
    }

    public int peek(){

        return -1;
    }

    public boolean empty(){
        if(this.front != null)
            return true;

        return false;
    }


}
