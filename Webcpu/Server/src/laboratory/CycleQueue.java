package laboratory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 永远不会满，但会出现空
// 本来，我不考虑阻塞问题
// 如果考虑，只需要考虑一种情况，空的时候，wait阻塞，放入新数据后，唤醒阻塞的reader即可
public class CycleQueue<T> {
    public T[] array;
    public volatile int size;
    public int frontIndex;
    public int rearIndex;
    private Lock lock = new ReentrantLock();

    CycleQueue(int capacity) {
        // 由于泛型无法直接定义数组
        // 所以定义成 Object[]，然后转型成 t[]
        array = (T[])new Object[capacity];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }

    /**
     * 放入一个新的数据，如果满了，则替换最老的一份数据
     * @param item
     */
    public void push(T item) {
        boolean isFull = size == array.length;  // 插入之前是否已经满了

        lock.lock();
        array[rearIndex] = item;    // 往 rear 下标处写入数据
        rearIndex = rearIndex + 1;  // rear 向后移动
        if (rearIndex >= array.length) {    // 如果移动后，rear 下标越界了
            rearIndex = 0;                  //  则 rear 回到最开始
        }

        if (isFull) { // 如果插入之前已经满了
            frontIndex = rearIndex; // 则 front 跟着 rear 走
        } else {
            // 如果没满，则 size++，否则，size 不动了（一直就是满着的）
            size++;
        }
        lock.unlock();
    }

    /**
     * 取出并删除掉最老的一份数据
     * @return
     * @throws RuntimeException 当队列为空时，抛出 RuntimeException 异常
     */
    public T pop() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }

        lock.lock();
        T item = array[frontIndex];
        frontIndex = (frontIndex++) % array.length; // f 向后移，在越界后循环回来
        size--;
        lock.unlock();

        return item;
    }

    public int size() {
        return size;
    }
}
