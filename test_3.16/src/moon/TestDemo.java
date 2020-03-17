package moon;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @program:test_3.16
 * @author:Nine_odes
 * @description:
 * @create:2020-03-16 17:14
 **/

class Employee {

    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class TestDemo {
    private Map<Integer,Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees,int id){
        for(Employee employee:employees ){
            map.put(employee.id,employee);
        }
        return search(id);
    }

    public int search(int id){
        Employee e = map.get(id);//使用get()方法用键id寻找对应的值
        int sum = e.importance;
        for(int sub:e.subordinates){
            sum += search(id);
        }
        return sum;
    }
}
