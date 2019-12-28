package interface_test;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-28 09:59
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Computer computer = new Computer();
//        computer.plugin(new Mouse());
//        computer.plugin(new KeyBoard());
        Person person = new Person("zs",20);
//        Person per = person;
//        per.setName("ls");
        Person per = person.clone();
        per.setName("ls");
        System.out.println(per);
        System.out.println(person);
    }
}
