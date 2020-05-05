import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program:test_5.5
 * @author:Nine_odes
 * @description:
 * @create:2020-05-05 22:23
 **/

class Student implements Comparable {
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
    public int compareTo(Object o) {
        if(this.age > age){
            return 1;
        }
        if(this.age == age){
            return 0;
        }
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
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return o.rank - this.rank;
    }
}
public class TestDemo1 {

    public static void main(String[] args) {
        PriorityQueue<Card> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Card("♤",5));
        priorityQueue.offer(new Card("♧",3));
        priorityQueue.offer(new Card("♢",4));
        priorityQueue.offer(new Card("♡",6));

        System.out.println(priorityQueue.poll());
    }
    public static void main2(String[] args) {
        Card[] cards = new Card[3];
        cards[0] = new Card("♡",4);
        cards[1] = new Card("♡",2);
        cards[2] = new Card("♡",3);
        Arrays.sort(cards);
        System.out.println(Arrays.toString(cards));
    }
    public static void main1(String[] args) {
        Student student1 = new Student("jiuge",18);
        Student student2 = new Student("yexiu",26);
        if(student1.compareTo(student2) > 0){
            System.out.println("student1的年龄>student2的年龄。");
        }else if(student1.compareTo(student2) == 0){
            System.out.println("student1的年龄 == student2 的年龄。");
        }else{
            System.out.println("student1的年龄 < student2的年龄。");
        }
    }
}
