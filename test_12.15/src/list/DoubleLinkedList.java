package list;

import com.sun.webkit.dom.DocumentImpl;

import java.util.zip.DeflaterOutputStream;

/**
 * @program:test_12.15
 * @author: Nine_odes
 * @description:双向链表
 * @create:2019-12-15 09:02
 */

class DoubleNode{
    DoubleNode prev;
    int val;
    DoubleNode next;

    public DoubleNode(DoubleNode prev, int val, DoubleNode next) {
        this.prev = prev;
        this.val = val;
        this.next = next;
    }
}
public class DoubleLinkedList {
    private int size;
    public DoubleNode head;
    public DoubleNode last;

    public void addLast(int data){
        DoubleNode node = new DoubleNode(null,data,null);
        if(head == null){
            head = last = node;
            size++;
            return;
        }

        node.prev = last;
        last.next = node;
        last = node;
        size++;
    }

    public void addFirst(int data){
        DoubleNode node = new DoubleNode(null,data,null);
        if(last == null){
            head = last = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
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
            DoubleNode prev = node(index -1);
            DoubleNode node = new DoubleNode(prev,data,prev.next);
            prev.next = node;
            node.next.prev = node;
            size++;
        }
    }

    public DoubleNode node(int index){
        //若index在中间位置的左边
        if(index < (size>>1)){
            //从头向后遍历
            DoubleNode x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        }else{
            //从后向前遍历
            DoubleNode x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    private boolean rangeCheck(int index){
        if(index < 0 || index > size){
            System.out.println("索引非法！");
            return false;
        }
        return true;
    }
    public int get(int index){
        if(rangeCheck(index)){
            return node(index).val;
        }
        return -1;
    }

    public void remove(int data){
        DoubleNode x = head;
        while(x != null){
            if(x.val == data){
                //删除x
                unlink(x);
                break;
            }else{
                x =x.next;
            }
        }
    }

    public void removeAll(int data){
        DoubleNode x = head;
        while(x != null){
            if(x.val == data){
                //删除x
                DoubleNode next = x.next;
                unlink(x);
                x = next;
            }else{
                x = x.next;
            }
        }
    }

    public void set(int index, int data){
        if(rangeCheck(index)){
            node(index).val = data;
            return;
        }
    }

    public void print(){
        DoubleNode node = head;
        while(node != null){
            System.out.print(node.val + "、 ");
            node = node.next;
        }
    }

    public int getSize(){
        return size;
    }

    private void unlink(DoubleNode x){
        DoubleNode prev = x.prev;
        DoubleNode next = x.next;
        if(prev == null){
            //x是头结点
            head = head.next;
            //x.prev = null;
        }else{
            prev.next = next;
            x.prev =null;
        }
        if(next == null){
            //x是尾结点
            last = last.prev;
        }else{
            next.prev = prev;
            x.next = null;
        }
        //x.val = 0;
        size--;
    }
}
