package link;

/**
 * @program:test_12.7
 * @author: Nine_odes
 * @description:单链表实现
 * @create:2019-12-07 12:02
 */

class Node{
    private int data;//存储元素内容
    public Node next;//存放下个节点的地址

    //构造函数
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


public class SingLinked {

    private int size;//存储链表的实际长度
    private Node last;//永远指向最后一个节点
    private Node first;//永远指向第一个节点

    public int getSize() {
        return size;
    }

    public Node getLast() {
        return last;
    }

    public Node getFirst() {
        return first;
    }

    //头插法
    public void addFirst(int data){
        Node node = new Node(data,null);//建立新节点，存储要插入的数据
        if(first == null){
            first = last = node;//当首节点为空时，首节点和尾节点都是新节点data
            size++;
            return;
        }
        node.next = first;//新节点的下一个节点头节点，将新节点插在头节点之前
        first = node;//将指向第二个节点的first指向新节点node
        size++;//链表长度++
    }

    //尾插法
    public void addLast(int data){
        Node node = new Node(data,null);//建立要插入的新节点，数据为data，下一位为空
        if(last == null){
            //此时没有节点
            last = first = node;
            size++;
            return;
        }
        //此时已经有节点了
        //要挂载当前的新节点，让最后一个节点的next指向当前新节点
        last.next = node;
        last = node;
        size++;

    }

    //任意位置插入，第一个数据节点为0号下标
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
        }else{
            //在中间位置插入
            //在插入前产生新的节点
            Node newnode = new Node(data,null);
            //找到需要插入位置的前驱节点
            Node prev = getIndexNode(index - 1);
            //将新节点插入到前驱节点的后方
            newnode.next = prev.next;
            prev.next = newnode;
            size++;
        }
    }

    /**
     * 获取index位置的链表节点
     * @param index
     * @return
     */
    public Node getIndexNode(int index){
        Node temp = first;//temp指向头结点
        //将链表遍历至index位置，然后返回
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    //查找是否包含关键字data在单链表中
    public boolean contains(int data){
        //遍历链表
        Node temp = first;
        while (temp != null){
            if(temp.getData() == data){
                System.out.println("找到元素！");
                return true;
            }
            return false;
        }
        return false;
    }

    //删除第一次出现关键字为data的节点
//    public void remove(int data){
//        //1.要删除的data是头结点
//        if(first.getData() == data){
//            first = first.next;
//            size--;
//        }else{
//            //需要找到删除节点的前驱节点
//            Node prev = first;
//            while (prev.next != null){
//                if(prev.next.getData() == data){
//                    //此时prev恰好是需要删除节点的前驱节点
//                    prev.next = prev.next.next;
//                    size--;
//                    return;
//                }else{
//                    prev = prev.next;
//                }
//            }
//        }
//    }

    public void remove(int data){
        //虚拟头结点
        Node dummyHead = new Node(data - 1, null);//建立虚拟节点
        dummyHead.next = first;//将虚拟节点插到首节点之前
        Node temp = dummyHead;//key指针指向虚拟节点（不用单独判断头结点）
        //没有遍历到尾结点
        while(temp.next != null){
            if(temp.next.getData() == data){
                temp.next = temp.next.next;//temp直接指向要删除元素的下一位
                size--;
                return;
            }else {
                temp = temp.next;//没有找到待删除元素，继续向后遍历
            }
        }
    }

    public void removeAll(int data){
//        //虚拟头节点
//        Node dummuHead = new Node(data - 1.null);
//        dummuHead.next = first;
//        Node temp = dummuHead;
//        while(temp.next != null){
//            if(temp.next.getData() == data){
//                temp.next = temp.next.next;
//                size--;
//            }else{
//                temp = temp.next;
//            }
//        }


        while(first != null && first.getData() == data){
            first = first.next;
            size --;
        }//此时头结点不是要删除的节点
        if(first == null){
            return;
        }else{
            //此时头结点一定不是要删除的节点，而且链表中还有节点
            Node prev = first;
            while(prev.next != null){
                if(prev.next.getData() == data){
                    prev.next = prev.next.next;
                    size--;
                }else{
                    prev = prev.next;
                }
            }
        }
    }
    //得到单链表的长度
    public int size(){
        return size;
    }

    public void display(){
        Node temp = first;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.getData()+ "、 ");
            temp = temp.next;
        }
    }

    //清空链表
    public void clear(){
        Node node = new Node(0,null);
        while(node!=null) {
            first = node;
            first = first.next;
        }
    }
}
