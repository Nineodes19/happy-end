/**
 * @program:test_4.5
 * @author:Nine_odes
 * @description:
 * @create:2020-04-05 11:05
 **/



public class TestLinkNoGeneric<T > {



    public static<T extends Comparable<T>> TestLink<T>.Node mergeList(TestLink<T>.Node headA,
                                          TestLink<T>.Node headB){

        TestLink<T> tTestLink = new TestLink<>();
        TestLink<T> .Node newHead = tTestLink.new Node();

        while(headA.next != null && headB.next!=null){
            if(headA.data.compareTo(headB.data) > 0){
                dummyhead.next = headA;
                headA = headA.next;
            }
            dummyhead.next = headB;
            headB = headB.next;
        }

        if(headA.next == null){
            dummyhead.next = headB;
        }
        if(headB.next == null){
            dummyhead.next = headB;
        }

        return dummyhead.next;
    }

}
