import javafx.geometry.HPos;
import org.omg.PortableInterceptor.HOLDING;

/**
 * @program:test_12.5
 * @author: Nine_odes
 * @description:
 * @create:2019-12-05 11:51
 */
//class Calculator{
//    private int num1;
//    private int num2;
//
//    public int add(){
//        return num1+ num2;
//    }
//
//    public int sub(){
//        return num1 - num2;
//    }
//
//    public int mul(){
//        return num1 * num2;
//    }
//
//    public double div(){
//        if(num2 == 0){
//            System.out.println("除数非法！");
//            return 0.0;
//        }
//        return (double)num1 / num2;
//    }
//    public int getNum1() {
//        return num1;
//    }
//
//    public void setNum1(int num1) {
//        this.num1 = num1;
//    }
//
//    public int getNum2() {
//        return num2;
//    }
//
//    public void setNum2(int num2) {
//        this.num2 = num2;
//    }
//
//    public Calculator(int num1, int num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//}
//public class HomeWork {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator(10,20);
//        System.out.println(calculator.add());
//        System.out.println(calculator.sub());
//        System.out.println(calculator.mul());
//        System.out.println(calculator.div());
//    }
//}




//public class HomeWork{
//    private String name;
//    private int age;
//
//    public HomeWork(){
//        System.out.println("hehe");
//    }
//
//    public HomeWork(String name){
//        this();
//        this.name = name;
//    }
//
//    public HomeWork(String name,int age){
//        this(name);
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "HomeWork{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new HomeWork());
//        System.out.println(new HomeWork("jiuge"));
//        System.out.println(new HomeWork("jiuge",18));
//    }
//}

public class HomeWork{
    int num1 = 10;
    int num2 = 20;


    public static void main(String[] args) {
        //new HomeWork() 产生对象，在堆上
        //homeWork 是一个引用，在栈上
        HomeWork homeWork = new HomeWork();
        //swap(homeWork.num1,homeWork.num2);
        swap(homeWork);//交换两个实参的值借用对象来交换
        //homeWork.num1和homeWork.num2 是引用，在栈上
        System.out.println(homeWork.num1);
        System.out.println(homeWork.num2);
    }

    public static void swap(HomeWork homeWork){
        int temp = homeWork.num1;
        homeWork.num1 = homeWork.num2;
        homeWork.num2 = temp;
    }
    public static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}