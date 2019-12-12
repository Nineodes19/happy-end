package list;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

/**
 * @program:test_12.12
 * @author: Nine_odes
 * @description:双向链表的实现
 * @create:2019-12-12 18:50
 */

class DoubleNode{
    int data;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(int data, DoubleNode next, DoubleNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode last;
    private int size;

    public void addFirst(int data){
        DoubleNode node = new DoubleNode(data,null,null);
        if(head == null){
            head = last = node;
            size++;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }
    }

    public void addLast(int data){
        DoubleNode node = new DoubleNode(data,null,null);
        if(last == null){
            last = head = node;
            size++;
        }else{
            last.next = node;
            node.prev = last;
            last = node;
            size++;
        }
    }

    public void addIndex(int index,int data){
        if(index  < 0 || index > size){
            System.out.println("索引非法！");
            return;
        }else if(index == 0){
            addFirst(data);
        }else if(index == size){
            addLast(data);
        }else {
            //先找到待插入位置的前驱
            DoubleNode prev = node(index-1);
            DoubleNode node = new DoubleNode(data,prev.next,prev);
            prev.next = node;
            node.next.prev = node;
            size++;

            //            //在中间位置插入
//            DoubleNode node = new DoubleNode(data,null,null);
//            //取得node的前一个节点
//            DoubleNode prev1 = node(index-1);
//            node.next = prev1.next;
//            node.prev = prev1;
//            prev1.next = node;
//            node.next.prev = node;
//            size++;
        }
    }

    /**
     * 取得index位置的节点
     * @param index
     * @return
     */
    public DoubleNode node (int index){
        DoubleNode x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    /**
     * 获得index位置的元素
     * @param index
     * @return
     */
    public int get(int index){
        DoubleNode x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x.data;
    }

    /**
     * 修改index位置的元素
     * @param index
     * @param data
     */
    public void set(int index,int data){
        DoubleNode node = node(index);
        node.data = data;
    }

    /**
     * 删除第一个出现的data元素
     * @param data
     */
    public void remove(int data){
        DoubleNode x = head;
        while(x!=null){
            if(x.data == data){
                //删除x
                unlink(x);
                break;
            }else {
                x = x.next;
            }
        }
    }

    /**
     * 删除所有出现的data元素
     * @param data
     */
    public void removeAll(int data){
        DoubleNode x = head;
        while(x!=null){
            if(x.data == data){
                //删除x
                unlink(x);

            }else {
                x = x.next;
            }
        }
    }

    public void unlink(DoubleNode x){
        DoubleNode prev = x.prev;
        DoubleNode next = x.next;

        //先处理前驱节点
        if(x.prev == null){
            head = head.next;
        }else{
            prev.next = next;
            x.prev = null;
        }
        if(x.next == null){
            last = last.next;
        }else{
            next.prev = x.prev;
            x.next = null;
        }
        x.data = 0;
        size--;
    }
    public void print(){
        DoubleNode x = head;
        for (int i = 0; i < size; i++) {
            System.out.print(x.data+"、 ");
            x = x.next;
        }
    }

}
