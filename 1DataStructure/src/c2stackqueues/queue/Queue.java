package c2stackqueues.queue;

/**
 * @author Heroin X
 * @date 2019/8/14 10:31
 */
public interface Queue<E> {

    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();
}
