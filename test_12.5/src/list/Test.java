package list;

/**
 * @program:test_12.5
 * @author: Nine_odes
 * @description:
 * @create:2019-12-05 20:34
 */
//public class Test {
//    public static void main(String[] args) {
//        SingleLinkedList s1 = new SingleLinkedList(1,null);
//        SingleLinkedList s2 = new SingleLinkedList(2,null);
//        SingleLinkedList s3 = new SingleLinkedList(3,null);
//
//        s1.setNext(s2);//将第二个节点挂接在第一个节点之后
//        s2.setNext(s3);
//
//        //如何遍历链表结构
//        SingleLinkedList temp = s1;
//        //不破坏原来链表的前提下引入一个额外的链表结构temp
//
//        while(temp != null){
//            System.out.println(temp.getData());
//            //继续向下一个节点走
//            temp = temp.getNext();
//        }
//
//        //s.add();
//    }
//}

public class Test{
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
//        s.addLast(1);
//        s.addLast(2);
//        s.addLast(3);
//        s.addLast(3);
//        s.addLast(4);
//        s.addLast(3);
//        s.addLast(5);
////        System.out.println(s.get(1));
////        s.set(2,10);
//        s.print();
//        System.out.println();
//        s.removeAll(3);
//        //s.remove(3);
//        s.reverse(s.getHead());
//        s.print();

        //System.out.println(s.contains(6));
//        s.addIndex(1,10);
//        s.addIndex(0,20);
//        s.print();
//        System.out.println();
//        System.out.println(s.getSize());
//        s.addIndex(7,30);
//
//        s.print();
//        System.out.println(s.getSize());

        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        s.print();
        System.out.println();
        s.reverse(s.getFirst());
        s.print();
    }
}