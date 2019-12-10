package code1;

/**
 * @program:test_12.10
 * @author: Nine_odes
 * @description:单链表
 * @create:2019-12-10 14:49
 */

class Node{
    private int data;
    Node next;
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}

public class SingleLinkedList {
    private int size;
    private Node last;
    private Node first;

    public Node getFirst(){
        return first;
    }

    /**
     * 头插法
     * @param data
     */
    public void addFirst(int data){
        Node node = new Node(data,null);//产生一个新的节点
        if(first ==null){
            first = last = node;
            size++;
            return;
        }
        node.next = first;
        first = node;
        size++;
    }

    public void addLast(int data){
        Node node = new Node(data,null);
        if(last == null){
            last = first = null;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    public void addIndex(int index,int data){
        if(index < 0 || index > size){
            System.out.println("索引非法！");
            return;
        }else if(index == 0){
            addFirst(data);
        }else if(index == size){
            addLast(data);
        }else{
            //在中间位置插入新节点
            Node node = new Node(data,null);
            //找到前驱节点
            Node prev = getIndexNode(index-1);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    public Node getIndexNode(int index){
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 根据用户传入的索引值获取节点值
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

    public boolean rangCheck(int index){
        if(index < 0 || index > size){
            System.out.println("索引非法！");
            return false;
        }
        return true;
    }


    /**
     * 查询链表中是否有指定的节点内容
     * @param data
     * @return
     */
    public boolean contains(int data){
        Node temp = first;
        while(temp != null){
            if(temp.getData() == data){
                System.out.println("找到元素！");
                return true;
            }
            temp= temp.next;
        }
        System.out.println("没有指定元素！");
        return false;
    }

    public void remove(int data){
//        Node dummyHead = new Node(data-1,null);
//        dummyHead.next = first;
//        Node temp = dummyHead;
//        while(temp.next != null) {
//            if (temp.next.getData() == data) {
//                temp.next = temp.next.next;
//                size--;
//                break;
//            }else{
//                temp = temp.next;
//            }
//        }
//        first = dummyHead.next;

        //判断要删除的是不是头结点
        if(first.getData() == data){
            first = first.next;
            size--;
            return;
        }else{
            Node prev = first;
            while(prev.next != null){
                if(prev.next.getData() == data){
                    prev.next = prev.next.next;
                    size--;
                    return;
                }else{
                    prev = prev.next;
                }
            }
        }
    }

    public void removeAll(int data){
//        while(first != null && first.getData() == data){
//            first = first.next;
//            size--;
//        }
//
//        if(first == null){
//            return;
//        }else{
//            //头结点不是要删除的节点，并且链表中海油待删除的元素
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

        Node dummyhead = new Node(data-1,null);
        dummyhead.next = first;
        Node prev = dummyhead;
        while(prev.next != null){
            if(prev.next.getData() == data){
                prev.next = prev.next.next;
                size--;
            }else{
                prev = prev.next;
            }
        }
        first = dummyhead.next;
    }

    /**
     * 将指定index位置的值修改为data
     * @param index
     * @param data
     */
    public void set(int index ,int data){
        if(rangCheck(index)){
            Node node = getIndexNode(index);
            node.setData(data);
        }
    }

    public void print(){
//        Node temp = first;
//        while(temp != null){
//            System.out.println(temp.getData());
//            temp = temp.next;
//        }

        for (Node x = first; x != null ; x = x.next) {
            System.out.print(x.getData() + "、 ");
        }
    }

    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = new Node(head.next.getData(),null);
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
}
