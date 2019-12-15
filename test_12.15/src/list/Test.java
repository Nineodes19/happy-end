package list;

/**
 * @program:test_12.15
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 10:30
 */
public class Test {
    public static void main(String[] args) {
        DoubleLinkedList d = new DoubleLinkedList();
        d.addLast(1);
        d.addLast(2);
        d.addFirst(3);
        d.addFirst(4);
        //输出：4 3 1 2

        d.addIndex(1,10);
        //输出：4 10 3 1 2
        d.set(1,20);//4 20 3 1 2
        d.remove(20);

        d.print();
    }
}
