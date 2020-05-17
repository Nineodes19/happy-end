package code2;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:泛型
 * @create:2019-12-22 17:38
 */
class Point<T1,T2>{
    T1 x;
    T2 y;

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getY() {
        return y;
    }

    public void setY(T2 y) {
        this.y = y;
    }
}
public class GeneDemo {
    public static void main(String[] args){
        Point<Integer,Integer>p1 = new Point<Integer, Integer>();
        p1.setX(10);
        p1.setY(20);
        int x = p1.getX();
        int y = p1.getY();
        System.out.println("This point is:" + x + ", " + y);
        Point<Double,String>p2 = new Point<Double, String>();
        p2.setX(25.4);
        p2.setY("东京180°");
        double m = p2.getX();
        String n = p2.getY();
        System.out.println("This point is:" + m + ", " + n);

    }
}
