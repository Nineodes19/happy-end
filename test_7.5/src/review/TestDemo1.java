package review;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program:test_7.5
 * @author:Nine_odes
 * @description:
 * @create:2020-07-05 15:04
 **/
public class TestDemo1 {
    static class Person{
        private String name;
        private int age;
        private static  int count = 100;
        {
            //构造代码块，实例代码块
            this.name = "jiuge";
            this.age = 90;
        }
        //静态代码块中，无法访问实例变量，静态的东西属于类，不属于对象
        static{
            //静态代码块
            count = 999;
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

    public static void main(String[] args) {
//        Collection<String> list = new ArrayList<>();
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.insert(1);
        myArrayList.insert(2);
        myArrayList.insert(3);
        myArrayList.insert(4);
        int ret = myArrayList.getPos(0);
        System.out.println(ret);
    }
}
