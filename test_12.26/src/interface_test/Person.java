package interface_test;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-28 10:29
 */
public class Person implements Comparable<Person>,Cloneable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public int compareTo(Person o) {
        if(this.age > o.age)   return 1;
        else if(this.age < o.age)  return -1;
        return 0;
    }
}
