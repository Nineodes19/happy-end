package exercise;

/**
 * @program:test_6.5
 * @author:Nine_odes
 * @description:
 * @create:2020-06-05 10:59
 **/
/**
 * 书3.3 案例设计二， SubstractOperation减法算式子类
 *  采用面向对象的设计原则，使软件更易扩展、更易更新、更易维护
 */


/**
 * 减法算式子类SubstractOperation,是BinaryOperation的子类
 * @author lenovo
 *
 */
public class SubstractOperation extends BinaryOperation{
    /**
     * 减法子类的构造函数
     */
    public SubstractOperation() {
        generateBinaryOperation('-');
    }

    /**
     * 检查结果约束是否>= LOWER
     * @return 如果>= LOWER返回true；否则返回false
     */
    public boolean checkingCalculation(int anInteger) {
        return anInteger >= LOWER;
    }

    /**
     * 减法计算的实现
     * @param left: 左操作数
     * @param right: 右操作数
     */
    public int calculate(int left, int right) {
        return left - right;
    }
}

