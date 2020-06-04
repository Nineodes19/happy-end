package day3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program:test_6.4
 * @author:Nine_odes
 * @description:字符串中找出连续最长的数字串
 * @create:2020-06-04 18:42
 **/
//dp数组存放从数据i开始的 最大数字串
public class Main {
    private static String findMax(String string){
        int tempMax = 0;//当前遍历string字符串中数字字符串的长度
        int max = 0;//最后输出字符串的长度（一直为最大字符串的长度）
        String result = "";//结果字符串
        char[] ch = string.toCharArray();//需要判断遍历到的string元素是否为数字，将string转变为字符数组
        StringBuilder stringBuilder = new StringBuilder();//需要进行append操作
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){
                //如果遍历到的当前字符是数字字符，往StringBuilder中添加该数字字符，tempMax++
                stringBuilder.append(ch[i]);
                tempMax++;
            }else{
                //不是数字字符时，即将进行下一次数字字符串遍历，tempMax置0
                tempMax = 0;
                //将stringBuilder中的元素全部删除，为下一个数字字符串的添加做准备
                stringBuilder.delete(0,stringBuilder.length());
            }
            //确保max一直是最大字符串的长度
            if(max < tempMax){
                max = tempMax;
                result = stringBuilder.toString();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        System.out.println(findMax(string));
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int max =0,count = 0,end = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >='0' && str.charAt(i) <='9'){
                    count++;
                    if(max < count){
                        max = count;
                        end = i;
                    }
                }else{
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}
