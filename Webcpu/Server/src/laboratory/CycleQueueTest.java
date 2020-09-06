package laboratory;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class CycleQueueTest {
    public static void main(String[] args) {
        CycleQueue<String> queue = new CycleQueue<>(5);
        Object[] array = queue.array;
        assert array != null;
        assert array.length == 5;

        queue.push("A");
        assert array[0].equals("A");
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

        assert array[0].equals("A");
        assert array[1].equals("B");
        assert array[2].equals("C");
        assert array[3].equals("D");
        assert array[4].equals("E");
        assert queue.frontIndex == 0;
        assert queue.rearIndex == 0;
        assert queue.size == 5;

        queue.push("F");

        assert array[0].equals("F");
        assert array[1].equals("B");
        assert array[2].equals("C");
        assert array[3].equals("D");
        assert array[4].equals("E");
        assert queue.frontIndex == 1;
        assert queue.rearIndex == 1;
        assert queue.size == 5;

        queue.push("G");
        queue.push("H");
        queue.push("I");
        queue.push("J");
        queue.push("K");
        queue.push("L");
        queue.push("M");

        assert array[0].equals("K");
        assert array[1].equals("L");
        assert array[2].equals("M");
        assert array[3].equals("I");
        assert array[4].equals("J");
        assert queue.frontIndex == 3;
        assert queue.rearIndex == 3;
        assert queue.size == 5;
    }
}
