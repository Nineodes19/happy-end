/**
 * @program:test_2.18
 * @author:Nine_odes
 * @description:
 * @create:2020-02-18 19:13
 **/


public class Test {
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.addList(1);
        s.addList(2);
        s.addList(3);
    }
}
//public class Test {
//    public static void main(String[] args) {
//        //生产每个节点
//        SingleLinkedList s1 = new SingleLinkedList(1,null);
//        SingleLinkedList s2 = new SingleLinkedList(2,null);
//        SingleLinkedList s3 = new SingleLinkedList(3,null);
//        //将第二个节点挂接在第一个节点之后
//        s1.setNext(s2);
//        s2.setNext(s3);
//        //遍历链表
//        SingleLinkedList temp = s1;
//        while(temp != null){
//            System.out.println(temp.getData());
//            //继续向下一个节点走
//            temp = temp.getNext();
//        }
//    }
//}
