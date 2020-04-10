/**
 * 客户的演示程序
 */
package duotai;

/**
 * @program:test_4.10
 * @author:Nine_odes
 * @description:
 * @create:2020-04-10 14:34
 **/

/**
 * 多态的演示类
 */
public class GeometryDuotaiDemo {
    public static void main(String[] args) {
        Geometry[] geoArray = new Geometry[]{
                new Rectangle(100,50),
                new Rectangle(50,200),
                new Triangle(60,60,60),
                new Triangle(90,90,30),
                new Circle(10,10,50),
                new Circle(100,100,30)
        };

        for (int i = 0; i < geoArray.length; i++){
            geoArray[i].display();
        }
    }
}
