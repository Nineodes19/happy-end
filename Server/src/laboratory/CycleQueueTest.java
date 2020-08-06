package laboratory;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-08-01 09:58
 **/
public class CycleQueueTest {
    public static void main(String[] args) {
        CycleQueue<String> queue = new CycleQueue<>(5);
        Object[] array = queue.array;
//        System.out.println(array);
        assert  array != null;
        assert array.length == 5;
        queue.push("Hello");
        assert array[0].equals("Hello");
        assert array[1] == null;
        assert array[2] == null;
        assert array[3] == null;
        assert array[4] == null;
        assert queue.frontIndex == 0;
        assert queue.rearIndex == 1;
        assert queue.size == 1;

        queue.push("B");
        queue.push("C");
        queue.push("D");
        queue.push("E");

        assert queue.size == 5;
        assert array[1] == "B";
        assert array[2] == "C";
        assert array[3] == "D";
        assert array[4] == "E";
        assert queue.frontIndex == 0;
        assert queue.rearIndex == 0;

        queue.push("F");

        assert queue.size == 5;
        assert array[0] == "F";
        assert array[1] == "B";
        assert array[2] == "C";
        assert array[3] == "D";
        assert array[4] == "E";
        assert queue.frontIndex == 1;
        assert queue.rearIndex == 1;
//        if(queue.array == null){
//            throw new RuntimeException("初始化有问题");
//        }

//        if(queue.array.length != 5){
//            throw new RuntimeException("初始化有问题");
//        }
//        queue.push("A");
//        if(!queue.array[0].equals("A")){
//            throw new RuntimeException();
//        }
//        for(int i = 1; i < 5; i++){
//            if(queue.array[i] != null){
//                throw new RuntimeException();
//            }
//        }
    }
}
