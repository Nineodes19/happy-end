package review;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:tostring
 * @create:2019-12-03 18:51
 */
public class ToString {
    private String name;
    private int age;

    public ToString(String name,int age){
        this.name =name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ToString t1 = new ToString("jiuge",18);
        System.out.println(t1);
    }
}
