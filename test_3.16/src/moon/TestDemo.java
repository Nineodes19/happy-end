package moon;

import java.util.LinkedList;
import java.util.List;

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

    public int getImportance(List<Employee> employees, int id) {
        int sumimportance = 0;
        if(employees.isEmpty()){
            return -1;
        }
        //得到该员工的下属id
        List<Integer> e = new LinkedList<>();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).id == id){
                e = employees.get(i).subordinates;
            }
        }
        for (int j = 0; j < employees.size(); j++) {
            if(e.contains(employees.get(j).id)){
                sumimportance += employees.get(j).importance;
            }
        }

        return sumimportance;
    }
}
