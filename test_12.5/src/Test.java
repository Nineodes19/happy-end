import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @program:test_12.5
 * @author: Nine_odes
 * @description:
 * @create:2019-12-05 02:16
 */
public class Test {
//    public static void main(String[] args) {
//        int[] num = {1,2,3,4};
//        int[] newNum = Arrays.copyOf(num,3);
//        System.out.println(Arrays.toString(newNum));
//    }

//    public static void main(String[] args) {
//        int[] num = {1,2,3,4};
//        int[] newNum = new int[3];
//        System.arraycopy(num,2,newNum,1,2);
//        System.out.println(Arrays.toString(newNum));
//    }

//    public static void main(String[] args) {
//        //{1,2,3,4,0}-----> {1,0,2,3,4}将原数组的第二位往后移一位
//        int[] num = {1,2,3,4,0};
//        System.arraycopy(num,1,num,2,3);//拷贝一份往后走一位
//        num[1] = 0;
//        System.out.println(Arrays.toString(num));
//    }

//    public static void main(String[] args) {
//        int[] num = {1,2,3,4};
//        //{1,2,3,4}--->{1,3,4,0}
//        System.arraycopy(num,2,num,1,2);
//        num[3] = 0;
//        System.out.println(Arrays.toString(num));
//    }

//    public Test(){
//        System.out.print("1.");
//    }
//    {
//        System.out.print("2.");
//    }
//    static{
//        System.out.print("3.");
//    }
//
//    public static void main(String[] args) {
//        System.out.print("4.");
//        new Test();
//        new Test();
//        System.out.print("5.");
//    }

    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Test test = new Test("jige",18);
        System.out.println(test);
    }
}

