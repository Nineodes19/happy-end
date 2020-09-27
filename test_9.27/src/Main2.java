/**
 * @program:test_9.27
 * @author:Nine_odes
 * @description:
 * @create:2020-09-27 10:17
 **/

import java.util.*;
class book{
    String cno;//操作
    int x;//书本编号
    int y;//书架编号
}
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int N = 0;//书架编号最大值
        int M = 0;//书本编号最大值
        int Q = 0;//所有操作的行数
        int [] num = new int[3];
        String[] str = s1.split(" ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        N = num[0];
        M = num[1];
        Q = num[2];

        //book[] ope = new book[Q];
        Map<Integer,Integer> map = new HashMap<>();
        boolean[] flag = new boolean[N];//书架是否上锁
        int ret = 0;
        for (int i = 0; i < Q; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            book ope = new book();
            ope.cno = arr[0];
            ope.x = Integer.parseInt(arr[1]);
            if(arr.length == 3){
                ope.y = Integer.parseInt(arr[2]);
            }
            LinkedList<Integer> list = new LinkedList<>();
            switch (ope.cno){
                case "1":
                    if(!flag[ope.y]){
                        //此时要放书的书架未加锁
                        if(map.containsKey(ope.x)  && !list.contains(ope.x)){
                            //该书存在且书架未加锁
                            if(!flag[map.get(ope.x)]){
                                map.remove(ope.x,map.get(ope.x));
                                map.put(ope.x,ope.y);//放入书架
                            }
                        }else{
                            map.put(ope.x,ope.y);//放入书架
                            //System.out.println(map);
                        }
                    }
                    break;
                case "2":
                    flag[ope.x] = true;//该书架上锁
                    break;
                case "3":
                    flag[ope.x] = false;
                    break;
                case "4":
                    //借书
                    if(map.containsKey(ope.x) && !flag[map.get(ope.x)]){
                        ret = map.get(ope.x);
                        list.add(ope.x);
                        map.remove(ope.x);

                    }else{
                        ret = -1;
                    }
                    //System.out.println(map);
                    System.out.println(ret);
                    break;
                case "5":
                    if(list.contains(ope.x)){
                        list.remove(ope.x);
                    }
                    break;
            }

        }
    }
}
