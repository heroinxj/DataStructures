package c2stackqueues.stack;

/**
 * @author Heroin X
 * @date 2019/8/13 20:49
 */
public interface Stack<E> {
    /**
     * 顶端插入元素，进栈
     * @param e
     */
    void push(E e);

    /**
     * 删除顶端元素，出栈
     * @return
     */
    E pop();

    /**
     * 查顶端元素并返回值
     * @return
     */
    E peek();

    /**
     * 获取长度
     * @return
     */
    int getSize();

    /**
     * 判断是否为空
     * @return
     */
    boolean isEmpty();

}
