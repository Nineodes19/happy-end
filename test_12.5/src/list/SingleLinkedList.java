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
//负责提供给用户使用， 用户使用此类来存储元素
public class SingleLinkedList {
    //头结点位置
    private Node head;
    private int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    //永远指向最后一个节点
    private Node last;
    private Node first;

    public Node getFirst() {
        return first;
    }

    public int getSize(){
        return size;
    }
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

    /**
     * 在链表任意索引位置插入新的节点值data
     * @param index
     * @param data
     */
    public void addIndex(int index,int data){

        if(index < 0 || index > size){
            System.out.println("索引非法！");
            return;
        }else if(index == size){
            //尾插
            addLast(data);
        }else if(index == 0){
            //头插
            addFirst(data);
        }
        else{
            //在中间位置插入
            //在插入之前产生新节点
            Node newnode = new Node(data,null);
            //找到需要插入的前驱节点
            Node prev = getIndexNode(index-1);
            //将新节点插到前驱节点的后方
            newnode.next = prev.next;
            prev.next = newnode;
            size ++;
        }

    }

    /**
     * 删除第一个值为data的节点
     * @param data
     */
    public void remove(int data){
//        if(first.getData() == data){
//            first = first.next;
//            size --;
//        }else{
//            //需要找到待删除节点的前驱节点
//            Node prev = first;
//            while(prev.next != null){
//                if(prev.next.getData() == data){
//                    //此时prev恰好是待删除节点的前驱节点
//                    prev.next = prev.next.next;
//                    size--;
//                    return;
//                }else{
//                    prev = prev.next;
//                }
//            }
//        }



        //虚拟头结点
        Node dummyHead = new Node(data - 1,null);
        dummyHead.next = first;
        Node temp = dummyHead;
        while(temp.next != null){
            if(temp.next.getData() == data){
                temp.next = temp.next.next;
                size--;
                return;
            }else{
                temp = temp.next;
            }
        }
    }

//    public void removedigui(int data){
//        Node node =first;
//        if(node.getData() == data){
//            node.next = node.next.next;
//            size--;
//            return;
//        }
//
//    }

    /**
     * 删除所有值为data的节点
     * @param data
     */
    public void removeAll(int data){
//        while(first !=null && first.getData() == data){
//            first = first;
//            size--;
//        }
//        //此时头结点一定不是要删除的节点
//        if(first == null){
//            return;
//        }else{
//            //此时头结点一定不是要删除的节点并且链表中还有待删除的节点
//            Node prev = first;
//            while(prev.next != null){
//                if(prev.next.getData() == data){
//                    prev.next = prev.next.next;
//                    size--;
//                }else{
//                    prev = prev.next;
//                }
//            }
//        }

        //虚拟头结点
        Node dummyHead = new Node(data-1,null);
        dummyHead.next = first;
        Node prev =dummyHead;
        while(prev.next != null){
            if(prev.next.getData() == data){
                prev.next = prev.next.next;
                size--;
            }else{
                prev = prev.next;
            }
        }
        first = dummyHead.next;
    }

    /**
     * 根据用户传入的index值获取索引
     * @param index
     * @return
     */
    public int get(int index){
        if(rangCheck(index)){
            Node node = getIndexNode(index);
            return node.getData();
        }
        return -1;
    }

    /**
     * 查询链表中是否有指定内容
     * @param data
     * @return
     */
    public boolean contains(int data){
        //遍历链表
        Node temp = first;
        while(temp != null){
            if(temp.getData() == data){
                System.out.println("找到元素！");
                return true;
            }
            return false;
        }
        return false;
    }
    /**
     * 将index位置的值改成index
     * @param index
     * @param data
     */
    public void set(int index,int data){

        if(rangCheck(index)){
            Node prev = getIndexNode(index);
            prev.setData(data);
        }
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

    //将原链表遍历一次，边遍边头插新的链表
    public Node reverse(Node head){
        //判断边界
        if(head == null || head.next == null){
            return head;
        }
        //当前链表不为空，遍历当前链表，产生新节点头插另一个列表
        Node newHead = new Node(head.getData(),null);
        //遍历原链表
        while(head.next != null){
            //产生新节点
            Node node = new Node(head.next.getData(),null);
            //将新节点头插到新链表头部
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }

    //根据用户传入的index值取得对应的节点
//    private Node getIndexNode(int index){
//        //从头结点开始走index步找到对应节点
//        Node temp = first;
//        //1-->2-->3-->4-->5
//        //index = 3
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//        }
//        return temp;
//    }

    /**
     * 获取index位置的链表节点
     * @param index
     * @return 返回index位置的节点
     */
    private Node getIndexNode(int index){
        Node temp = first;//temp指向头结点
        for (int i = 0; i < index; i++) {
            temp = temp.next;//指向下一个节点
        }
        return temp;
    }

    public boolean rangCheck(int index){
        if(index < 0 || index > size){
            System.out.println("索引非法！");
            return false;
        }
        return true;
    }

//    public Node reverse(Node head){
//        //判断边界
//        if(head == null || head.next == null){
//            return head;
//        }
//        //当前链表不为空，遍历当前链表，产生新节点头插另一个列表
//        Node newHead = new Node(head.getData(),null);
//        //遍历原链表
//        while(head.next != null){
//            //产生新节点
//            Node node = new Node(head.next.getData(),null);
//            //将新节点头插到新链表头部
//            node.next = newHead;
//            newHead = node;
//            head = head.next;
//        }
//        return newHead;
//    }

}

