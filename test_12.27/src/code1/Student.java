package code1;

/**
 * @program:test_12.27
 * @author: Nine_odes
 * @description:
 * @create:2019-12-27 23:14
 */
public class Student implements IChinese,IMath,IEnglish{
    public Student(){
        learnChinese();
        learnMath();
        learnEnglish();
    }
    @Override
    public void learnChinese() {
        System.out.println("学生要学习语文");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学生要学习英语");
    }

    @Override
    public void learnMath() {
        System.out.println("学生要学习数学");
    }

    public static void main(String[] args) {
        Student s = new Student();
//        s.learnChinese();
//        s.learnEnglish();
//        s.learnMath();
    }
}
