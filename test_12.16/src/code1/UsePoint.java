package code1;

import code1216.mypack.NewPoint;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 19:48
 */
public class UsePoint {
    public static void main(String[] args) {
        NewPoint p1 = new NewPoint(1.0,2.0);
        NewPoint p2 = new NewPoint(2.0,5.5);
        System.out.println("点p1坐标：" + p1.x + ", " +p1.y);
        System.out.println("点p2坐标：" + p2.x + ", " +p2.y);
        System.out.println("点p1到点p2 的距离：" + p1.distanceTO(p2));
    }
}
