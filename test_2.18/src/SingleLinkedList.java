/**
 * @program:test_2.18
 * @author:Nine_odes
 * @description:单链表实现
 * @create:2020-02-18 19:11
 **/

//负责具体存储元素内容，以及存储下个节点地址【车厢】
//Node 类是SingleLinkedList来使用
class Node{
    private int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

//负责提供给用户使用，用户使用此类来存储元素【火车】
public class SingleLinkedList {
    private Node head;//头结点
    private int size;//长度
    private Node last;//尾节点
    private Node first;//永远指向头结点
    public void add(int data){
        addLast(data);
    }

    public void addFirst(int data){
        //产生新节点
        Node node = new Node(data,null);
        if(first == null){
            first = last = node;
            size ++;
            return;
        }
        node.next = first;
        first = node;
        size ++;
    }
    //尾插法
    public void addLast(int data){
        //生产一个新的节点
        Node node = new Node(data,null);
        //此时火车是空车厢
        if(last == null){
            last = first = node;
            size ++;
            return;
        }
        last.next = node;
        //last.setNext(node);
        last = node;
        size ++;
    }

    //遍历一个链表
    public void print(){
//        //从头结点开始一次遍历直到尾节点
//        Node temp = first;
//        while(temp != null){
//            System.out.print(temp.getData() +" ");
//            temp = temp.next;
//        }
        for(Node x = first; x != null; x = x.next){
            System.out.print(x.getData() + "、");
        }
    }

    //回文链表
    //原链表： 1 2 3 4 5 null
    //回文链表：5 4 3 2 1 null
    public Node reverse(){

    }
}

//public class SingleLinkedList {
//    private int data;//每个节点内部存储的元素值
//    //存储下一个节点地址
//    private SingleLinkedList next;
//
//    public SingleLinkedList(int data, SingleLinkedList next) {
//        this.data = data;
//        this.next = next;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public SingleLinkedList getNext() {
//        return next;
//    }
//
//    public void setNext(SingleLinkedList next) {
//        this.next = next;
//    }
//}
