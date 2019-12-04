package code1;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 13:46
 */



class Employee extends Person{
    private String id;
    private String department;

    public Employee(String name, String sex, int age,String id,String department) {
        super(name, sex, age);
        this.id = id;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }
}

class Customer extends Person{
    private String address;
    private String phone;

    public Customer(String name, String sex, int age, String address, String phone) {
        super(name, sex, age);
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}

class EmployeeArray{
    private Employee[] personList;

    public EmployeeArray(int size) {
        personList = new Employee[size];
    }

    //在数组的index位置插入元素e，成功插入返回true
    public boolean Insert(int index,Employee e){
        if(index >= 0 && index < personList.length){
            personList[index] = e;
            return true;
        }
        return false;
    }

    //输出数组中下标为index的元素，如果index错误，返回null
    public Employee get(int index){
        if(index >= 0 && index < personList.length){
            return personList[index];
        }
        return null;
    }
}

class CustomerArray{
    private Customer[] personList;
    public CustomerArray(int size){
        personList = new Customer[size];
    }

    public boolean Insert(int index, Customer e){
        if(index >= 0 && index < personList.length){
            personList[index] = e;
            return true;
        }
        return false;
    }

    public Customer get(int index){
        if(index >= 0 && index < personList.length){
            return personList[index];
        }
        return null;
    }
}
public class Test {
    public static void main(String[] args) {
        EmployeeArray ea = new EmployeeArray(5);
        CustomerArray ca = new CustomerArray(5);

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

        Employee e = ea.get(1);
        System.out.println(e.getName());

        Customer customer = new Customer("杨莹","女",21,"沈阳市和平区","1111111");
        Customer customer1 = new Customer("李军","男",30,"沈阳市大东区","2222222");
        Customer customer2 = new Customer("孙浩","男",25,"沈阳市皇姑区","3333333");

        ca.Insert(0,customer);
        ca.Insert(1,customer1);
        ca.Insert(2,customer2);

        Customer c = ca.get(0);
        System.out.println(c.getName());
    }
}
