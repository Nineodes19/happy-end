package array;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import list.SingleLinkedList;

/**
 * @program:test_12.5
 * @author: Nine_odes
 * @description:
 * @create:2019-12-05 10:53
 */
//public class Test {
//    public static void main(String[] args) {
//        MyArray myArray = new MyArray(3);
//        myArray.add(1);
//        myArray.add(2);
//        myArray.add(3);
//        //System.out.println(myArray.size());
//       myArray.add(4);
////        myArray.add(1,5);
//      //  myArray.add(5,10);
//        myArray.add(1,10);
////        System.out.println(myArray.get(2));
////        System.out.println(myArray.contains(11));
////        System.out.println(myArray.find(4));
////        myArray.set(1,20);
//        //myArray.remove(10);
//        myArray.add(4,20);
//        myArray.print();
//        myArray.clear();
//        myArray.print();
//    }
//}

public class Test{
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.print();
    }
}