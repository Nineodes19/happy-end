/**
 * @program:test_6.5
 * @author:Nine_odes
 * @description:
 * @create:2020-06-05 10:45
 **/
/**
 * 书3.3 案例设计二， Exercise习题类
 * 采用面向对象的设计原则，使软件更易扩展、更易更新、更易维护
 */
package exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 习题类Exercise
 * 策略3：让Exercise类里包含ArrayList，提供next()和hasNext()公共方法，
 * 让客户能够遍历ArrayList里面的元素
 * @author lenovo
 *
 */
public class Exercise {
    // 存放算式的动态数组
    private ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();
    private int current = 0; // 动态数组的游标
    /**
     * 产生加法算式习题
     * @param operationCount：习题中算式的个数
     */
    public void generateAdditionExercise(int operationCount) {
        BinaryOperation anOperation;
        while(operationCount > 0) {
            do {
                anOperation = new AdditionOperation();
            }while(operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }

    /**
     * 产生减法算式习题
     * @param operationCount：习题中算式的个数
     */
    public void generateSubstractExercise(int operationCount) {
        BinaryOperation anOperation;
        while(operationCount > 0) {
            do {
                anOperation = new SubstractOperation();
            }while(operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }

    /**
     * 产生加减法混合算式习题
     * @param operationCount：习题中算式的个数
     */
    public void generateBinaryExercise(int operationCount) {
        BinaryOperation anOperation;
        Random random = new Random();
        while(operationCount > 0) {
            do {
                int opValue = random.nextInt(2);
                if(opValue == 0)
                    anOperation = new AdditionOperation();
                else
                    anOperation = new SubstractOperation();
            }while(operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }

    /**
     * 遍历判断是否有下一个算式
     * @return
     */
    public boolean hasNext() {
        return current <= operationList.size()-1;
    }

    /**
     * 遍历返回当前算式，游标+1
     * @return 当前算式
     */
    public BinaryOperation next() {
        return operationList.get(current++);
    }

    /**
     * 提供给外部调用接口：在习题集中加入一个算式对象
     * @param anOperation：算式对象
     */
    public void add(BinaryOperation anOperation) {
        operationList.add(anOperation);
    }

    /**
     * 提供给外部调用接口：判断是否已经包含输入算式
     * @param anOperation：输入的算式对象
     * @return 如果有重复，返回true；否则，返回false
     */
    public boolean contains(BinaryOperation anOperation) {
        return operationList.contains(anOperation);
    }

    /**
     * 将习题写入文件
     * @param fileStr：文件的名字 "exercise_add_020_001.csv"
     */
    public void writeCSVExercise(String fileStr) {
        File aFile = new File(fileStr);
        try {
            Writer out = new FileWriter(aFile, false);
            for(BinaryOperation op : operationList) {
                out.write(op.toString()+",\n");
            }
            out.flush();
            out.close();
        }catch(IOException e) {
            System.out.println("ERROR:" + e);
        }
    }

    /**
     * 从文件读入算式，构造算式数据结构，保存到动态数组当中
     * @param fileStr：文件的名字 "exercise_add_020_001.csv"
     */
    public void readCSVExercise(String fileStr) {
        File aFile = new File(fileStr);
        String eqString;
        BinaryOperation op;

        try {
            Scanner sc = new Scanner(aFile);
            sc.useDelimiter(",");
            while(sc.hasNext()){
                // 删除算式字符串中的空格
                eqString = sc.next().replaceAll("\\s", "");
                // 判断算式是加法还是减法
                int opPos = eqString.indexOf("+");
                if(opPos > 0) {  // 加法算式
                    op = new AdditionOperation();
                    op.unsafeConstructor(eqString);
                    add(op);  // 新增算式
                }
                opPos = eqString.indexOf("-");
                if(opPos > 0) {  // 减法算式
                    op = new SubstractOperation();
                    op.unsafeConstructor(eqString);
                    add(op);  // 新增算式
                }
            }
        }catch(IOException e) {
            System.out.println("ERROR:" + e);
        }
    }
    public BinaryOperation getOperation(int i) {
    }
}

