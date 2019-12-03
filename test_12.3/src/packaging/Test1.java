package packaging;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:homework(类Calculator)
 * @create:2019-12-03 15:23
 */

class Calculator{
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add(double num1,double num2){
        return num1+num2;
    }
    public double sub(double num1,double num2){
        return num1 - num2;
    }

    public double mul(double num1,double num2){
        return num1 * num2;
    }

    public double div(double num1,double num2){
        if(num2 == 0){
            System.out.println("ERROR！");
        }
        return num1 / num2;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.div(10.0,0));
    }
}
