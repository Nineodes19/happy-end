import java.util.*;

/**
 * @program:test_.23
 * @author:Nine_odes
 * @description:
 * @create:2020-09-23 10:32
 **/
public class TestDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        List<String> list = Arrays.asList(split);
        Collections.reverse(list);
        String join = String.join(" ",list);
        if(join.length() > 100){
            join = join.substring(0,99);
        }
        System.out.println(join);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = s.length-1; i >=0 ; i--) {
            if(i!=0){
                list.add(s[i]);
                list.add(" ");
            }else{
                list.add(s[i]);
            }
        }
        for (String string:list) {
            System.out.print(string);
        }
    }
}
