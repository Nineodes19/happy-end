import java.util.*;

/**
 * @program:test_7.21
 * @author:Nine_odes
 * @description:
 * @create:2020-07-21 12:38
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s == null || "".equals(s))
                break;
            String[] s1 = s.split("\\s");
            String key = s1[0].substring(s1[0].lastIndexOf('\\') + 1) + " " +s1[1];
            map.put(key,map.containsKey(key)? map.get(key) + 1:1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (int i = 0; i < 8; i++) {
            String[] sp = list.get(i).getKey().split("\\s");
            if(sp[0].length()>16)
                sp[0] = sp[0].substring(sp[0].length()-16);
            System.out.println(sp[0] + " " + sp[1] + " " + list.get(i).getValue());
        }

    }
}



