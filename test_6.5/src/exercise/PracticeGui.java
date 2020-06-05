package exercise;

import sun.plugin.extension.JavaExtensionInstaller;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program:test_6.5
 * @author:Nine_odes
 * @description:
 * @create:2020-06-05 10:37
 **/
public class PracticeGui extends JFrame {
    static final int window_width = 620;//窗口宽
    static final int window_height = 300;//窗口高
    static final int op_amount = 20;//算是数量
    static final int op_column = 5;//每一行5个算数的布局
    static final int op_widh = 75;//每个算数的宽度
    static final int answer_width = 35;//计算结果的宽
    static final int componet_height = 25;//每个组建的高

    private JPanel contentPane;//面板容器
    private JTextField[] tfOp;//算式文本框数组
    private JTextField[] tfAns;//答案文本框数组
    private JTextArea taStat;//统计文本区域
    private JButton btnGenerate;//生成习题按钮
    private JButton btnSubmit;
    private  JMenuBar menuBar;//菜单条
    private JMenu menu;//菜单
    private JMenuItem menuItemAdd;//菜单项
    private JMenuItem menuItemSub;
    private JMenuItem menuItemMix;

    private Exercise exercise;//习题对象
    private int correntAmount;//正确的题数
    private int wrongAmount;//错误的题数
    private float correctRatio;//正确率
    private float wrongRatio;//错误率
    private int exerciseType;

    public static void main(String[] args) {
        PracticeGui frame = new PracticeGui();
        frame.setVisible(true);
    }

    /**
     * 初始化习题算式组件集合
     */
    private void initExerciseCompents(){
        exercise = new Exercise();
        exercise.generateAdditionExercise(op_amount);
        tfOp = new JTextField[op_amount];//生成testFiled兑现数组
        tfAns = new JTextField[op_amount];
        for(int i = 0; i < op_amount; i++){
            tfOp[i] = new JTextField();
            tfOp[i].setBounds(20+(i % op_column) * (op_widh + answer_width + 5),
                    20 +(i / op_column) * (componet_height + 10),
                    op_widh,componet_height);//设置每一个组件的位置和大小
            //tfOp[i].setHorizontalAlignment(JTextField.RIGHT);
            contentPane.add(tfOp[i]);

            tfAns[i] =  new JTextField();
            tfAns[i].setBounds(20+op_widh + (i % op_column) * (op_widh + answer_width + 5),
                    20 +(i / op_column) * (componet_height + 10),
                    answer_width,componet_height);//设置每一个答案组件的位置和大小
            //tfAns[i].setHorizontalAlignment(JTextField.RIGHT);
            contentPane.add(tfAns[i]);
        }
    }

    /**
     * 更新习题组件的内容
     */
    private void updateExetcise(){
        BinaryOperation op;
        for (int i = 0; i < op_amount; i++) {
            op = exercise.getOperation(i);//获取第i个算式
            System.out.println(op.toString());
            tfOp[i].setText(op.asString());//在第i个文本框中写入算式字符串
            tfAns[i].setBackground(Color.WHITE);
            tfAns[i].setText("");//清空答案
        }
        //更新文本区域统计信息
        taStat.setText("统计信息：\n总题数：" + op_amount + "\t正确题数：\t\t错误题数：\n\t正确率：" + correctRatio +
                "\t\t错误率：" + wrongRatio);
    }

    /**
     * 判断答案正确与否，统计正确率
     */
    private void judge(){
        BinaryOperation op;
        correntAmount = wrongAmount= 0;//正确题数和错误题数的初始值
        for (int i = 0; i < op_amount; i++) {
            op = exercise.getOperation(i);
            String result = String.valueOf(op.getResult());//把标准答案转换成字符串
            String answer = tfAns[i].getText().trim();//去掉文本框中字符串前后空格
            if(result.equals(answer)){
                //正确
                tfAns[i].setBackground(Color.GREEN);
                correntAmount++;
            }else{
                tfAns[i].setBackground(Color.RED);
                wrongAmount++;
            }
        }
        //计算正确率
        correctRatio = (float) correntAmount *100 / op_amount;
        wrongRatio = (float) wrongAmount *100 / op_amount;

        taStat.setText("统计信息：\n总题数：" + op_amount + "\t正确题数："+correntAmount +"\t\t错误题数："+wrongAmount + "\n\t正确率：" + String.format("%.0f%%",correctRatio) +
                "\t错误率：" + String.format("%.0f%%",wrongRatio));
    }
    /**
     * 构造函数
     */
    public PracticeGui(){
        setTitle("口算练习软件");//设置标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关系窗口程序退出
        setBounds(100,100,WIDTH,HEIGHT);//设置窗口的位置

        contentPane = new JPanel();//创建面板对象
        contentPane.setBorder(new EmptyBorder(5,5,5,5));//设置面板的边框
        setContentPane(contentPane);//设置面板容器
        contentPane.setLayout(null);//清空面板的布局

        /**
         *
         */
        exerciseType = 0;//0-加法   1--减法    2--加减混合
        menuBar = new JMenuBar();//加入菜单条
        setJMenuBar(menuBar);//在窗口中加入菜单条
        menu = new JMenu("题目设置");//创建菜单对象
        menuBar.add(menu);
        menuItemAdd = new JMenuItem("加法题目");
        menuItemSub = new JMenuItem("减法题目");
        menuItemMix = new JMenuItem("加减混合");
        menu.add(menuItemAdd);
        menu.add(menuItemSub);
        menu.add(menuItemMix);
        menuItemAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exerciseType = 0;//0-加法   1--减法    2--加减混合
            }
        });
        menuItemSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exerciseType = 1;//0-加法   1--减法    2--加减混合
            }
        });
        menuItemMix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exerciseType = 2;//0-加法   1--减法    2--加减混合
            }
        });

        /**
         * 产生生成习题按钮
          */
        btnGenerate = new JButton("生成题目");
        btnGenerate.setBounds(32,168,123,23);//按钮的大小和位置
        btnGenerate.addActionListener(new ActionListener() {//使用匿名类
            @Override
            public void actionPerformed(ActionEvent e) {
                if(exerciseType == 0)
                    exercise.generateAdditionExercise(op_amount);//默认产生加法习题
                else if(exerciseType == 1)
                        exercise.generateSubstractExercise(op_amount);
                else
                    exercise.generateBinaryExercise(op_amount);
                updateExetcise();//更新算是组件内容
            }
        });
        contentPane.add(btnGenerate);//将button加入到面板容器

        /**
         * 产生提交戴安按钮
         */
        btnSubmit = new JButton("提交答案");
        btnSubmit.setBounds(32,208,123,123);//按钮的大小和位置
        btnSubmit.addActionListener(new ActionListener() {//使用匿名类
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO自动生成方法存根
                //judge();//判题
            }
        });
        contentPane.add(btnSubmit);//将button加入到面板容器

        /**
         * 统计信息文本区域
         */
        taStat = new JTextArea();
        taStat.setEditable(false);
        taStat.setBounds(125,168,350,65);//设置文本区域大小和位置
        taStat.setText("统计信息：\n总题数：" + op_amount + "\t正确题数：\t\t错误题数：\n\t正确率：" + correctRatio +
                "\t\t错误率：" + wrongRatio);
        contentPane.add(taStat);
    }
}
