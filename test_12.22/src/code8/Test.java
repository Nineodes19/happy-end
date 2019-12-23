package code8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 23:00
 */
public class Test implements Comparable<Test>{
    public int x;
    public int y;
    public Test(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Test point){
        int s1 = x*x+y*y;
        int s2 = point.x*point.x +point.y*point.y;
        return s1 - s2;
    }

    public String toString(){
        return "[" + x + ", " + y + "]";
    }

    public static void main(String[] args) {
        if(new Test(3,4).compareTo(new Test(1,1)) > 0){
            System.out.println("true");
        }

        List<Test> points = new ArrayList<Test>();
        points.add(new Test(1,6));
        points.add(new Test(3,4));
        points.add(new Test(5,2));
        System.out.println(points);
        Collections.sort(points);
        System.out.println(points);
    }
}
