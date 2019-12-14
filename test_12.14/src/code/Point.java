package code;

/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:
 * @create:2019-12-14 23:01
 */
public class Point {
    int x = 0;
    int y = 0;
    public void move(int dx,int dy){
        x = x + dx;
        y = y + dy;
    }
    public void alert(){
        System.out.println("x= " + x + " ,y= " + y);
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.move(1,2);
        p.alert();
    }
}
