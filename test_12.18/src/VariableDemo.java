/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:21
 */

class Variable{
    int num = 10;//成员变量

    public void show(){
        int num2 = 20;
        System.out.println(num2);
        System.out.println(num);
    }


}
public class VariableDemo {
    public static void main(String[] args){
        Variable v = new Variable();
        System.out.println(v.num);

        v.show();
    }
}
