/**
 * @program:test_12.17
 * @author: Nine_odes
 * @description:
 * @create:2019-12-17 19:24
 */

class Marks{
    int engMarks;
    int mathMarks;
    int phyMarks;
}
public class MarksDemo {
    public static void main(String[] args) {
        Marks mark = new Marks();
        mark.engMarks = 50;
        mark.mathMarks = 123;
        mark.phyMarks = 87;
        System.out.println(mark.engMarks);
        System.out.println(mark.mathMarks);
        System.out.println(mark.phyMarks);
    }
}
