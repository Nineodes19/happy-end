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
class Node{
    private int data;
    public Node next;

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
//负责提供给用户使用， 用户使用此类来存储元素
public class SingleLinkedList {
    //头结点位置
    private Node head;
    private int size;

    //永远指向最后一个节点
    private Node last;
    private Node first;

    public  void add(int data){
        addLast(data);
    }

    //头插
    public void addFirst(int data){
        Node node= new Node(data,null);
        if(first == null){
            first = last = node;
            size++;
            return;
        }
        node.next = first;
        first = node;
        size++;
    }

    //尾插
    public void addLast(int data) {
        //产生一个新节点
        Node node = new Node(data, null);
        //此时没有节点
        if(last == null){
            last = first = node;
            size++;
            return;
        }

        //此时已经有节点
        //要挂载当前新节点，让最后一个节点的next指向当前新节点
        last.next= node;
        last = node;
        size ++;
    }

    //遍历一个链表
    public void print(){
        //从头节点开始依次遍历，直到尾节点
        Node temp = first;
        while(temp != null){
            System.out.print(temp.getData() +"、 ");
            //继续向下一个节点遍历
            temp = temp.next;
        }
    }


}

