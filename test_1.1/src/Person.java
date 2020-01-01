import java.util.TreeSet;

/**
 * @program:test_1.1
 * @author: Nine_odes
 * @description:
 * @create:2020-01-01 23:33
 */
public class Person implements Comparable<Person> {
    Integer age;
    String name;
    public Person(Integer age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        int length = this.name.length() - o.name.length();
        int num = length == 0 ? this.name.compareTo(o.name) : length;
        return num == 0 ? this.age - o.age : num;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person(23,"张三亚"));
        ts.add(new Person(13,"lisi"));
        ts.add(new Person(13,"zhouqi"));
        ts.add(new Person(43,"王权富贵"));
        ts.add(new Person(33,"zhaoleslie"));
        System.out.println(ts);
    }
}
