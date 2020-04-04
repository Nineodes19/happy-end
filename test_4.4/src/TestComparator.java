import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program:test_4.4
 * @author:Nine_odes
 * @description:
 * @create:2020-04-04 15:07
 **/

class Person{
    public String name;
    public int age;
    public int score;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        //从小到大排序 o1.age>o2.age  交换
        return o1.age - o2.age;
    }

}

class ScoreComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.score - o2.score;
    }
}

public class TestComparator {

    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();
        PriorityQueue<Person> people = new PriorityQueue<>();
        people.offer(new Person("jiuge",14,89));
        people.offer(new Person("hello",54,24));
        System.out.println(people.peek());
    }

    public static void main3(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("jiuge",14,89);
        people[1] = new Person("hello",54,24);
        people[2] = new Person("GG",15,45);

        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(people,ageComparator);
        System.out.println(Arrays.toString(people));

    }

    public static void main2(String[] args) {
        Person person = new Person("jiuge",14,89);
        Person person1 = new Person("hello",54,24);
        Person person2 = new Person("GG",15,45);

        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println(scoreComparator.compare(person,person2));
        System.out.println(scoreComparator.compare(person1,person));

    }
    public static void main1(String[] args) {
        Person person = new Person("jiuge",14,89);
        Person person1 = new Person("hello",54,24);
        Person person2 = new Person("GG",15,45);

        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(person,person2));
        System.out.println(ageComparator.compare(person1,person));
    }
}
