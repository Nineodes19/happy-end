import java.util.Random;

/**
 * @program:test_3.27
 * @author:Nine_odes
 * @description:
 * @create:2020-03-27 23:10
 **/
public class TestDemo {
    public static void main(String[] args) {
        final int EQUATION_NUM = 50;
        final int ADD_MAX_VALUE = 100;
        final int MAX_OPRT_VALUE = 99;
        final int SUB_MIN_LINE = 0;
        final  int NUM_PER_LINE = 5;
        int[][] exercise;

//        printHeader("--程序输出加法算式的习题--");
//        exercise = generateExerciseOfAddtractEquation(EQUATION_NUM,ADD_MAX_VALUE,MAX_OPRT_VALUE);
//        formatAndDisplayExercise(exercise,NUM_PER_LINE);

        printHeader("--程序输出减法算式的习题--");
        exercise = generateExerciseOfSubtractEquation(EQUATION_NUM,SUB_MIN_LINE,MAX_OPRT_VALUE);
        formatAndDisplayExercise(exercise,NUM_PER_LINE);

        printHeader("--程序输出加减法混合算式的习题--");
        exercise = generateExerciseOfAddSubEquations(EQUATION_NUM,ADD_MAX_VALUE,SUB_MIN_LINE,MAX_OPRT_VALUE);
        formatAndDisplayExercise(exercise,NUM_PER_LINE);

    }

    public static int[][] generateExerciseOfAddtractEquation(int equ_num,int add_max_value,int max_oprt_value){
        int m,n;
        int[] e;
        int[][]exercise = new int[equ_num][4];
        int e_index = 0;
        for (int i = 0; i < equ_num; i++){
            do{
                e = generateAnSubtractEquation(add_max_value, max_oprt_value);
            }while(occursIn(e,exercise,e_index));
            exercise[e_index++] = e;
        }
        return exercise;
    }

    public static int[][] generateExerciseOfSubtractEquation(int equ_num,int sub_min_value,int max_oprt_value){
        int m,n;
        int[] e;
        int[][]exercise = new int[equ_num][4];
        int e_index = 0;
        for (int i = 0; i < equ_num; i++){
            do{
                e = generateAnSubtractEquation(sub_min_value, max_oprt_value);
            }while(occursIn(e,exercise,e_index));
            exercise[e_index++] = e;
        }
        return exercise;
    }

    /**
     * 产生加减法混合算式的习题
     * @param equ_num 习题集中算式的数量
     * @param add_max_value 加法结果的最大值
     * @param sub_min_value 减法结果的最小值
     * @param max_oprt_value
     * @return
     */
    public static int[][] generateExerciseOfAddSubEquations(int equ_num,int add_max_value,int sub_min_value,int max_oprt_value){
        int m,n;
        int[] e;
        int[][] exercise = new int[equ_num][4];
        int e_index = 0;
        int operator;
        Random random = new Random();
        for (int i = 0; i < equ_num; i++) {
            operator = random.nextInt(2);
            do{
                if(operator == 0){
                    e = generateAnAddEquation(add_max_value, max_oprt_value);
                }else{
                    e = generateAnSubtractEquation(sub_min_value,max_oprt_value);
                }
            }while(occursIn(e,exercise,e_index));
            exercise[e_index++] = e;
        }
        return exercise;
    }

    public static int[] generateAnAddEquation(int add_max_value,int max_oprt_value){
        int m,n,v;
        int[] e = new int[] {0,0,0,0};
        do{
            m = generateOperand(max_oprt_value);
            n = generateOperand(max_oprt_value);
            v = m + n;
        }while(v > add_max_value);
        e[0] = m;
        e[1] = n;
        e[2] = 0;
        e[3] = v;

        return e;
    }
    public static int[] generateAnSubtractEquation(int sub_min_value,int max_oprt_value){
        int m,n,v;
        int[] e = new int[]{0,0,0,0};
        do{
            m = generateOperand(max_oprt_value);
            n = generateOperand(max_oprt_value);
            v = m - n;
        }while(v < sub_min_value);
        e[0] = m;
        e[1] = n;
        e[2] = 1;
        e[3] = v;
        return e;
    }

    /**
     * 产生一个[0,max_value]的随机数
     * @param max_value 随机数的最大值
     * @return 返回这个随机数
     */
    public static int generateOperand(int max_value){
        Random random = new Random();
        return random.nextInt(max_value+1);
    }

    public static boolean occursIn(int[] eq,int[][] exercise,int index){
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if(isEquel(eq,exercise[i])){
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean isEquel(int[] eq1,int[] eq2){
        return (eq1[0] == eq2[0] && eq1[1] == eq2[1] && eq1[2] == eq2[2])
                || (eq1[0] == eq2[1] && eq1[1] == eq2[0] && eq1[2] == eq2[2]);
    }

    public static void formatAndDisplayExercise(int[][] exercise,int num_per_line){
        int i,m,n,o,v;
        int[] e;
        for ( i = 0; i < exercise.length; i++) {
            e = exercise[i];
            m = e[0];
            n = e[1];
            o = e[2];
            v = e[3];
            if(i % num_per_line == 0){
                System.out.println();
                System.out.printf("%2d ~ %2d:   ",i+1,i +num_per_line);
            }
            if(o == 0){
                System.out.printf("%2d + %2d = %3d   ",m,n,v);
            }else{
                System.out.printf("%2d - %2d = %3d   ",m,n,v);
            }
        }
    }

    public static void printHeader(String str){
        System.out.println("\n\n-----------------------------");
        System.out.println(str);
        System.out.println("---------------------------------");
    }
}
