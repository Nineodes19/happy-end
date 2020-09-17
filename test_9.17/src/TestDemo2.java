import java.util.ArrayList;

/**
 * @program:test_9.17
 * @author:Nine_odes
 * @description:
 * @create:2020-09-17 20:42
 **/
import java.util.*;
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if(str.length() > 2000){
                return;
            }
            String[] line = str.split(" ");
            ArrayList<String> list = new ArrayList<>();
            int i = 0,j=0;
            for (; i < line.length; i++) {
                char[] ch = line[i].toCharArray();
                StringBuffer sb = new StringBuffer();
                for(j = 0; j < ch.length; j++){
                    if(Character.isDigit(ch[j])){
                        sb.append(ch[j]);
                    }else {
                        if(sb.length() != 0){
                            list.add(sb.toString());
                            sb.delete(0,sb.length());
                        }
                    }
                }
                if(sb.length() >= 4 && !list.contains(sb)){
                    list.add(sb.toString());
                    sb.delete(0,sb.length());
                }

            }
//        System.out.println(list);
            for (int k = 0; k < list.size(); k++) {
                int year = Integer.parseInt(list.get(k));
                if(year<1000 || year >3999){
                    list.remove(k);
                }
            }
//        System.out.println(list);
            for (int k = 0; k < list.size(); k++) {
                if(k == list.size()-1){
                    System.out.print(list.get(k));
                }else {
                    System.out.print(list.get(k) + " ");
                }
            }
        }

    }
}
