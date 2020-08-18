package frank;

/**
 * @program:test_8.10
 * @author:Nine_odes
 * @description:
 * @create:2020-08-10 21:23
 **/


public class Duck3 {
    private String name;
    private int age;
    private Duck3 next;

    @Override
    public String toString() {
        return "Duck3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", next=" + next +
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

    public Duck3 getNext() {
        return next;
    }

    public void setNext(Duck3 next) {
        this.next = next;
    }
}
