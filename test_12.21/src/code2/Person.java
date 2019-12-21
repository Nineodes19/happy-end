package code2;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:22
 */
public class Person {
    public String name;
    public int age;
    public void Say(){
        System.out.println(name +"can say");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
