package code1216.mypack;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 19:45
 */
public class NewPoint {
    public double x,y;

    public NewPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTO(NewPoint p){
        return Math.sqrt((x-p.x) * (x-p.x) + (y - p.y) * (y - p.y));
    }
}
