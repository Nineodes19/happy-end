package day43;

/**
 * @program:test_8.5
 * @author:Nine_odes
 * @description: 电话号码
 * @create:2020-08-05 16:44
 **/


/*
12
4873279-----487-3279
ITS-EASY----4873279
888-4567-----888-4567
3-10-10-10---310-1010
888-GLOP----888-4567
TUT-GLOP----888-4567
967-11-11---967-1111
310-GINO----310-4466
F101010-----310-1010
888-1200----888-1200
-4-8-7-3-2-7-9-   487-3279
487-3279-----487-3279
4
UTT-HELP
TUT-GLOP
310-GINO
000-1213

 */
//import java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] map = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ","22233344455566677778889999"};
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            Set<String> set = new TreeSet<>();
//            StringBuilder sb = new StringBuilder();
//            for(int i = 0; i < n; i++){
//                char[] ch = sc.next().replace("-","").toCharArray();
//                for(int j = 0; j < ch.length; j++){
//                    if(j == 3){
//                        sb.append("-");
//                    }
//                    if(Character.isLetter(ch[j])){
//                        sb.append(map[1].charAt(map[0].indexOf(ch[j])));
//                    }else{
//                        sb.append(ch[j]);
//                    }
//                }
//                set.add(sb.toString());
//                sb.delete(0,sb.length());
//
//            }
//            for(String s:set){
//                System.out.println(s);
//            }
//            System.out.println();
//        }
//    }
//    public static void main1(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            List<StringBuffer> list = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                String line = sc.nextLine();
//                String[] s = line.split("-");
//                StringBuffer sb = new StringBuffer();
//                for(int j = 0; j < s.length; j++){
//                    if(sb.length() == 3){
//                        sb.append("-");
//                    }else{
//                        if(s[j].matches("[ABC]")){
//                            sb.append("2");
//                        }else if(s[j].matches("[DEF]")){
//                            sb.append("3");
//                        }else if(s[j].matches("[GHI]")){
//                            sb.append("4");
//                        }else if(s[j].matches("[JKL]")){
//                            sb.append("5");
//                        }else if(s[j].matches("[MNO]")){
//                            sb.append("6");
//                        }else if(s[j].matches("[PQRS]")){
//                            sb.append("7");
//                        }else if(s[j].matches("[TUV]")){
//                            sb.append("7");
//                        }else if(s[j].matches("[WXYZ]")){
//                            sb.append("9");
//                        }
//                    }
//                }
//                if(!list.contains(sb)){
//                    list.add(sb);
//                }
//            }
//            System.out.println(list);
//            System.out.println();
//
//
//        }
//    }
//}







import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] map = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "22233344455566677778889999"};
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Set<String> set = new TreeSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i ++ ) {
                char[] ch = sc.next().replace("-", "").toCharArray();
                for (int j = 0; j < ch.length; j ++ ) {
                    if(j == 3) sb.append("-");
                    if(Character.isLetter(ch[j])) sb.append(map[1].charAt(map[0].indexOf(ch[j])));
                    else sb.append(ch[j]);
                }
                set.add(sb.toString());
                sb.delete(0, sb.length());
            }
            for (String s:set)
                System.out.println(s);
            System.out.println();
        }
    }
}