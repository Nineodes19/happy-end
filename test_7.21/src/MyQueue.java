/**
 * @program:test_7.21
 * @author:Nine_odes
 * @description:
 * @create:2020-07-22 11:56
 **/
public class MyQueue {
    static class Node{
        int value;
        Node next;
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
        public Node(int value){
            this(value,null);
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;
    public void offer(int v){
        Node node = new Node(v);
        if(tail == null){
            head = node;
        }else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public int poll(){
        if(size == 0){
            throw new RuntimeException("队列为空，出队失败！！");
        }
        Node oldHead = head;

        //队列出队，将head往后退一位
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return oldHead.value;
    }
    public int peek(){
        if(size == 0){
            throw new RuntimeException("队列为空！");
        }
        return head.value;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public static void main(String[] args) {

    }
}
