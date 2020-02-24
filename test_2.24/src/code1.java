import java.util.Scanner;

/**
 * @program:test_2.24
 * @author:Nine_odes
 * @description:核桃的数量
 * @create:2020-02-24 19:50
 **/

//小张是软件项目经历，他带领三个开发组，工期紧，今天都加班，为鼓舞士气，他打算
//给每个组发一袋核桃，要求是：每组的核桃数量必须相同，
// 每组内必须能平分核桃
//尽量满足一二条件的最小数量
//输入格式：输入包含三个正整数a，b，c，表示每个组正在加班的人，
// 用空格分开，都小于30
//输出格式：输出一个正整数，表示每袋核桃的数量
public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i;
        for(i = 1;;i++){
            if(i % a == 0 && i % b == 0 && i % c == 0){
                break;
            }
        }
        System.out.println(i);
    }
}
