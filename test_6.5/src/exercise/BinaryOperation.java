package exercise;

/**
 * @program:test_6.5
 * @author:Nine_odes
 * @description:
 * @create:2020-06-05 10:53
 **/
/**
 * BinaryOperation算式类
 * 采用面向对象的设计原则，使软件更易扩展、更易更新、更易维护
 */

import java.util.Random;

/**
 * 算式类BinaryOperation，抽象父类，封装算式通用的属性和方法
 * @author lenovo
 *
 */
public abstract class BinaryOperation {

    static final int UPPER = 100; //加法约束
    static final int LOWER = 0;   //减法约束
    private int left_operand = 0;  // 左操作数
    private int right_operand = 0;  // 右操作数
    private char operator;          // 操作符
    private int  value;             // 算式的结果

    abstract int calculate(int left, int right);  //抽象方法：算式的计算，由子类实现
    abstract boolean checkingCalculation(int anInteger); // 抽象方法，检验计算结果，子类负责实现

    protected void generateBinaryOperation(char anOperator) {
        int left, right, result;
        Random random = new Random();
        do {
            left = random.nextInt(UPPER+1);   //产生左操作数
            right = random.nextInt(UPPER+1);   //产生右操作数
            result = calculate(left, right);
        }while(!checkingCalculation(result));
        left_operand = left;
        right_operand = right;
        operator = anOperator;
        value = result;
    }

    /**
     * 获取左操作数
     * @return 获取值
     */
    public int getLefOperand() {
        return left_operand;
    }

    /**
     * 获取右操作数
     * @return 获取值
     */
    public int getRightOperand() {
        return right_operand;
    }

    /**
     * 获取操作符
     * @return 获取值
     */
    public char getOperator() {
        return operator;
    }

    /**
     * 获取计算结果
     * @return 获取值
     */
    public int getResult() {
        return value;
    }

    /**
     * 判断两个算式是否相等
     * @param anOperation：输入待比较算式
     * @return 和当前算式比较，如果相等则返回1；如果不相等返回0
     */
    public boolean equals(BinaryOperation anOperation) {
        return left_operand == anOperation.getLefOperand() &&
                right_operand == anOperation.getRightOperand() &&
                operator == anOperation.getOperator();
    }

    /**
     * @return 返回a+b 或者 a-b
     */
    public String toString() {
        String str;
        str = String.format("%3d %c %3d ", left_operand, getOperator(), right_operand);

        return str;
    }

    /**
     * @return 返回a+b= 或者 a-b=
     */
    public String asString() {
        return toString() + " = ";
    }

    /**
     * @return 返回a+b=c 或者 a-b=c
     */
    public String fullString() {
        return toString() + " = " + getResult();
    }

    /**
     * 算式构造，只有当参数满足条件才能正确构造算式，目前支持加法和减法
     * @param left：左操作数
     * @param right：右操作数
     * @param anOperator：操作符
     */
    public void unsafeConstructor(int left, int right, char anOperator) {
        this.left_operand = left;
        this.right_operand = right;
        this.operator = anOperator;
        this.value = anOperator == '+' ? left+right : left-right;
    }

    /**
     * 算式构造，只有当参数满足条件才能正确构造算式，目前支持加法和减法
     * @param left：左操作数
     * @param right：右操作数
     * @param result：算式的结果
     * @param anOperator：操作符
     */
    public void unsafeConstructor(int left, int right, int result, char anOperator) {
        this.left_operand = left;
        this.right_operand = right;
        this.operator = anOperator;
        this.value = result;
    }

    /**
     * 通过字符串完成算式构造，只有当参数满足条件才能正确构造算式"a+b" 或者 "a-b"，目前支持加法和减法
     * @param eqString：算式字符串
     */
    public void unsafeConstructor(String eqString) {
        int opPos = 0; // 符号在字符串中的位置
        int length = eqString.length();
        // 从字符串当中定位“+”或者“-”的位置
        opPos = eqString.indexOf("+");
        if(opPos <= 0) {
            opPos = eqString.indexOf("-");
        }
        unsafeConstructor(Integer.parseInt(eqString.substring(0, opPos)),
                Integer.parseInt(eqString.substring(opPos+1, length)),
                eqString.charAt(opPos));
    }
}

