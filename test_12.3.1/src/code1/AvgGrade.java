package code1;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:array
 * @create:2019-12-03 16:45
 */
public class AvgGrade {
    public static void main(String[] args) {
        int total = 0;
        int[] s = new int[]{75,69,80,85,93,97,79,77,68,90};//定义数组变量s并赋值
        double avg = 0;
        for (int i = 0; i <10 ; i++) {
            total+=s[i];
        }
        avg = total/10.0;
        System.out.println("The average score is:"+ avg);
    }
}
