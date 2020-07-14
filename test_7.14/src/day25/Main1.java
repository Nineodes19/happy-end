package day25;

import java.util.Scanner;

/**
 * @program:test_7.14
 * @author:Nine_odes
 * @description:
 * @create:2020-07-14 18:44
 **/
public class Main1 {
    private static String Chi(char c){
        if(c == '1') return "壹";
        if(c == '2') return "贰";
        if(c == '3') return "叁";
        if(c == '4') return "肆";
        if(c == '5') return "伍";
        if(c == '6') return "陆";
        if(c == '7') return "柒";
        if(c == '8') return "捌";
        if(c == '9') return "玖";

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split("\\.");
            String s = strs[0];
            StringBuilder stringBuilder = new StringBuilder("人民币");
            for (int j = 0,i=s.length()-1; i>=0 ; i--,j++) {
                if(s.charAt(j)!='0'){
                    if(j>=3 && j %4 == 0 && s.charAt(j-1) == '0' && s.charAt(j-2) == '0'){
                        stringBuilder.append("零");
                    }
                    if(s.charAt(j) == '1' && i % 4-1 == 0){
                    }else{
                        stringBuilder.append(Chi(s.charAt(j)));
                    }
                }
                if(i != 0){
                    if(i % 8 == 0 && i >= 8){
                        stringBuilder.append("亿");
                    }
                    if(i % 4 == 0 && i % 8 !=0){
                        stringBuilder.append("万");
                    }
                    if(i % 4 - 3 == 0 && s.charAt(j)!='0'){
                        stringBuilder.append("仟");
                        if(s.charAt(j+1) == '0' && s.charAt(j+2) != '0'){
                            stringBuilder.append("零");
                        }
                    }
                    if(i % 4 - 2 == 0 && s.charAt(j)!='0'){
                        stringBuilder.append("佰");
                        if(s.charAt(j+1) == '0' && s.charAt(j+2) != '0'){
                            stringBuilder.append("零");
                        }
                    }
                    if(i % 4 - 1 == 0 && s.charAt(j)!='0'){
                        stringBuilder.append("拾");

                    }
                }
            }
            if(s.charAt(0)!='0'){
                stringBuilder.append("元");
            }
            if(strs.length==1 ||strs[1].equals("00")){
                stringBuilder.append("整");
            }else{

                if(strs[1].charAt(0) == '0'){
                    stringBuilder.append(Chi(strs[1].charAt(1)));
                    stringBuilder.append("分");
                }
                if( strs[1].charAt(1) == '0'){
                    stringBuilder.append(Chi(strs[1].charAt(0)));
                    stringBuilder.append("角");
                }
                if(strs[1].charAt(0) !='0' && strs[1].charAt(1)!='0'){
                    stringBuilder.append(Chi(strs[1].charAt(0)));
                    stringBuilder.append("角");
                    stringBuilder.append(Chi(strs[1].charAt(1)));
                    stringBuilder.append("分");
                }

            }
            System.out.println(stringBuilder);
        }

    }
}
