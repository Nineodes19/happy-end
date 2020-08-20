import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program:test_8.20
 * @author:Nine_odes
 * @description:
 * @create:2020-08-20 13:35
 **/

/**
 * ope[][] :
 * 第一个元素： 1（动物进收容所）   2（有人领养）
 * 第二个元素： 0（收养最先进的）   1（收养狗）   2（收养猫）
 */
public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here

        class Animal{
            int id,order;
            public Animal(int id,int order){
                this.id = id;
                this.order = order;
            }
        }
        int order = 0;
        Queue<Animal> queue = new ArrayDeque<>();
        LinkedList<Animal> dogs = new LinkedList<>();
        LinkedList<Animal> cats = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ope.length; i++) {
            if(ope[i][0] == 1){
                if(ope[i][1] > 0){
                    //收容狗
                    dogs.add(new Animal(ope[i][1],order++));
                }else if(ope[i][1] < 0){
                    cats.add(new Animal(ope[i][1],order++));
                }
            }else if(ope[i][0] == 2){
                //领养
                if(ope[i][1] == 0){
                    Animal d = dogs.peek();
                    Animal c = cats.peek();
                    boolean flag = false;
                    if(d != null && c != null){
                        if(d.order < c.order){
                            flag = true;
                        }
                    }else if(d == null && c == null){
                        continue;
                    }else if(d != null){
                        flag = true;
                    }

                    if(flag){
                        list.add(dogs.removeFirst().id);
                    }else{
                        list.add(cats.removeFirst().id);
                    }

                }else if(ope[i][1] == 1){
                    if(dogs.peek() != null){
                        list.add(dogs.removeFirst().id);
                    }
                }else if(ope[i][1] == -1){
                    if(cats.peek() != null){
                        list.add(cats.removeFirst().id);
                    }
                }
            }
        }
        return list;
    }
}
