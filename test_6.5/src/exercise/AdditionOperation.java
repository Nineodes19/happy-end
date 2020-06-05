package exercise;

/**
 * @program:test_6.5
 * @author:Nine_odes
 * @description:
 * @create:2020-06-05 10:52
 **/
/**
 * 书3.3 案例设计二， AdditionOperation加法算式子类
 *  采用面向对象的设计原则，使软件更易扩展、更易更新、更易维护
 */

/**
 * 加法算式子类AdditionOperation,是BinaryOperation的子类
 * @author lenovo
 *
 */
public class AdditionOperation extends BinaryOperation{
    /**
     * 加法子类的构造函数
     */
    public AdditionOperation() {
        generateBinaryOperation('+');
    }

    /**
     * 检查结果约束是否<=UPPER
     * @return 如果<=UPPER返回true；否则返回false
	 */
    public boolean checkingCalculation(int anInteger) {
        return anInteger <= UPPER;
    }

    /**
     * 加法计算的实现
     * @param left: 左操作数
     * @param right: 右操作数
     */
    public int calculate(int left, int right) {
        return left + right;
    }
}
