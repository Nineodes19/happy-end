package code2;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:定义泛型方法
 * @create:2019-12-22 17:45
 */
class NewPoint<T1,T2>{
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

    //定义泛型方法printPoint
    public<T1,T2>void printPoint(T1 x,T2 y){
        T1 m = x;
        T2 n = y;
        System.out.println("This point is :" + m + ", " +n);
    }
}
public class GeneMethodDemo {
    public static void main(String[] args){
        NewPoint<Integer,Integer>p1 = new NewPoint<Integer, Integer>();
        p1.setX(10);
        p1.setY(20);
        p1.printPoint(p1.getX(),p1.getY());

        NewPoint<Double,String>p2 = new NewPoint<Double, String>();
        p2.setX(25.400);
        p2.setY("东京一百四十度");
        p2.printPoint(p2.getX(),p2.getY());
    }
}
