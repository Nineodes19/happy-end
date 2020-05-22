/**
 * @program:test_5.22
 * @author:Nine_odes
 * @description:
 * @create:2020-05-22 12:02
 **/
public class MyCircularQueue {

    private int front;//队头
    private int rear;//队尾 当前可以存在数据元素的下标
    private int[] elem;//数组
    public MyCircularQueue(int k){
        this.elem = new int[k + 1];
        this.front = 0;
        this.rear = 0;
    }


    //入队
    public boolean enQueue(int value){
        //1.判断队列是否为满
        //循环队列中，最多可存储队列长度-1个元素
        if(isFull()){
            return false;
        }
        //2.不满的话，存放在rear下标内存放结束后，rear向前一步
        this.elem[this.rear] = value;
        this.rear = (this.rear+1) % this.elem.length;

        return true;
    }

    public boolean deQueue(){
        //1.判断是否为空
        if(isEmpty()){
            return false;
        }
        this.front = (this.front +1) % this.elem.length;
        return true;
    }

    public int Front(){
        if(isEmpty()){
            return -1;
        }
        return this.elem[this.front];
    }

    //得到队尾元素
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int index = (this.rear == 0) ? this.elem.length - 1: this.rear - 1;
        return this.elem[index];
    }

    public boolean isEmpty(){
        if(this.front == this.rear){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if((this.rear+1) % this.elem.length == this.front){
            return true;
        }
        return false;
    }
}
