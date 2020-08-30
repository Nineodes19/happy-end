/**
 * @program:test_8.30
 * @author:Nine_odes
 * @description:
 * @create:2020-08-30 23:39
 **/
public class Cylinder {
    float radius;
    float height;
    static final float pi = 3.14f;
    public Cylinder(float r,float h){
        this.radius = r;
        this.height = h;
    }
    public float getArea(){
        //
        return pi * this.radius * this.radius* 2 + 2 * pi * this.radius * this.height;
    }

    public float Volumn(){
        return pi * this.radius * this.radius * this.height;
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(2,10);
        System.out.println("表面积是：" + cy.getArea());
        System.out.println("体积是：" + cy.Volumn());
    }
}
