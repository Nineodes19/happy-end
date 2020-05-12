import java.util.Comparator;

/**
 * @program:test_5.12
 * @author:Nine_odes
 * @description:
 * @create:2020-05-12 14:11
 **/
class Student implements Comparable<Student> {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }
}

class Stu implements Comparator<Stu>{
    public String name;
    public int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.age - o2.age;
    }
}
public class TestDemo {

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("123",5));
    }
    public static void main1(String[] args) {
        Student s1 = new Student("叶修",98);
        Student s2 = new Student("苏沐秋",97);
        Stu stu = new Stu("九歌",20);
        Stu stu1 = new Stu("叶宁",18);
        System.out.println(s1.compareTo(s2));
        System.out.println(stu.compare(stu1,stu1));
    }
}