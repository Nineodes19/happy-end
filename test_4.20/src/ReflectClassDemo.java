import jdk.nashorn.internal.runtime.ECMAException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/**
 * @program:test_4.20
 * @author:Nine_odes
 * @description:
 * @create:2020-04-20 22:28
 **/
public class ReflectClassDemo {
    public static void reflectNewInstance(){
        try {
            Class<?> classStudent = Class.forName("Student");
            Object objectStudent = null;
            objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            System.out.println("获得学生对象：" + student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reflectPrivateConstructor(){
        try {
            Class<?> classStudent = Class.forName("Student");
            Constructor<?> declaredConstructorStudent = classStudent.getDeclaredConstructor(String.class,int.class);
            declaredConstructorStudent.setAccessible(true);
            Object objectStudent = declaredConstructorStudent.newInstance("jiuge",19);
            Student student = (Student) objectStudent;
            System.out.println("获得私有构造函数且修改姓名和年龄" + student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void reflectPrivateFiel(){
        try {
            Class<?> classStudent = Class.forName("Student");
            Field field = classStudent.getDeclaredField("name");
            field.setAccessible(true);
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            field.set(student,"小明");
            String name = (String) field.get(student);
            System.out.println("反射私有属性修改了name：" + name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void reflectPrivateMethod(){
        try {
            Class<?> classStudent = Class.forName("Student");
            Method methodStudent = classStudent.getDeclaredMethod("function", String.class);
            System.out.println("私有方法的方法名为：" + methodStudent.getName());

            methodStudent.setAccessible(true);
            Object objectStudent = classStudent.newInstance();
            Student student = (Student)objectStudent;
            methodStudent.invoke(student,"我是给私有的function函数传的参数");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        reflectNewInstance();
//        reflectPrivateConstructor();

//        reflectPrivateFiel();
        reflectPrivateMethod();
    }
}
