package c2stackqueues.queue;

import c1array.Array2;

/** 基于数组类实现的队列
 * @author Heroin X
 * @date 2019/8/14 10:32
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array2<E> queue;

    public ArrayQueue(){
        queue=new Array2<>();
    }

    public ArrayQueue(int capacity){
        queue=new Array2<>(capacity);
    }

    /**
     * 入栈
     * @param o
     */
    @Override
    public void enqueue(Object o) {
        queue.addLast((E) o);
    }

    //取出元素
    @Override
    public E dequeue() {
        return queue.removeFirst();
    }

    //查看队首的元素值
    @Override
    public E getFront() {
        return queue.getFirst();
    }

    @Override
    public int getSize() {
        return queue.getSize();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        res.append("Queue: front [");
        for (int i=0;i<queue.getSize();i++){
            res.append(queue.get(i));
            if (i!=queue.getSize()-1){
                res.append(", ");
            }
        }
        //防止多一个‘，’
        res.append("] tail");
        return res.toString();
    }
}
