package code1;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 14:24
 */

class PersonArray{
    private Person[] personList;

    public PersonArray(int size){
        personList = new Person[size];
    }

    public boolean Insert(int index,Person e){
        if(index >= 0 && index < personList.length){
            personList[index] = e;
            return true;
        }
        return false;
    }

    public Person get(int index){
        if(index >= 0 && index < personList.length){
            return personList[index];
        }
        return null;
    }
}
public class Test1 {
    public static void main(String[] args) {
        PersonArray ea = new PersonArray(5);
        PersonArray ca = new PersonArray(5);

        Employee e1 = new Employee("王晓东","男",25,"0001","生产部");
        Employee e2 = new Employee("王文欢","男",20,"0002","营销部");
        Employee e3 = new Employee("吴秋丹","女",26,"0003","生产部");
        Employee e4 = new Employee("吴静空","男",23,"0004","生产部");
        Employee e5 = new Employee("何物嗯","男",32,"0005","营销部");

        ea.Insert(0,e1);
        ea.Insert(1,e2);
        ea.Insert(2,e3);
        ea.Insert(3,e4);
        ea.Insert(4,e5);

        Employee e = (Employee) ea.get(1);
        System.out.println(e.getName());

        Customer customer = new Customer("杨莹","女",21,"沈阳市和平区","1111111");
        Customer customer1 = new Customer("李军","男",30,"沈阳市大东区","2222222");
        Customer customer2 = new Customer("孙浩","男",25,"沈阳市皇姑区","3333333");

        ca.Insert(0,customer);
        ca.Insert(1,customer1);
        ca.Insert(2,customer2);

        Customer c = (Customer) ca.get(0);
        System.out.println(c.getName());
    }
}
