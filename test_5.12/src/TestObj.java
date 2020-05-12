/**
 * @program:test_5.12
 * @author:Nine_odes
 * @description:
 * @create:2020-05-12 14:08
 **/
public class TestObj {
    public static void main(String[] args) {
        Object o = new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
}
