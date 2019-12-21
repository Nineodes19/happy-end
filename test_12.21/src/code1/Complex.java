package code1;

import sun.plugin.com.event.COMEventHandler;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:06
 */
public class Complex {
    public int RealPart;
    public int ImaginPart;
    public Complex(){
        RealPart = 0;
        ImaginPart = 0;
    }

    public Complex(int r,int i){
        RealPart = r;
        ImaginPart = i;
    }
    public Complex complexAdd(Complex a){
        Complex complex = new Complex();
        complex.RealPart = this.RealPart+a.RealPart;
        complex.ImaginPart = this.ImaginPart + a.ImaginPart;
        return complex;
    }

    public void Print() {
        System.out.println(RealPart + "+" + ImaginPart + "i");
    }

    public static void main(String[] args) {
        Complex x = new Complex(10,1);
        Complex y = new Complex(1,2);
        Complex z = x.complexAdd(x);
        z.Print();
    }
}
