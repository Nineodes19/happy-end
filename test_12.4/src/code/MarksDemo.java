package code;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 13:42
 */
class Marks{
    int engMarks;
    int mathsMarks;
    int phyMarks;
}
public class MarksDemo {

    public static void main(String[] args) {
        Marks obj1 = new Marks();
        obj1.engMarks = 50;
        obj1.mathsMarks = 80;
        obj1.phyMarks = 90;

        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);
    }
}
