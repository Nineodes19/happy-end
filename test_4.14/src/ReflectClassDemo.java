import java.lang.reflect.Constructor;

/**
 * @program:test_4.14
 * @author:Nine_odes
 * @description:
 * @create:2020-04-14 19:18
 **/
public class ReflectClassDemo {
    public static void reflextNewInstance(){
        try {
            Class<?> c1 = Class.forName("Student");
            Student stu1 = (Student)c1.newInstance();

            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void reflectRrivateConstructor(){

        try {
            Class<?> c1 = Class.forName("Student");

            Constructor[] constructors = c1.getConstructors();


            for (Constructor c : constructors) {
                System.out.println(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {

    }
}
