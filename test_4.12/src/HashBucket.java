/**
 * @program:test_4.12
 * @author:Nine_odes
 * @description:
 * @create:2020-04-12 10:50
 **/
public class HashBucket {
    static class Node {
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public Node[] array;//单链表的头结点的引用
    public int usedSize;//记录当前已经存放了多少个数据了   负载因子：哈希表的个数/哈希表的长度

    public HashBucket() {
        this.array = new Node[8];
        this.usedSize = 0;
    }

    //put方法
    public void put(int key,int value){
        int index = key % this.array.length;//下标index
        //遍历index下标的单链表，是否存在key
        //如果存在，更新value值
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if(cur.key == key){
                cur.value = value;
                return;
            }
        }

        //说明没有当前key

        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
        if(loadFactor() >= 0.75){
            //扩容
            resize();
            //扩容之后，要注意原来的元素需要进行重新哈希
        }

    }

    private double loadFactor(){
        return usedSize*1.0/array.length;
    }

    private void resize(){
        Node[] newArray = new Node[array.length*2];
        //1.遍历原来的数组，把原来的数据重新哈希到新的数组当中

        for (int i = 0; i < array.length; i++) {
            Node curnext;
            for(Node cur = array[i]; cur != null; cur = curnext){
                curnext = cur.next;
                int index = cur.key % newArray.length;//新的index下标
                //头插到新的数组的index的位置
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        this.array = newArray;

    }

    public int getValue(int key){
        int index = key %array.length;
        for(Node cur = array[index]; cur != null; cur = cur.next){
            if(cur.key == key){
                return cur.value;
            }
        }
        return -1;
    }
}
