import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program:test_3.11
 * @author:Nine_odes
 * @description:
 * @create:2020-03-11 19:18
 **/


class Student{
    private String name;
    private String classes;
    private double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
public class Demo2 {

    /**
     * 删除第一个字符串当中出现的第二个字符串中的字符
     *
     * @param args
     */

    public static String delete(String a,String b){
        StringBuffer s = new StringBuffer();
        char[] arr = new char[200];
        for (int i = 0; i < b.length(); i++) {
            arr[b.charAt(i)] = 1;
        }
        for (int i = 0; i < a.length(); i++) {
            if(arr[a.charAt(i)] != 1){
                s.append(a.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String s1 = "welcome to bit";
        String s2 = "come";
        System.out.println(delete(s1,s2));
    }

    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(78);
        list.add(45);
        System.out.println(list);
        System.out.println("-==========");
        for (int i:list) {
            System.out.print(i + " ");
        }
        System.out.println("=============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------排序-------");
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main1(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三","一班",96.0));
        students.add(new Student("李四","一班",95.3));
        System.out.println(students);

    }
}
