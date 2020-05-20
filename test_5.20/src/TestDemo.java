import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;

/**
 * @program:test_5.20
 * @author:Nine_odes
 * @description:
 * @create:2020-05-20 22:18
 **/
public class TestDemo {
    public static void printAll(ArrayList<? extends Number> list){

    }

    public static void main(String[] args) {
        printAll(new ArrayList<Integer>());
        printAll(new ArrayList<Double>());
        printAll(new ArrayList<Number>());
        //printAll(new ArrayList<Object>());
    }
}
