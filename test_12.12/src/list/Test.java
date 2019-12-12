package list;

/**
 * @program:test_12.12
 * @author: Nine_odes
 * @description:
 * @create:2019-12-12 19:21
 */
public class Test {
    public static void main(String[] args) {
        DoubleLinkedList s = new DoubleLinkedList();
        s.addFirst(1);
        s.addLast(2);
        s.addFirst(3);
        s.addFirst(3);
        s.addLast(4);
        s.addLast(3);
        //3124
        s.addIndex(1,10);
        s.set(1,20);

        s.print();
        System.out.println();
        s.remove(3);
        s.print();
        System.out.println();
        s.removeAll(3);
        s.print();
    }
}
