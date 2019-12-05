package array;

/**
 * @program:test_12.5
 * @author: Nine_odes
 * @description:
 * @create:2019-12-05 10:53
 */
public class Test {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        //System.out.println(myArray.size());
       myArray.add(4);
//        myArray.add(1,5);
      //  myArray.add(5,10);
        myArray.add(1,10);
        myArray.print();
    }
}
