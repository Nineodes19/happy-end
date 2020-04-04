import java.awt.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * @program:test_4.4
 * @author:Nine_odes
 * @description:归并排序
 * 自定义类型的比较方式:需要当年类型实现Comparable接口
 * 并且重写compareTo函数
 *  2.如果要进行比较，或者排序，那么这个自定义类型一定是可以比较的
 *  要么实现Comparable接口 ，要么实现 XXXX 接口
 *      3.学会自己重写equals方法
 *
 * @create:2020-04-04 13:35
 **/

class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        if(this.age > o.age)
            return 1;

        if(this.age == o.age)
            return 0;

        return -1;
    }
}

class Card implements Comparable<Card>{
    public String suit;
    public int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public int compareTo(Card o) {
        //从小到大排序 return this.rank-o.rank
        //从大到小排序
        return o.rank-this.rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                Objects.equals(suit, card.suit);
    }

}

public class TestSort {

    public static void main(String[] args) {
        Card card1 = new Card("红桃",4);
        Card card2 = new Card("红桃",4);
        System.out.println(card1.compareTo(card2));
        System.out.println(card1 == card2);
        System.out.println(card1.equals(card2));


        System.out.println("~!~~~~~~~~~~~~~~~~~~`");
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public static void main4(String[] args) {
        PriorityQueue<Card> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Card("hongtao",4));
        priorityQueue.offer(new Card("heitao",5));

        System.out.println(priorityQueue.peek());
    }

    public static void main3(String[] args) {
        Card[]cards = new Card[3];
        cards[0] = new Card("红桃",4);
        cards[1] = new Card("红桃",2);
        cards[2] = new Card("红桃",3);

    }

    public static void main2(String[] args) {
        Student student = new Student("bit",16);
        Student student1 = new Student("jiuge",15);
        //自定义类型如何比较大小
        if(student.compareTo(student1) > 0){
            System.out.println("student的年龄>student1的年龄");
        }else if(student.compareTo(student1) == 0){
            System.out.println("student的年龄=student1的年龄");
        }else{
            System.out.println("student的年龄<student1的年龄");
        }

    }

    /**
     * 非递归视线归并排序
     * @param array
     * @param gap
     */
    public static void merge2(int[] array,int gap){
        int[] tmp = new int[array.length];
        int k = 0;
        int s1 = 0;
        int e1 = s1+gap -1;
        int s2 = e1+1;
        int e2 = s2+gap-1 >= array.length ? array.length-1:s2+gap -1;

        //两个归并段都有数据
        while(s2 < array.length){
            //开始比较
            while(s1 <= e1 && s2 <= e2){
                if(array[s1]  <= array[s2]){
                    tmp[k++] = array[s1++];
                }else{
                    tmp[k++] = array[s2++];
                }
            }
            while(s1 <= e1){
                tmp[k++] = array[s1++];
            }
            while(s2 <= e2){
                tmp[k++] = array[s2++];
            }

            //说明归并了一部分
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2+gap-1>=array.length?array.length-1:s2+gap-1;
        }

        //没有第二个归并段了
        while(s1 <= array.length-1){
            tmp[k++] = array[s1++];
        }

        //所有的数据，全部放到tmp数组的暗中
        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }
    }

    public static void mergeSort(int[] array){
        for (int gap = 1; gap < array.length; gap++) {
            merge2(array,gap);
        }
    }

    public static void main1(String[] args) {
        int[] arr = new int[]{43,42,34,23,56,7,77,54,88};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
