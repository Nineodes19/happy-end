package frank;

/**
 * @program:test_8.10
 * @author:Nine_odes
 * @description:
 * @create:2020-08-10 21:23
 **/
public class Duck {
    private String name;
    private int age;


    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
