package code4;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 19:08
 */
class Marks{
    int engMarks;
    int mathMarks;
    int phyMarks;
}
class Emp{
    public static double salary;
    public static String name = "Harsh";
}
public class MarksDemo {
    public static int maxinum(int[] numbers){
        int max = numbers[0];
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args){

//        for(int i = 5; i != 0; i -= 2){
//            System.out.println(i);
//        }
        int x = 5;
        while(x == 5){
            System.out.println("In the loop");
            x--;
        }


//        {
//            int[] marks = {125,132,95,116,110};
//            int high = maxinum(marks);
//            System.out.println("The highest score is " + high);
//        }



//        Marks b = new Marks();
//        b.engMarks= 100;
//        b.mathMarks = 120;
//        b.phyMarks = 89;
//        System.out.println(b.engMarks);
//        System.out.println(b.mathMarks);
//        System.out.println(b.phyMarks);
//        Emp.salary=1000.;
//        System.out.println(Emp.name +"'s average salary:" + Emp.salary);

//        String array[] = {"RON","HARRY","HERMOINE"};
//        for(String x:array){
//            System.out.println(x);
//        }



    }
}
