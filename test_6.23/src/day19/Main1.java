package day19;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @program:test_6.23
 * @author:Nine_odes
 * @description:成绩排序
 * @create:2020-06-23 08:57
 **/

class Student implements Comparable<Student>{

    Integer id;
    Integer score;

    public Student(Integer id, Integer score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return id+" " + score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score.equals(o.score) ? id.compareTo(o.id):score.compareTo(o.score);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Student> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            list.add(new Student(p,q));
        }
        Collections.sort(list);
        for (Student s:list) {
            System.out.println(s);
        }
    }
}
