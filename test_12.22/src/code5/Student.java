package code5;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 20:18
 */
public class Student {
    private String name;
    private int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return String.format("Student(name: %s, score: %d)",name,score);
    }

    public static void main(String[] args){
//        Array<Student> arr = new Array<>();
//        arr.addLast(new Student("Alice",100));
//        arr.addLast(new Student("Bob",66));
//        arr.addLast(new Student("Charie",88));
//        System.out.println(arr);

        Array<Integer> arr = new Array<>(20);
        for(int i = 0; i < 10; i++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(2);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
