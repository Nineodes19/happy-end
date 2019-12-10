package list;

/**
 * @program:test_12.5
 * @author: Nine_odes
 * @description:单链表实现
 * @create:2019-12-05 20:29
 */

//负责提供给用户使用， 用户使用此类来存储元素
//public class SingleLinkedList {
//    //每个节点内部存储的元素值
//    public  int data;
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


//负责存储元素内容，以及存储下个节点地址
    //Node类是SingleLinkedList使用
public class Node{
    private int data;
    public Node next;


    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getFirst(){
        return 0;
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
