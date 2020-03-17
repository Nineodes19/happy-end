import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program:test_3.17
 * @author:Nine_odes
 * @description:
 * @create:2020-03-17 15:11
 **/

class A<T>{
    T value;
    A(T value){
        this.value = value;
    }
    T get(){
        return value;
    }
}
public class code1 {
    public static void main(String[] args) {
        A<String> a = new A<>("Nineodes");
        System.out.println(a.get());
    }
}
